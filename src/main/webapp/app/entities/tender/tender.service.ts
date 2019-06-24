import { Injectable } from '@angular/core';
import { HttpClient, HttpResponse } from '@angular/common/http';
import { Observable } from 'rxjs';
import * as moment from 'moment';
import { DATE_FORMAT } from 'app/shared/constants/input.constants';
import { map } from 'rxjs/operators';

import { SERVER_API_URL } from 'app/app.constants';
import { ITender } from 'app/shared/model/tender.model';
import { createRequestOption } from '../../shared/util/request-util';

type EntityResponseType = HttpResponse<ITender>;
type EntityArrayResponseType = HttpResponse<ITender[]>;

@Injectable({ providedIn: 'root' })
export class TenderService {
    public resourceUrl = SERVER_API_URL + 'api/tenders';
    public resourceUrl1 = SERVER_API_URL + 'api/consulTender?TenderRefNumber=';

    constructor(protected http: HttpClient) {}

    create(tender: ITender): Observable<EntityResponseType> {
        const copy = this.convertDateFromClient(tender);
        return this.http
            .post<ITender>(this.resourceUrl, copy, { observe: 'response' })
            .pipe(map((res: EntityResponseType) => this.convertDateFromServer(res)));
    }

    update(tender: ITender): Observable<EntityResponseType> {
        const copy = this.convertDateFromClient(tender);
        return this.http
            .put<ITender>(this.resourceUrl, copy, { observe: 'response' })
            .pipe(map((res: EntityResponseType) => this.convertDateFromServer(res)));
    }

    find(id: number): Observable<EntityResponseType> {
        return this.http
            .get<ITender>(`${this.resourceUrl}/${id}`, { observe: 'response' })
            .pipe(map((res: EntityResponseType) => this.convertDateFromServer(res)));
    }

    query(req?: any): Observable<EntityArrayResponseType> {
        const options = createRequestOption(req);
        return this.http
            .get<ITender[]>(this.resourceUrl, { params: options, observe: 'response' })
            .pipe(map((res: EntityArrayResponseType) => this.convertDateArrayFromServer(res)));
    }

    delete(id: number): Observable<HttpResponse<any>> {
        return this.http.delete<any>(`${this.resourceUrl}/${id}`, { observe: 'response' });
    }

    protected convertDateFromClient(tender: ITender): ITender {
        const copy: ITender = Object.assign({}, tender, {
            tenderPublicDate:
                tender.tenderPublicDate != null && tender.tenderPublicDate.isValid() ? tender.tenderPublicDate.format(DATE_FORMAT) : null,
            tenderReceiveDate:
                tender.tenderReceiveDate != null && tender.tenderReceiveDate.isValid()
                    ? tender.tenderReceiveDate.format(DATE_FORMAT)
                    : null,
            tenderDeadLineDate:
                tender.tenderDeadLineDate != null && tender.tenderDeadLineDate.isValid()
                    ? tender.tenderDeadLineDate.format(DATE_FORMAT)
                    : null,
            tenderOpenDate:
                tender.tenderOpenDate != null && tender.tenderOpenDate.isValid() ? tender.tenderOpenDate.format(DATE_FORMAT) : null
        });
        return copy;
    }

    protected convertDateFromServer(res: EntityResponseType): EntityResponseType {
        if (res.body) {
            res.body.tenderPublicDate = res.body.tenderPublicDate != null ? moment(res.body.tenderPublicDate) : null;
            res.body.tenderReceiveDate = res.body.tenderReceiveDate != null ? moment(res.body.tenderReceiveDate) : null;
            res.body.tenderDeadLineDate = res.body.tenderDeadLineDate != null ? moment(res.body.tenderDeadLineDate) : null;
            res.body.tenderOpenDate = res.body.tenderOpenDate != null ? moment(res.body.tenderOpenDate) : null;
        }
        return res;
    }

    protected convertDateArrayFromServer(res: EntityArrayResponseType): EntityArrayResponseType {
        if (res.body) {
            res.body.forEach((tender: ITender) => {
                tender.tenderPublicDate = tender.tenderPublicDate != null ? moment(tender.tenderPublicDate) : null;
                tender.tenderReceiveDate = tender.tenderReceiveDate != null ? moment(tender.tenderReceiveDate) : null;
                tender.tenderDeadLineDate = tender.tenderDeadLineDate != null ? moment(tender.tenderDeadLineDate) : null;
                tender.tenderOpenDate = tender.tenderOpenDate != null ? moment(tender.tenderOpenDate) : null;
            });
        }
        return res;
    }

    getTender(refNumber: String): Observable<EntityArrayResponseType> {
        return this.http.get<any[]>(this.resourceUrl1 + refNumber, { observe: 'response' });
    }
}
