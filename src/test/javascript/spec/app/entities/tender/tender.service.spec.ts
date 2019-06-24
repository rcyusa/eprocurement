/* tslint:disable max-line-length */
import { TestBed, getTestBed } from '@angular/core/testing';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
import { HttpClient, HttpResponse } from '@angular/common/http';
import { of } from 'rxjs';
import { take, map } from 'rxjs/operators';
import * as moment from 'moment';
import { DATE_FORMAT } from 'app/shared/constants/input.constants';
import { TenderService } from 'app/entities/tender/tender.service';
import { ITender, Tender } from 'app/shared/model/tender.model';

describe('Service Tests', () => {
    describe('Tender Service', () => {
        let injector: TestBed;
        let service: TenderService;
        let httpMock: HttpTestingController;
        let elemDefault: ITender;
        let currentDate: moment.Moment;
        beforeEach(() => {
            TestBed.configureTestingModule({
                imports: [HttpClientTestingModule]
            });
            injector = getTestBed();
            service = injector.get(TenderService);
            httpMock = injector.get(HttpTestingController);
            currentDate = moment();

            elemDefault = new Tender(
                0,
                'AAAAAAA',
                'AAAAAAA',
                'AAAAAAA',
                'AAAAAAA',
                'AAAAAAA',
                'AAAAAAA',
                'AAAAAAA',
                currentDate,
                currentDate,
                currentDate,
                currentDate
            );
        });

        describe('Service methods', async () => {
            it('should find an element', async () => {
                const returnedFromService = Object.assign(
                    {
                        tenderPublicDate: currentDate.format(DATE_FORMAT),
                        tenderReceiveDate: currentDate.format(DATE_FORMAT),
                        tenderDeadLineDate: currentDate.format(DATE_FORMAT),
                        tenderOpenDate: currentDate.format(DATE_FORMAT)
                    },
                    elemDefault
                );
                service
                    .find(123)
                    .pipe(take(1))
                    .subscribe(resp => expect(resp).toMatchObject({ body: elemDefault }));

                const req = httpMock.expectOne({ method: 'GET' });
                req.flush(JSON.stringify(returnedFromService));
            });

            it('should create a Tender', async () => {
                const returnedFromService = Object.assign(
                    {
                        id: 0,
                        tenderPublicDate: currentDate.format(DATE_FORMAT),
                        tenderReceiveDate: currentDate.format(DATE_FORMAT),
                        tenderDeadLineDate: currentDate.format(DATE_FORMAT),
                        tenderOpenDate: currentDate.format(DATE_FORMAT)
                    },
                    elemDefault
                );
                const expected = Object.assign(
                    {
                        tenderPublicDate: currentDate,
                        tenderReceiveDate: currentDate,
                        tenderDeadLineDate: currentDate,
                        tenderOpenDate: currentDate
                    },
                    returnedFromService
                );
                service
                    .create(new Tender(null))
                    .pipe(take(1))
                    .subscribe(resp => expect(resp).toMatchObject({ body: expected }));
                const req = httpMock.expectOne({ method: 'POST' });
                req.flush(JSON.stringify(returnedFromService));
            });

            it('should update a Tender', async () => {
                const returnedFromService = Object.assign(
                    {
                        tenderRefNumber: 'BBBBBB',
                        tenderRefName: 'BBBBBB',
                        tenderPEName: 'BBBBBB',
                        tenderPECode: 'BBBBBB',
                        tenderType: 'BBBBBB',
                        tenderMethod: 'BBBBBB',
                        tenderOnOff: 'BBBBBB',
                        tenderPublicDate: currentDate.format(DATE_FORMAT),
                        tenderReceiveDate: currentDate.format(DATE_FORMAT),
                        tenderDeadLineDate: currentDate.format(DATE_FORMAT),
                        tenderOpenDate: currentDate.format(DATE_FORMAT)
                    },
                    elemDefault
                );

                const expected = Object.assign(
                    {
                        tenderPublicDate: currentDate,
                        tenderReceiveDate: currentDate,
                        tenderDeadLineDate: currentDate,
                        tenderOpenDate: currentDate
                    },
                    returnedFromService
                );
                service
                    .update(expected)
                    .pipe(take(1))
                    .subscribe(resp => expect(resp).toMatchObject({ body: expected }));
                const req = httpMock.expectOne({ method: 'PUT' });
                req.flush(JSON.stringify(returnedFromService));
            });

            it('should return a list of Tender', async () => {
                const returnedFromService = Object.assign(
                    {
                        tenderRefNumber: 'BBBBBB',
                        tenderRefName: 'BBBBBB',
                        tenderPEName: 'BBBBBB',
                        tenderPECode: 'BBBBBB',
                        tenderType: 'BBBBBB',
                        tenderMethod: 'BBBBBB',
                        tenderOnOff: 'BBBBBB',
                        tenderPublicDate: currentDate.format(DATE_FORMAT),
                        tenderReceiveDate: currentDate.format(DATE_FORMAT),
                        tenderDeadLineDate: currentDate.format(DATE_FORMAT),
                        tenderOpenDate: currentDate.format(DATE_FORMAT)
                    },
                    elemDefault
                );
                const expected = Object.assign(
                    {
                        tenderPublicDate: currentDate,
                        tenderReceiveDate: currentDate,
                        tenderDeadLineDate: currentDate,
                        tenderOpenDate: currentDate
                    },
                    returnedFromService
                );
                service
                    .query(expected)
                    .pipe(
                        take(1),
                        map(resp => resp.body)
                    )
                    .subscribe(body => expect(body).toContainEqual(expected));
                const req = httpMock.expectOne({ method: 'GET' });
                req.flush(JSON.stringify([returnedFromService]));
                httpMock.verify();
            });

            it('should delete a Tender', async () => {
                const rxPromise = service.delete(123).subscribe(resp => expect(resp.ok));

                const req = httpMock.expectOne({ method: 'DELETE' });
                req.flush({ status: 200 });
            });
        });

        afterEach(() => {
            httpMock.verify();
        });
    });
});
