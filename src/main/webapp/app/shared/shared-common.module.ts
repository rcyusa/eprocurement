import { NgModule } from '@angular/core';

import { EprocurementSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent } from './';

@NgModule({
    imports: [EprocurementSharedLibsModule],
    declarations: [JhiAlertComponent, JhiAlertErrorComponent],
    exports: [EprocurementSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent]
})
export class EprocurementSharedCommonModule {}
