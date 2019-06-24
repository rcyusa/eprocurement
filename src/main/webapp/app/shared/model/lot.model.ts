export interface ILot {
    id?: number;
    lotName?: string;
    lotNumber?: string;
    lotDesc?: string;
    lotAmount?: number;
    lotCurrancy?: string;
    lotRefNumber?: string;
    tenderId?: number;
    contractId?: number;
}

export class Lot implements ILot {
    constructor(
        public id?: number,
        public lotName?: string,
        public lotNumber?: string,
        public lotDesc?: string,
        public lotAmount?: number,
        public lotCurrancy?: string,
        public lotRefNumber?: string,
        public tenderId?: number,
        public contractId?: number
    ) {}
}
