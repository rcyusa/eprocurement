import { IPolicy } from 'app/shared/model/policy.model';

export interface IUserExtra {
    id?: number;
    phone?: string;
    branchId?: number;
    userId?: number;
    policyByUsers?: IPolicy[];
}

export class UserExtra implements IUserExtra {
    constructor(
        public id?: number,
        public phone?: string,
        public branchId?: number,
        public userId?: number,
        public policyByUsers?: IPolicy[]
    ) {}
}
