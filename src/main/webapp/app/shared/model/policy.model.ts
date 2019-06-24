import { Moment } from 'moment';

export interface IPolicy {
    id?: number;
    policyNumber?: string;
    policyType?: string;
    policyAmount?: number;
    policyAmountChar?: string;
    policyAmountCurrancy?: string;
    primeAmount?: number;
    policyOperationDate?: Moment;
    policyStartDate?: Moment;
    policyExpirationDate?: Moment;
    policyStatus?: string;
    policyComment?: string;
    lotOnPolicyId?: number;
    clientId?: number;
    userExtraId?: number;
}

export class Policy implements IPolicy {
    constructor(
        public id?: number,
        public policyNumber?: string,
        public policyType?: string,
        public policyAmount?: number,
        public policyAmountChar?: string,
        public policyAmountCurrancy?: string,
        public primeAmount?: number,
        public policyOperationDate?: Moment,
        public policyStartDate?: Moment,
        public policyExpirationDate?: Moment,
        public policyStatus?: string,
        public policyComment?: string,
        public lotOnPolicyId?: number,
        public clientId?: number,
        public userExtraId?: number
    ) {}
}
