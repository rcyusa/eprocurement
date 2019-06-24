import { Moment } from 'moment';
import { ILot } from 'app/shared/model/lot.model';

export interface ITender {
    id?: number;
    tenderRefNumber?: string;
    tenderRefName?: string;
    tenderPEName?: string;
    tenderPECode?: string;
    tenderType?: string;
    tenderMethod?: string;
    tenderOnOff?: string;
    tenderPublicDate?: Moment;
    tenderReceiveDate?: Moment;
    tenderDeadLineDate?: Moment;
    tenderOpenDate?: Moment;
    lotByTenders?: ILot[];
}

export class Tender implements ITender {
    constructor(
        public id?: number,
        public tenderRefNumber?: string,
        public tenderRefName?: string,
        public tenderPEName?: string,
        public tenderPECode?: string,
        public tenderType?: string,
        public tenderMethod?: string,
        public tenderOnOff?: string,
        public tenderPublicDate?: Moment,
        public tenderReceiveDate?: Moment,
        public tenderDeadLineDate?: Moment,
        public tenderOpenDate?: Moment,
        public lotByTenders?: ILot[]
    ) {}
}
