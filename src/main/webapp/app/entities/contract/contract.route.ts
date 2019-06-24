import { Injectable } from '@angular/core';
import { HttpResponse } from '@angular/common/http';
import { Resolve, ActivatedRouteSnapshot, RouterStateSnapshot, Routes } from '@angular/router';
import { JhiPaginationUtil, JhiResolvePagingParams } from 'ng-jhipster';
import { UserRouteAccessService } from '../../core/auth/user-route-access-service';
import { Observable, of } from 'rxjs';
import { filter, map } from 'rxjs/operators';
import { Contract } from 'app/shared/model/contract.model';
import { ContractService } from './contract.service';
import { ContractComponent } from './contract.component';
import { ContractDetailComponent } from './contract-detail.component';
import { ContractUpdateComponent } from './contract-update.component';
import { ContractDeletePopupComponent } from './contract-delete-dialog.component';
import { IContract } from 'app/shared/model/contract.model';
import { ContractConsultComponent } from './contract-consult.component';

@Injectable({ providedIn: 'root' })
export class ContractResolve implements Resolve<IContract> {
    constructor(private service: ContractService) {}

    resolve(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): Observable<IContract> {
        const id = route.params['id'] ? route.params['id'] : null;
        if (id) {
            return this.service.find(id).pipe(
                filter((response: HttpResponse<Contract>) => response.ok),
                map((contract: HttpResponse<Contract>) => contract.body)
            );
        }
        return of(new Contract());
    }
}

export const contractRoute: Routes = [
    {
        path: '',
        component: ContractComponent,
        resolve: {
            pagingParams: JhiResolvePagingParams
        },
        data: {
            authorities: ['ROLE_USER'],
            defaultSort: 'id,asc',
            pageTitle: 'Contracts'
        },
        canActivate: [UserRouteAccessService]
    },
    {
        path: ':id/view',
        component: ContractDetailComponent,
        resolve: {
            contract: ContractResolve
        },
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Contracts'
        },
        canActivate: [UserRouteAccessService]
    },
    {
        path: 'consult',
        component: ContractConsultComponent,
        resolve: {
            contract: ContractResolve
        },
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Tenders'
        },
        canActivate: [UserRouteAccessService]
    },
    {
        path: 'new',
        component: ContractUpdateComponent,
        resolve: {
            contract: ContractResolve
        },
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Contracts'
        },
        canActivate: [UserRouteAccessService]
    },
    {
        path: ':id/edit',
        component: ContractUpdateComponent,
        resolve: {
            contract: ContractResolve
        },
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Contracts'
        },
        canActivate: [UserRouteAccessService]
    }
];

export const contractPopupRoute: Routes = [
    {
        path: ':id/delete',
        component: ContractDeletePopupComponent,
        resolve: {
            contract: ContractResolve
        },
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Contracts'
        },
        canActivate: [UserRouteAccessService],
        outlet: 'popup'
    }
];
