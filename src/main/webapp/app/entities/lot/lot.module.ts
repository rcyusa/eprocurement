import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';
import { EprocurementSharedModule } from '../../shared/shared.module';

import {
    LotComponent,
    LotDetailComponent,
    LotUpdateComponent,
    LotDeletePopupComponent,
    LotDeleteDialogComponent,
    lotRoute,
    lotPopupRoute
} from './';

const ENTITY_STATES = [...lotRoute, ...lotPopupRoute];

@NgModule({
    imports: [EprocurementSharedModule, RouterModule.forChild(ENTITY_STATES)],
    declarations: [LotComponent, LotDetailComponent, LotUpdateComponent, LotDeleteDialogComponent, LotDeletePopupComponent],
    entryComponents: [LotComponent, LotUpdateComponent, LotDeleteDialogComponent, LotDeletePopupComponent],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class EprocurementLotModule {}
