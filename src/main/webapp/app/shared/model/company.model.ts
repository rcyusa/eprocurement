export interface ICompany {
    id?: number;
    companyUserName?: string;
    companyPassWord?: string;
    companyTINnumber?: string;
    companyEmail?: string;
    companyFax?: string;
    companyPhone?: string;
}

export class Company implements ICompany {
    constructor(
        public id?: number,
        public companyUserName?: string,
        public companyPassWord?: string,
        public companyTINnumber?: string,
        public companyEmail?: string,
        public companyFax?: string,
        public companyPhone?: string
    ) {}
}
