import { Injectable } from '@angular/core';
import { HttpResponse } from '@angular/common/http';
import { Resolve, ActivatedRouteSnapshot, RouterStateSnapshot, Routes } from '@angular/router';
import { JhiPaginationUtil, JhiResolvePagingParams } from 'ng-jhipster';
import { UserRouteAccessService } from 'app/core';
import { Observable, of } from 'rxjs';
import { filter, map } from 'rxjs/operators';
import { Policy } from 'app/shared/model/policy.model';
import { PolicyService } from './policy.service';
import { PolicyComponent } from './policy.component';
import { PolicyDetailComponent } from './policy-detail.component';
import { PolicyUpdateComponent } from './policy-update.component';
import { PolicyDeletePopupComponent } from './policy-delete-dialog.component';
import { IPolicy } from 'app/shared/model/policy.model';

@Injectable({ providedIn: 'root' })
export class PolicyResolve implements Resolve<IPolicy> {
    constructor(private service: PolicyService) {}

    resolve(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): Observable<IPolicy> {
        const id = route.params['id'] ? route.params['id'] : null;
        if (id) {
            return this.service.find(id).pipe(
                filter((response: HttpResponse<Policy>) => response.ok),
                map((policy: HttpResponse<Policy>) => policy.body)
            );
        }
        return of(new Policy());
    }
}

export const policyRoute: Routes = [
    {
        path: '',
        component: PolicyComponent,
        resolve: {
            pagingParams: JhiResolvePagingParams
        },
        data: {
            authorities: ['ROLE_USER'],
            defaultSort: 'id,asc',
            pageTitle: 'Policies'
        },
        canActivate: [UserRouteAccessService]
    },
    {
        path: ':id/view',
        component: PolicyDetailComponent,
        resolve: {
            policy: PolicyResolve
        },
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Policies'
        },
        canActivate: [UserRouteAccessService]
    },
    {
        path: 'new',
        component: PolicyUpdateComponent,
        resolve: {
            policy: PolicyResolve
        },
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Policies'
        },
        canActivate: [UserRouteAccessService]
    },
    {
        path: ':id/edit',
        component: PolicyUpdateComponent,
        resolve: {
            policy: PolicyResolve
        },
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Policies'
        },
        canActivate: [UserRouteAccessService]
    }
];

export const policyPopupRoute: Routes = [
    {
        path: ':id/delete',
        component: PolicyDeletePopupComponent,
        resolve: {
            policy: PolicyResolve
        },
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Policies'
        },
        canActivate: [UserRouteAccessService],
        outlet: 'popup'
    }
];
