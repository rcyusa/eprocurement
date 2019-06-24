import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';

import { EprocurementSharedModule } from 'app/shared';
import {
    PolicyComponent,
    PolicyDetailComponent,
    PolicyUpdateComponent,
    PolicyDeletePopupComponent,
    PolicyDeleteDialogComponent,
    policyRoute,
    policyPopupRoute
} from './';

const ENTITY_STATES = [...policyRoute, ...policyPopupRoute];

@NgModule({
    imports: [EprocurementSharedModule, RouterModule.forChild(ENTITY_STATES)],
    declarations: [PolicyComponent, PolicyDetailComponent, PolicyUpdateComponent, PolicyDeleteDialogComponent, PolicyDeletePopupComponent],
    entryComponents: [PolicyComponent, PolicyUpdateComponent, PolicyDeleteDialogComponent, PolicyDeletePopupComponent],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class EprocurementPolicyModule {}
