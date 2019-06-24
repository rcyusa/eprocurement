import { Injectable } from '@angular/core';
import { HttpClient, HttpResponse } from '@angular/common/http';
import { Observable } from 'rxjs';
import * as moment from 'moment';
import { DATE_FORMAT } from 'app/shared/constants/input.constants';
import { map } from 'rxjs/operators';

import { SERVER_API_URL } from 'app/app.constants';
import { createRequestOption } from 'app/shared';
import { IPolicy } from 'app/shared/model/policy.model';

type EntityResponseType = HttpResponse<IPolicy>;
type EntityArrayResponseType = HttpResponse<IPolicy[]>;

@Injectable({ providedIn: 'root' })
export class PolicyService {
    public resourceUrl = SERVER_API_URL + 'api/policies';
    public resourceUrl1 = SERVER_API_URL + 'api/sendBid';
    public resourceUrl2 = SERVER_API_URL + 'api/sendAdvanced';
    public resourceUrl3 = SERVER_API_URL + 'api/sendPerformance';

    constructor(protected http: HttpClient) {}

    create(policy: IPolicy): Observable<EntityResponseType> {
        const copy = this.convertDateFromClient(policy);
        return this.http
            .post<IPolicy>(this.resourceUrl, copy, { observe: 'response' })
            .pipe(map((res: EntityResponseType) => this.convertDateFromServer(res)));
    }

    sendBid(id: number): Observable<EntityResponseType> {
        return this.http
            .get<any>(`${this.resourceUrl1}/${id}`, { observe: 'response' })
            .pipe(map((res: EntityResponseType) => this.convertDateFromServer(res)));
    }
    sendAdvanced(id: number): Observable<EntityResponseType> {
        return this.http
            .get<any>(`${this.resourceUrl2}/${id}`, { observe: 'response' })
            .pipe(map((res: EntityResponseType) => this.convertDateFromServer(res)));
    }
    sendPerformance(id: number): Observable<EntityResponseType> {
        return this.http
            .get<any>(`${this.resourceUrl3}/${id}`, { observe: 'response' })
            .pipe(map((res: EntityResponseType) => this.convertDateFromServer(res)));
    }

    update(policy: IPolicy): Observable<EntityResponseType> {
        const copy = this.convertDateFromClient(policy);
        return this.http
            .put<IPolicy>(this.resourceUrl, copy, { observe: 'response' })
            .pipe(map((res: EntityResponseType) => this.convertDateFromServer(res)));
    }

    find(id: number): Observable<EntityResponseType> {
        return this.http
            .get<IPolicy>(`${this.resourceUrl}/${id}`, { observe: 'response' })
            .pipe(map((res: EntityResponseType) => this.convertDateFromServer(res)));
    }

    query(req?: any): Observable<EntityArrayResponseType> {
        const options = createRequestOption(req);
        return this.http
            .get<IPolicy[]>(this.resourceUrl, { params: options, observe: 'response' })
            .pipe(map((res: EntityArrayResponseType) => this.convertDateArrayFromServer(res)));
    }

    delete(id: number): Observable<HttpResponse<any>> {
        return this.http.delete<any>(`${this.resourceUrl}/${id}`, { observe: 'response' });
    }

    protected convertDateFromClient(policy: IPolicy): IPolicy {
        const copy: IPolicy = Object.assign({}, policy, {
            policyOperationDate:
                policy.policyOperationDate != null && policy.policyOperationDate.isValid()
                    ? policy.policyOperationDate.format(DATE_FORMAT)
                    : null,
            policyStartDate:
                policy.policyStartDate != null && policy.policyStartDate.isValid() ? policy.policyStartDate.format(DATE_FORMAT) : null,
            policyExpirationDate:
                policy.policyExpirationDate != null && policy.policyExpirationDate.isValid()
                    ? policy.policyExpirationDate.format(DATE_FORMAT)
                    : null
        });
        return copy;
    }

    protected convertDateFromServer(res: EntityResponseType): EntityResponseType {
        if (res.body) {
            res.body.policyOperationDate = res.body.policyOperationDate != null ? moment(res.body.policyOperationDate) : null;
            res.body.policyStartDate = res.body.policyStartDate != null ? moment(res.body.policyStartDate) : null;
            res.body.policyExpirationDate = res.body.policyExpirationDate != null ? moment(res.body.policyExpirationDate) : null;
        }
        return res;
    }

    protected convertDateArrayFromServer(res: EntityArrayResponseType): EntityArrayResponseType {
        if (res.body) {
            res.body.forEach((policy: IPolicy) => {
                policy.policyOperationDate = policy.policyOperationDate != null ? moment(policy.policyOperationDate) : null;
                policy.policyStartDate = policy.policyStartDate != null ? moment(policy.policyStartDate) : null;
                policy.policyExpirationDate = policy.policyExpirationDate != null ? moment(policy.policyExpirationDate) : null;
            });
        }
        return res;
    }
}
