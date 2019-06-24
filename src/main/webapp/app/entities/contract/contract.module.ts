import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';

import { EprocurementSharedModule } from '../../shared/shared.module';
import {
    ContractComponent,
    ContractDetailComponent,
    ContractUpdateComponent,
    ContractDeletePopupComponent,
    ContractDeleteDialogComponent,
    ContractConsultComponent,
    contractRoute,
    contractPopupRoute
} from './';

const ENTITY_STATES = [...contractRoute, ...contractPopupRoute];

@NgModule({
    imports: [EprocurementSharedModule, RouterModule.forChild(ENTITY_STATES)],
    declarations: [
        ContractComponent,
        ContractDetailComponent,
        ContractUpdateComponent,
        ContractDeleteDialogComponent,
        ContractConsultComponent,
        ContractDeletePopupComponent
    ],
    entryComponents: [
        ContractComponent,
        ContractUpdateComponent,
        ContractDeleteDialogComponent,
        ContractDeletePopupComponent,
        ContractConsultComponent
    ],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class EprocurementContractModule {}
