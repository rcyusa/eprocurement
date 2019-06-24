///<reference path="../../shared/model/tender.model.ts"/>
import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpErrorResponse, HttpHeaders, HttpResponse } from '@angular/common/http';
import { ITender } from 'app/shared/model/tender.model';
//import {TenderService} from './tender.service';
import { ILot, Lot } from '../../shared/model/lot.model';
import { LotService } from '../lot/lot.service';
import { ContractService } from './contract.service';
import { Contract } from '../../shared/model/contract.model';
import { Client } from '../../shared/model/client.model';
import { ClientService } from '../client/client.service';

@Component({
    selector: 'jhi-contract-consult',
    templateUrl: './contract-consult.component.html'
})
export class ContractConsultComponent implements OnInit {
    //newContract: Contract;
    isSaving: boolean;
    item: any;
    refNumber: String = '';
    client: any;

    constructor(protected contractService: ContractService, protected lotService: LotService, protected clientService: ClientService) {}

    ngOnInit() {}

    search() {
        this.contractService.getContract(this.refNumber).subscribe((res: HttpResponse<any[]>) => {
            this.item = res.body;
            console.log(this.item);
        });
    }

    previousState() {
        window.history.back();
    }

    saveContract(contract: any) {
        this.isSaving = true;

        const newContract: Contract = <Contract>{
            contractNumber: contract['contractNumber'],
            contractSerialNumber: contract['contractSerialNumber'],
            contractName: contract['contractName'],
            contractAmount: contract['contractAmount'],
            contractAmountCharacter: contract['contractAmountCharacter'],
            contractCurrency: contract['currency'],
            contractTotalTaxeAmount: contract['totalTaxeAmount'],
            contractTotalTaxeAmountCharacter: contract['totalTaxeAmountCharacter'],
            contractVatAmount: contract['vatAmount'],
            contractVatRate: contract['vatRate'],
            contractWhtAmount: contract['whtAmount'],
            contractWhtRate: contract['whtRate'],
            contractDurationYear: contract['contractDurationYear'],
            contractDurationMonth: contract['contractDurationMonth'],
            contractDate: contract['contractDate'],
            contractEffectiveDate: contract['effectiveDate'],
            contractWarantyYear: contract['warantyYear'],
            contractWarantyMonth: contract['warantyMonth'],
            contractPenaltyDelayRate: contract['penaltyDelayRate'],
            contractPenaltyLimitRate: contract['penaltyLimitRate'],
            contractManagerName: contract['contractManagerName'],
            contractManagerPosition: contract['contractManagerPosition'],
            contractSupervisingFirm: contract['supervisingFirm'],
            contractPETINNumber: contract['petinnumber'],
            contractPEName: contract['pename'],
            contractPERepresentativeName: contract['perepresentativeName'],
            contractPETELNumber: contract['cellPhoneNumber'],
            contractPEAddress: contract['peaddress'],
            contractTenderRefNumber: contract['tenderRefNumber']
        };
        this.subscribeToSaveResponse(this.contractService.create(newContract));

        const lot: Lot = <Lot>{
            id: null,
            lotName: contract['lotInfo'][0]['lotName'],
            lotNumber: contract['lotInfo'][0]['lotNumber'],
            lotDesc: contract['lotInfo'][0]['lotName'],
            lotAmount: contract['lotInfo'][0]['lotAmount'],
            lotRefNumber: contract['contractNumber'],
            lotCurrancy: contract['currency']
        };
        console.log(contract['contractNumber']);
        console.log(contract['lotInfo'][0]['lotName']);

        this.subscribeToSaveResponse(this.lotService.create(lot));

        const clientEmp: Client = <Client>{
            clientName: contract['supplierName'],
            clientTINNumber: contract['supplierTINNumber'],
            clientAddress: contract['address'],
            clientPoBox: contract['poBox'],
            clientCellPhoneNumber: contract['cellPhoneNumber'],
            clientTelNumber: contract['telNumber'],
            clientEmailAddress: contract['eMailAddress']
        };
        console.log('TIN NuMBEr:' + contract['supplierTINNumber']);

        this.clientService.clientByTINNumber(contract['supplierTINNumber']).subscribe((res: HttpResponse<any>) => {
            this.client = res.body;
            console.log(this.client);

            if (this.client === null) {
                this.subscribeToSaveResponse(this.clientService.create(clientEmp));
            } else {
                console.log('TEST_2:' + this.client.clientTINNumber);
            }
        });
    }

    protected subscribeToSaveResponse(result: Observable<HttpResponse<ILot>>) {
        result.subscribe((res: HttpResponse<ILot>) => this.onSaveSuccess(), (res: HttpErrorResponse) => this.onSaveError());
    }

    protected onSaveSuccess() {
        this.isSaving = false;
        this.previousState();
    }

    protected onSaveError() {
        this.isSaving = false;
    }
}
