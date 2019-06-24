import { Injectable } from '@angular/core';
import { HttpResponse } from '@angular/common/http';
import { Resolve, ActivatedRouteSnapshot, RouterStateSnapshot, Routes } from '@angular/router';
import { JhiPaginationUtil, JhiResolvePagingParams } from 'ng-jhipster';
import { UserRouteAccessService } from '../../core/auth/user-route-access-service';
import { Observable, of } from 'rxjs';
import { filter, map } from 'rxjs/operators';
import { Lot } from 'app/shared/model/lot.model';
import { LotService } from './lot.service';
import { LotComponent } from './lot.component';
import { LotDetailComponent } from './lot-detail.component';
import { LotUpdateComponent } from './lot-update.component';
import { LotDeletePopupComponent } from './lot-delete-dialog.component';
import { ILot } from 'app/shared/model/lot.model';

@Injectable({ providedIn: 'root' })
export class LotResolve implements Resolve<ILot> {
    constructor(private service: LotService) {}

    resolve(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): Observable<ILot> {
        const id = route.params['id'] ? route.params['id'] : null;
        if (id) {
            return this.service.find(id).pipe(
                filter((response: HttpResponse<Lot>) => response.ok),
                map((lot: HttpResponse<Lot>) => lot.body)
            );
        }
        return of(new Lot());
    }
}

export const lotRoute: Routes = [
    {
        path: '',
        component: LotComponent,
        resolve: {
            pagingParams: JhiResolvePagingParams
        },
        data: {
            authorities: ['ROLE_USER'],
            defaultSort: 'id,asc',
            pageTitle: 'Lots'
        },
        canActivate: [UserRouteAccessService]
    },
    {
        path: ':id/view',
        component: LotDetailComponent,
        resolve: {
            lot: LotResolve
        },
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Lots'
        },
        canActivate: [UserRouteAccessService]
    },
    {
        path: 'new',
        component: LotUpdateComponent,
        resolve: {
            lot: LotResolve
        },
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Lots'
        },
        canActivate: [UserRouteAccessService]
    },
    {
        path: ':id/edit',
        component: LotUpdateComponent,
        resolve: {
            lot: LotResolve
        },
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Lots'
        },
        canActivate: [UserRouteAccessService]
    }
];

export const lotPopupRoute: Routes = [
    {
        path: ':id/delete',
        component: LotDeletePopupComponent,
        resolve: {
            lot: LotResolve
        },
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Lots'
        },
        canActivate: [UserRouteAccessService],
        outlet: 'popup'
    }
];
