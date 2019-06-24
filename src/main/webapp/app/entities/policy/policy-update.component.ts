import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { HttpResponse, HttpErrorResponse } from '@angular/common/http';
import { Observable } from 'rxjs';
import { filter, map } from 'rxjs/operators';
import * as moment from 'moment';
import { JhiAlertService } from 'ng-jhipster';
import { IPolicy } from 'app/shared/model/policy.model';
import { PolicyService } from './policy.service';
import { ILot } from 'app/shared/model/lot.model';
import { IClient } from 'app/shared/model/client.model';
import { IUserExtra } from 'app/shared/model/user-extra.model';
import { LotService } from '../lot/lot.service';
import { ClientService } from '../client/client.service';
import { UserExtraService } from '../user-extra/user-extra.service';
import { AccountService } from '../../core/auth/account.service';

@Component({
    selector: 'jhi-policy-update',
    templateUrl: './policy-update.component.html'
})
export class PolicyUpdateComponent implements OnInit {
    currentAccount: any;
    policy: IPolicy;
    isSaving: boolean;
    settingsAccount: any;
    lotonpolicies: ILot[];
    lot: ILot;
    clients: IClient[];

    userextras: IUserExtra[];
    policyOperationDateDp: any;
    policyStartDateDp: any;
    policyExpirationDateDp: any;

    constructor(
        protected jhiAlertService: JhiAlertService,
        protected policyService: PolicyService,
        protected lotService: LotService,
        protected accountService: AccountService,
        private user_accountService: AccountService,
        protected clientService: ClientService,
        protected userExtraService: UserExtraService,
        protected activatedRoute: ActivatedRoute
    ) {}

    ngOnInit() {
        this.isSaving = false;
        this.activatedRoute.data.subscribe(({ policy }) => {
            this.policy = policy;
        });
        this.lotService
            .query({ filter: 'policy-is-null' })
            .pipe(
                filter((mayBeOk: HttpResponse<ILot[]>) => mayBeOk.ok),
                map((response: HttpResponse<ILot[]>) => response.body)
            )
            .subscribe(
                (res: ILot[]) => {
                    if (!this.policy.lotOnPolicyId) {
                        this.lotonpolicies = res;
                    } else {
                        this.lotService
                            .find(this.policy.lotOnPolicyId)
                            .pipe(
                                filter((subResMayBeOk: HttpResponse<ILot>) => subResMayBeOk.ok),
                                map((subResponse: HttpResponse<ILot>) => subResponse.body)
                            )
                            .subscribe(
                                (subRes: ILot) => (this.lotonpolicies = [subRes].concat(res)),
                                (subRes: HttpErrorResponse) => this.onError(subRes.message)
                            );
                    }
                },
                (res: HttpErrorResponse) => this.onError(res.message)
            );
        this.clientService
            .query()
            .pipe(
                filter((mayBeOk: HttpResponse<IClient[]>) => mayBeOk.ok),
                map((response: HttpResponse<IClient[]>) => response.body)
            )
            .subscribe((res: IClient[]) => (this.clients = res), (res: HttpErrorResponse) => this.onError(res.message));
        this.userExtraService
            .query()
            .pipe(
                filter((mayBeOk: HttpResponse<IUserExtra[]>) => mayBeOk.ok),
                map((response: HttpResponse<IUserExtra[]>) => response.body)
            )
            .subscribe((res: IUserExtra[]) => (this.userextras = res), (res: HttpErrorResponse) => this.onError(res.message));

        this.user_accountService.identity().then(account => {
            this.settingsAccount = this.copyAccount(account);
            console.log('TEST:' + this.settingsAccount.login);
        });
    }

    previousState() {
        window.history.back();
    }

    save() {
        this.isSaving = true;
        if (this.policy.id !== undefined) {
            this.subscribeToSaveResponse(this.policyService.update(this.policy));
        } else {
            this.subscribeToSaveResponse(this.policyService.create(this.policy));
        }
    }

    protected subscribeToSaveResponse(result: Observable<HttpResponse<IPolicy>>) {
        result.subscribe((res: HttpResponse<IPolicy>) => this.onSaveSuccess(), (res: HttpErrorResponse) => this.onSaveError());
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

    trackLotById(index: number, item: ILot) {
        return item.id;
    }

    trackClientById(index: number, item: IClient) {
        return item.id;
    }

    trackUserExtraById(index: number, item: IUserExtra) {
        return item.id;
    }

    get_Detail() {
        const converter = require('number-to-words');
        this.lotService.find(this.policy.lotOnPolicyId).subscribe((res: HttpResponse<ILot>) => {
            this.lot = res.body;
            this.policy.policyAmount = this.lot.lotAmount;
            this.policy.policyAmountChar = converter.toWords(this.policy.policyAmount);
            this.policy.policyAmountCurrancy = this.lot.lotCurrancy;
            this.policy.policyOperationDate = moment();
            if (this.policy.policyType === 'Bid') {
                this.policy.policyStartDate = moment();
                this.policy.policyExpirationDate = moment(this.policy.policyStartDate)
                    .add(4, 'month')
                    .subtract(1, 'day');
            }
            console.log(this.lot);
        });
    }

    copyAccount(account) {
        return {
            activated: account.activated,
            email: account.email,
            firstName: account.firstName,
            langKey: account.langKey,
            lastName: account.lastName,
            login: account.login,
            imageUrl: account.imageUrl
        };
    }
}
