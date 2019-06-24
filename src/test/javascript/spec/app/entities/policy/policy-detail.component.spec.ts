/* tslint:disable max-line-length */
import { ComponentFixture, TestBed } from '@angular/core/testing';
import { ActivatedRoute } from '@angular/router';
import { of } from 'rxjs';

import { EprocurementTestModule } from '../../../test.module';
import { PolicyDetailComponent } from 'app/entities/policy/policy-detail.component';
import { Policy } from 'app/shared/model/policy.model';

describe('Component Tests', () => {
    describe('Policy Management Detail Component', () => {
        let comp: PolicyDetailComponent;
        let fixture: ComponentFixture<PolicyDetailComponent>;
        const route = ({ data: of({ policy: new Policy(123) }) } as any) as ActivatedRoute;

        beforeEach(() => {
            TestBed.configureTestingModule({
                imports: [EprocurementTestModule],
                declarations: [PolicyDetailComponent],
                providers: [{ provide: ActivatedRoute, useValue: route }]
            })
                .overrideTemplate(PolicyDetailComponent, '')
                .compileComponents();
            fixture = TestBed.createComponent(PolicyDetailComponent);
            comp = fixture.componentInstance;
        });

        describe('OnInit', () => {
            it('Should call load all on init', () => {
                // GIVEN

                // WHEN
                comp.ngOnInit();

                // THEN
                expect(comp.policy).toEqual(jasmine.objectContaining({ id: 123 }));
            });
        });
    });
});
