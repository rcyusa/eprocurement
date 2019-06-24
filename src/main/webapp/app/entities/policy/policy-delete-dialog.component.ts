import { Component, OnInit, OnDestroy } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

import { NgbActiveModal, NgbModal, NgbModalRef } from '@ng-bootstrap/ng-bootstrap';
import { JhiEventManager } from 'ng-jhipster';

import { IPolicy } from 'app/shared/model/policy.model';
import { PolicyService } from './policy.service';

@Component({
    selector: 'jhi-policy-delete-dialog',
    templateUrl: './policy-delete-dialog.component.html'
})
export class PolicyDeleteDialogComponent {
    policy: IPolicy;

    constructor(protected policyService: PolicyService, public activeModal: NgbActiveModal, protected eventManager: JhiEventManager) {}

    clear() {
        this.activeModal.dismiss('cancel');
    }

    confirmDelete(id: number) {
        this.policyService.delete(id).subscribe(response => {
            this.eventManager.broadcast({
                name: 'policyListModification',
                content: 'Deleted an policy'
            });
            this.activeModal.dismiss(true);
        });
    }
}

@Component({
    selector: 'jhi-policy-delete-popup',
    template: ''
})
export class PolicyDeletePopupComponent implements OnInit, OnDestroy {
    protected ngbModalRef: NgbModalRef;

    constructor(protected activatedRoute: ActivatedRoute, protected router: Router, protected modalService: NgbModal) {}

    ngOnInit() {
        this.activatedRoute.data.subscribe(({ policy }) => {
            setTimeout(() => {
                this.ngbModalRef = this.modalService.open(PolicyDeleteDialogComponent as Component, { size: 'lg', backdrop: 'static' });
                this.ngbModalRef.componentInstance.policy = policy;
                this.ngbModalRef.result.then(
                    result => {
                        this.router.navigate(['/policy', { outlets: { popup: null } }]);
                        this.ngbModalRef = null;
                    },
                    reason => {
                        this.router.navigate(['/policy', { outlets: { popup: null } }]);
                        this.ngbModalRef = null;
                    }
                );
            }, 0);
        });
    }

    ngOnDestroy() {
        this.ngbModalRef = null;
    }
}
