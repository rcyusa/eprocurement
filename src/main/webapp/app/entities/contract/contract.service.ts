import { Injectable } from '@angular/core';
import { HttpClient, HttpResponse } from '@angular/common/http';
import { Observable } from 'rxjs';

import { SERVER_API_URL } from 'app/app.constants';
import { IContract } from 'app/shared/model/contract.model';
import { createRequestOption } from '../../shared/util/request-util';

type EntityResponseType = HttpResponse<IContract>;
type EntityArrayResponseType = HttpResponse<IContract[]>;

@Injectable({ providedIn: 'root' })
export class ContractService {
    public resourceUrl = SERVER_API_URL + 'api/contracts';
    public resourceUrl1 = SERVER_API_URL + 'api/consultContract?contractRefNumber=';

    constructor(protected http: HttpClient) {}

    create(contract: IContract): Observable<EntityResponseType> {
        return this.http.post<IContract>(this.resourceUrl, contract, { observe: 'response' });
    }

    update(contract: IContract): Observable<EntityResponseType> {
        return this.http.put<IContract>(this.resourceUrl, contract, { observe: 'response' });
    }

    find(id: number): Observable<EntityResponseType> {
        return this.http.get<IContract>(`${this.resourceUrl}/${id}`, { observe: 'response' });
    }

    query(req?: any): Observable<EntityArrayResponseType> {
        const options = createRequestOption(req);
        return this.http.get<IContract[]>(this.resourceUrl, { params: options, observe: 'response' });
    }

    delete(id: number): Observable<HttpResponse<any>> {
        return this.http.delete<any>(`${this.resourceUrl}/${id}`, { observe: 'response' });
    }

    getContract(contractRefNumber: String): Observable<EntityArrayResponseType> {
        return this.http.get<any[]>(this.resourceUrl1 + contractRefNumber, { observe: 'response' });
    }
}
