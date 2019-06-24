import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { HttpResponse, HttpErrorResponse } from '@angular/common/http';
import { Observable } from 'rxjs';
import { filter, map } from 'rxjs/operators';
import { JhiAlertService } from 'ng-jhipster';
import { ILot } from 'app/shared/model/lot.model';
import { LotService } from './lot.service';
import { ITender } from 'app/shared/model/tender.model';
import { IContract } from 'app/shared/model/contract.model';
import { ContractService } from '../contract/contract.service';
import { TenderService } from '../tender/tender.service';

@Component({
    selector: 'jhi-lot-update',
    templateUrl: './lot-update.component.html'
})
export class LotUpdateComponent implements OnInit {
    lot: ILot;
    isSaving: boolean;
    tenders: ITender[];
    contracts: IContract[];

    constructor(
        protected jhiAlertService: JhiAlertService,
        protected lotService: LotService,
        protected tenderService: TenderService,
        protected contractService: ContractService,
        protected activatedRoute: ActivatedRoute
    ) {}

    ngOnInit() {
        this.isSaving = false;
        this.activatedRoute.data.subscribe(({ lot }) => {
            this.lot = lot;
        });
        this.tenderService
            .query()
            .pipe(
                filter((mayBeOk: HttpResponse<ITender[]>) => mayBeOk.ok),
                map((response: HttpResponse<ITender[]>) => response.body)
            )
            .subscribe((res: ITender[]) => (this.tenders = res), (res: HttpErrorResponse) => this.onError(res.message));
        this.contractService
            .query()
            .pipe(
                filter((mayBeOk: HttpResponse<IContract[]>) => mayBeOk.ok),
                map((response: HttpResponse<IContract[]>) => response.body)
            )
            .subscribe((res: IContract[]) => (this.contracts = res), (res: HttpErrorResponse) => this.onError(res.message));
    }

    previousState() {
        window.history.back();
    }

    save() {
        this.isSaving = true;
        if (this.lot.id !== undefined) {
            this.subscribeToSaveResponse(this.lotService.update(this.lot));
        } else {
            this.subscribeToSaveResponse(this.lotService.create(this.lot));
        }
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

    protected onError(errorMessage: string) {
        this.jhiAlertService.error(errorMessage, null, null);
    }

    trackTenderById(index: number, item: ITender) {
        return item.id;
    }

    trackContractById(index: number, item: IContract) {
        return item.id;
    }
}
