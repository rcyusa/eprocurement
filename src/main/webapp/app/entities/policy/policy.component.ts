import { Component, OnInit, OnDestroy } from '@angular/core';
import { HttpErrorResponse, HttpHeaders, HttpResponse } from '@angular/common/http';
import { ActivatedRoute, Router } from '@angular/router';
import { Subscription } from 'rxjs';
import { filter, map } from 'rxjs/operators';
import { JhiEventManager, JhiParseLinks, JhiAlertService } from 'ng-jhipster';

import { IPolicy } from 'app/shared/model/policy.model';
import { AccountService } from '../../core/auth/account.service';

import { ITEMS_PER_PAGE } from '../../shared/constants/pagination.constants';
import { PolicyService } from './policy.service';

@Component({
    selector: 'jhi-policy',
    templateUrl: './policy.component.html'
})
export class PolicyComponent implements OnInit, OnDestroy {
    currentAccount: any;
    policies: IPolicy[];
    error: any;
    success: any;
    eventSubscriber: Subscription;
    routeData: any;
    links: any;
    totalItems: any;
    itemsPerPage: any;
    page: any;
    predicate: any;
    previousPage: any;
    reverse: any;
    message: any;

    constructor(
        protected policyService: PolicyService,
        protected parseLinks: JhiParseLinks,
        protected jhiAlertService: JhiAlertService,
        protected accountService: AccountService,
        protected activatedRoute: ActivatedRoute,
        protected router: Router,
        protected eventManager: JhiEventManager
    ) {
        this.itemsPerPage = ITEMS_PER_PAGE;
        this.routeData = this.activatedRoute.data.subscribe(data => {
            this.page = data.pagingParams.page;
            this.previousPage = data.pagingParams.page;
            this.reverse = data.pagingParams.ascending;
            this.predicate = data.pagingParams.predicate;
        });
    }

    loadAll() {
        this.policyService
            .query({
                page: this.page - 1,
                size: this.itemsPerPage,
                sort: this.sort()
            })
            .subscribe(
                (res: HttpResponse<IPolicy[]>) => this.paginatePolicies(res.body, res.headers),
                (res: HttpErrorResponse) => this.onError(res.message)
            );
    }

    loadPage(page: number) {
        if (page !== this.previousPage) {
            this.previousPage = page;
            this.transition();
        }
    }

    transition() {
        this.router.navigate(['/policy'], {
            queryParams: {
                page: this.page,
                size: this.itemsPerPage,
                sort: this.predicate + ',' + (this.reverse ? 'asc' : 'desc')
            }
        });
        this.loadAll();
    }

    clear() {
        this.page = 0;
        this.router.navigate([
            '/policy',
            {
                page: this.page,
                sort: this.predicate + ',' + (this.reverse ? 'asc' : 'desc')
            }
        ]);
        this.loadAll();
    }

    ngOnInit() {
        this.loadAll();
        this.accountService.identity().then(account => {
            this.currentAccount = account;
        });
        this.registerChangeInPolicies();
    }

    ngOnDestroy() {
        this.eventManager.destroy(this.eventSubscriber);
    }

    trackId(index: number, item: IPolicy) {
        return item.id;
    }

    registerChangeInPolicies() {
        this.eventSubscriber = this.eventManager.subscribe('policyListModification', response => this.loadAll());
    }

    sort() {
        const result = [this.predicate + ',' + (this.reverse ? 'asc' : 'desc')];
        if (this.predicate !== 'id') {
            result.push('id');
        }
        return result;
    }

    protected paginatePolicies(data: IPolicy[], headers: HttpHeaders) {
        this.links = this.parseLinks.parse(headers.get('link'));
        this.totalItems = parseInt(headers.get('X-Total-Count'), 10);
        this.policies = data;
    }

    protected onError(errorMessage: string) {
        this.jhiAlertService.error(errorMessage, null, null);
    }

    send(id: number, policyType: String) {
        if (policyType === 'Bid') {
            console.log(policyType);
            this.policyService.sendBid(id).subscribe(response => {
                //this.message = response.body;
                console.log(response.body['resultCode']);
                if (response.body['resultCode'] !== '0') {
                    this.error = 'ERROR';
                    this.message = response.body['resultMessage'];
                }
            });
        }

        if (policyType === 'Advanced') {
            console.log(policyType);
            this.policyService.sendAdvanced(id).subscribe(response => {
                //this.message = response.body;
                console.log(response.body['resultCode']);
                if (response.body['resultCode'] !== '0') {
                    this.error = 'ERROR';
                    this.message = response.body['resultMessage'];
                }
            });
        }

        if (policyType === 'Performance') {
            console.log(policyType);
            this.policyService.sendPerformance(id).subscribe(response => {
                //this.message = response.body;
                console.log(response.body['resultCode']);
                if (response.body['resultCode'] !== '0') {
                    this.error = 'ERROR';
                    this.message = response.body['resultMessage'];
                }
            });
        }
    }
}
