import { Component, OnInit, OnDestroy } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

import { NgbActiveModal, NgbModal, NgbModalRef } from '@ng-bootstrap/ng-bootstrap';
import { JhiEventManager } from 'ng-jhipster';

import { ILot } from 'app/shared/model/lot.model';
import { LotService } from './lot.service';

@Component({
    selector: 'jhi-lot-delete-dialog',
    templateUrl: './lot-delete-dialog.component.html'
})
export class LotDeleteDialogComponent {
    lot: ILot;

    constructor(protected lotService: LotService, public activeModal: NgbActiveModal, protected eventManager: JhiEventManager) {}

    clear() {
        this.activeModal.dismiss('cancel');
    }

    confirmDelete(id: number) {
        this.lotService.delete(id).subscribe(response => {
            this.eventManager.broadcast({
                name: 'lotListModification',
                content: 'Deleted an lot'
            });
            this.activeModal.dismiss(true);
        });
    }
}

@Component({
    selector: 'jhi-lot-delete-popup',
    template: ''
})
export class LotDeletePopupComponent implements OnInit, OnDestroy {
    protected ngbModalRef: NgbModalRef;

    constructor(protected activatedRoute: ActivatedRoute, protected router: Router, protected modalService: NgbModal) {}

    ngOnInit() {
        this.activatedRoute.data.subscribe(({ lot }) => {
            setTimeout(() => {
                this.ngbModalRef = this.modalService.open(LotDeleteDialogComponent as Component, { size: 'lg', backdrop: 'static' });
                this.ngbModalRef.componentInstance.lot = lot;
                this.ngbModalRef.result.then(
                    result => {
                        this.router.navigate(['/lot', { outlets: { popup: null } }]);
                        this.ngbModalRef = null;
                    },
                    reason => {
                        this.router.navigate(['/lot', { outlets: { popup: null } }]);
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
