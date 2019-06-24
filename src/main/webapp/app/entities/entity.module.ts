import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';

@NgModule({
    imports: [
        RouterModule.forChild([
            {
                path: 'tender',
                loadChildren: './tender/tender.module#EprocurementTenderModule'
            },
            {
                path: 'lot',
                loadChildren: './lot/lot.module#EprocurementLotModule'
            },
            {
                path: 'contract',
                loadChildren: './contract/contract.module#EprocurementContractModule'
            },
            {
                path: 'policy',
                loadChildren: './policy/policy.module#EprocurementPolicyModule'
            },
            {
                path: 'client',
                loadChildren: './client/client.module#EprocurementClientModule'
            },
            {
                path: 'branch',
                loadChildren: './branch/branch.module#EprocurementBranchModule'
            },
            {
                path: 'user-extra',
                loadChildren: './user-extra/user-extra.module#EprocurementUserExtraModule'
            },
            {
                path: 'company',
                loadChildren: './company/company.module#EprocurementCompanyModule'
            }
            /* jhipster-needle-add-entity-route - JHipster will add entity modules routes here */
        ])
    ],
    declarations: [],
    entryComponents: [],
    providers: [],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class EprocurementEntityModule {}
