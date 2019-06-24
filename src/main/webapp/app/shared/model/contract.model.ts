import { ILot } from 'app/shared/model/lot.model';

export interface IContract {
    id?: number;
    contractNumber?: string;
    contractSerialNumber?: string;
    contractName?: string;
    contractAmount?: string;
    contractAmountCharacter?: string;
    contractCurrency?: string;
    contractTotalTaxeAmount?: string;
    contractTotalTaxeAmountCharacter?: string;
    contractVatAmount?: string;
    contractVatRate?: string;
    contractWhtAmount?: string;
    contractWhtRate?: string;
    contractDurationYear?: string;
    contractDurationMonth?: string;
    contractDate?: string;
    contractEffectiveDate?: string;
    contractWarantyYear?: string;
    contractWarantyMonth?: string;
    contractPenaltyDelayRate?: string;
    contractPenaltyLimitRate?: string;
    contractManagerName?: string;
    contractManagerPosition?: string;
    contractSupervisingFirm?: string;
    contractPETINNumber?: string;
    contractPEName?: string;
    contractPERepresentativeName?: string;
    contractPETELNumber?: string;
    contractPEAddress?: string;
    contractTenderRefNumber?: string;
    lotByContracts?: ILot[];
}

export class Contract implements IContract {
    constructor(
        public id?: number,
        public contractNumber?: string,
        public contractSerialNumber?: string,
        public contractName?: string,
        public contractAmount?: string,
        public contractAmountCharacter?: string,
        public contractCurrency?: string,
        public contractTotalTaxeAmount?: string,
        public contractTotalTaxeAmountCharacter?: string,
        public contractVatAmount?: string,
        public contractVatRate?: string,
        public contractWhtAmount?: string,
        public contractWhtRate?: string,
        public contractDurationYear?: string,
        public contractDurationMonth?: string,
        public contractDate?: string,
        public contractEffectiveDate?: string,
        public contractWarantyYear?: string,
        public contractWarantyMonth?: string,
        public contractPenaltyDelayRate?: string,
        public contractPenaltyLimitRate?: string,
        public contractManagerName?: string,
        public contractManagerPosition?: string,
        public contractSupervisingFirm?: string,
        public contractPETINNumber?: string,
        public contractPEName?: string,
        public contractPERepresentativeName?: string,
        public contractPETELNumber?: string,
        public contractPEAddress?: string,
        public contractTenderRefNumber?: string,
        public lotByContracts?: ILot[]
    ) {}
}
