///<reference path="../../shared/model/tender.model.ts"/>
import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpErrorResponse, HttpHeaders, HttpResponse } from '@angular/common/http';
import { ITender } from 'app/shared/model/tender.model';
import { TenderService } from './tender.service';
import { ILot, Lot } from '../../shared/model/lot.model';
import { LotService } from '../lot/lot.service';

@Component({
    selector: 'jhi-tender-consul',
    templateUrl: './tender-consul.component.html'
})
export class TenderConsulComponent implements OnInit {
    isSaving: boolean;
    item: any;
    refNumber: String = '';

    constructor(protected tenderService: TenderService, protected lotService: LotService) {}

    ngOnInit() {}
    previousState() {
        window.history.back();
    }
    search() {
        this.tenderService.getTender(this.refNumber).subscribe((res: HttpResponse<any[]>) => {
            this.item = res.body;
            console.log(this.item);
        });
    }

    save_lot(lotNumber: string, lotName: string, lotDesc: string, lotAmount: number, lotCurrancy: string, lotRefNumber: string) {
        this.isSaving = true;
        const lot: Lot = <Lot>{
            id: null,
            lotName: lotNumber,
            lotNumber: lotName,
            lotDesc: lotDesc,
            lotAmount: lotAmount,
            lotRefNumber: lotRefNumber,
            lotCurrancy: lotCurrancy
        };

        console.log(lotAmount, lotCurrancy, lotRefNumber);
        this.subscribeToSaveResponse(this.lotService.create(lot));
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
