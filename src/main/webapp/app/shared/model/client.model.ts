import { IPolicy } from 'app/shared/model/policy.model';

export interface IClient {
    id?: number;
    clientName?: string;
    clientTINNumber?: string;
    clientAddress?: string;
    clientPoBox?: string;
    clientCellPhoneNumber?: string;
    clientTelNumber?: string;
    clientEmailAddress?: string;
    policyByClients?: IPolicy[];
}

export class Client implements IClient {
    constructor(
        public id?: number,
        public clientName?: string,
        public clientTINNumber?: string,
        public clientAddress?: string,
        public clientPoBox?: string,
        public clientCellPhoneNumber?: string,
        public clientTelNumber?: string,
        public clientEmailAddress?: string,
        public policyByClients?: IPolicy[]
    ) {}
}
