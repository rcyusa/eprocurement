import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';

import { EprocurementSharedModule } from '../../shared/shared.module';
import {
    TenderComponent,
    TenderDetailComponent,
    TenderUpdateComponent,
    TenderDeletePopupComponent,
    TenderDeleteDialogComponent,
    TenderConsulComponent,
    tenderRoute,
    tenderPopupRoute
} from './';

const ENTITY_STATES = [...tenderRoute, ...tenderPopupRoute];

@NgModule({
    imports: [EprocurementSharedModule, RouterModule.forChild(ENTITY_STATES)],
    declarations: [
        TenderComponent,
        TenderDetailComponent,
        TenderUpdateComponent,
        TenderDeleteDialogComponent,
        TenderDeletePopupComponent,
        TenderConsulComponent
    ],
    entryComponents: [
        TenderComponent,
        TenderUpdateComponent,
        TenderDeleteDialogComponent,
        TenderDeletePopupComponent,
        TenderConsulComponent
    ],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class EprocurementTenderModule {}
