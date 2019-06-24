/* tslint:disable max-line-length */
import { ComponentFixture, TestBed, inject, fakeAsync, tick } from '@angular/core/testing';
import { NgbActiveModal } from '@ng-bootstrap/ng-bootstrap';
import { Observable, of } from 'rxjs';
import { JhiEventManager } from 'ng-jhipster';

import { EprocurementTestModule } from '../../../test.module';
import { PolicyDeleteDialogComponent } from 'app/entities/policy/policy-delete-dialog.component';
import { PolicyService } from 'app/entities/policy/policy.service';

describe('Component Tests', () => {
    describe('Policy Management Delete Component', () => {
        let comp: PolicyDeleteDialogComponent;
        let fixture: ComponentFixture<PolicyDeleteDialogComponent>;
        let service: PolicyService;
        let mockEventManager: any;
        let mockActiveModal: any;

        beforeEach(() => {
            TestBed.configureTestingModule({
                imports: [EprocurementTestModule],
                declarations: [PolicyDeleteDialogComponent]
            })
                .overrideTemplate(PolicyDeleteDialogComponent, '')
                .compileComponents();
            fixture = TestBed.createComponent(PolicyDeleteDialogComponent);
            comp = fixture.componentInstance;
            service = fixture.debugElement.injector.get(PolicyService);
            mockEventManager = fixture.debugElement.injector.get(JhiEventManager);
            mockActiveModal = fixture.debugElement.injector.get(NgbActiveModal);
        });

        describe('confirmDelete', () => {
            it('Should call delete service on confirmDelete', inject(
                [],
                fakeAsync(() => {
                    // GIVEN
                    spyOn(service, 'delete').and.returnValue(of({}));

                    // WHEN
                    comp.confirmDelete(123);
                    tick();

                    // THEN
                    expect(service.delete).toHaveBeenCalledWith(123);
                    expect(mockActiveModal.dismissSpy).toHaveBeenCalled();
                    expect(mockEventManager.broadcastSpy).toHaveBeenCalled();
                })
            ));
        });
    });
});
