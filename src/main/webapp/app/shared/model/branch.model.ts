import { IUserExtra } from 'app/shared/model/user-extra.model';

export interface IBranch {
    id?: number;
    branchName?: string;
    branchAddress?: string;
    branchManager?: string;
    branchPhone?: string;
    branchFax?: string;
    branchEmail?: string;
    userByBranches?: IUserExtra[];
}

export class Branch implements IBranch {
    constructor(
        public id?: number,
        public branchName?: string,
        public branchAddress?: string,
        public branchManager?: string,
        public branchPhone?: string,
        public branchFax?: string,
        public branchEmail?: string,
        public userByBranches?: IUserExtra[]
    ) {}
}
