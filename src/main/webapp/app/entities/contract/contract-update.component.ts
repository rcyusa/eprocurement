import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { HttpResponse, HttpErrorResponse } from '@angular/common/http';
import { Observable } from 'rxjs';
import { filter, map } from 'rxjs/operators';
import { IContract } from 'app/shared/model/contract.model';
import { ContractService } from './contract.service';

@Component({
    selector: 'jhi-contract-update',
    templateUrl: './contract-update.component.html'
})
export class ContractUpdateComponent implements OnInit {
    contract: IContract;
    isSaving: boolean;

    constructor(protected contractService: ContractService, protected activatedRoute: ActivatedRoute) {}

    ngOnInit() {
        this.isSaving = false;
        this.activatedRoute.data.subscribe(({ contract }) => {
            this.contract = contract;
        });
    }

    previousState() {
        window.history.back();
    }

    save() {
        this.isSaving = true;
        if (this.contract.id !== undefined) {
            this.subscribeToSaveResponse(this.contractService.update(this.contract));
        } else {
            this.subscribeToSaveResponse(this.contractService.create(this.contract));
        }
    }

    protected subscribeToSaveResponse(result: Observable<HttpResponse<IContract>>) {
        result.subscribe((res: HttpResponse<IContract>) => this.onSaveSuccess(), (res: HttpErrorResponse) => this.onSaveError());
    }

    protected onSaveSuccess() {
        this.isSaving = false;
        this.previousState();
    }

    protected onSaveError() {
        this.isSaving = false;
    }
}
