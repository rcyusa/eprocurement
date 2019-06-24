/* tslint:disable max-line-length */
import { TestBed, getTestBed } from '@angular/core/testing';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
import { HttpClient, HttpResponse } from '@angular/common/http';
import { of } from 'rxjs';
import { take, map } from 'rxjs/operators';
import * as moment from 'moment';
import { DATE_FORMAT } from 'app/shared/constants/input.constants';
import { PolicyService } from 'app/entities/policy/policy.service';
import { IPolicy, Policy } from 'app/shared/model/policy.model';

describe('Service Tests', () => {
    describe('Policy Service', () => {
        let injector: TestBed;
        let service: PolicyService;
        let httpMock: HttpTestingController;
        let elemDefault: IPolicy;
        let currentDate: moment.Moment;
        beforeEach(() => {
            TestBed.configureTestingModule({
                imports: [HttpClientTestingModule]
            });
            injector = getTestBed();
            service = injector.get(PolicyService);
            httpMock = injector.get(HttpTestingController);
            currentDate = moment();

            elemDefault = new Policy(
                0,
                'AAAAAAA',
                'AAAAAAA',
                0,
                'AAAAAAA',
                'AAAAAAA',
                0,
                currentDate,
                currentDate,
                currentDate,
                'AAAAAAA',
                'AAAAAAA'
            );
        });

        describe('Service methods', async () => {
            it('should find an element', async () => {
                const returnedFromService = Object.assign(
                    {
                        policyOperationDate: currentDate.format(DATE_FORMAT),
                        policyStartDate: currentDate.format(DATE_FORMAT),
                        policyExpirationDate: currentDate.format(DATE_FORMAT)
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

            it('should create a Policy', async () => {
                const returnedFromService = Object.assign(
                    {
                        id: 0,
                        policyOperationDate: currentDate.format(DATE_FORMAT),
                        policyStartDate: currentDate.format(DATE_FORMAT),
                        policyExpirationDate: currentDate.format(DATE_FORMAT)
                    },
                    elemDefault
                );
                const expected = Object.assign(
                    {
                        policyOperationDate: currentDate,
                        policyStartDate: currentDate,
                        policyExpirationDate: currentDate
                    },
                    returnedFromService
                );
                service
                    .create(new Policy(null))
                    .pipe(take(1))
                    .subscribe(resp => expect(resp).toMatchObject({ body: expected }));
                const req = httpMock.expectOne({ method: 'POST' });
                req.flush(JSON.stringify(returnedFromService));
            });

            it('should update a Policy', async () => {
                const returnedFromService = Object.assign(
                    {
                        policyNumber: 'BBBBBB',
                        policyType: 'BBBBBB',
                        policyAmount: 1,
                        policyAmountChar: 'BBBBBB',
                        policyAmountCurrancy: 'BBBBBB',
                        primeAmount: 1,
                        policyOperationDate: currentDate.format(DATE_FORMAT),
                        policyStartDate: currentDate.format(DATE_FORMAT),
                        policyExpirationDate: currentDate.format(DATE_FORMAT),
                        policyStatus: 'BBBBBB',
                        policyComment: 'BBBBBB'
                    },
                    elemDefault
                );

                const expected = Object.assign(
                    {
                        policyOperationDate: currentDate,
                        policyStartDate: currentDate,
                        policyExpirationDate: currentDate
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

            it('should return a list of Policy', async () => {
                const returnedFromService = Object.assign(
                    {
                        policyNumber: 'BBBBBB',
                        policyType: 'BBBBBB',
                        policyAmount: 1,
                        policyAmountChar: 'BBBBBB',
                        policyAmountCurrancy: 'BBBBBB',
                        primeAmount: 1,
                        policyOperationDate: currentDate.format(DATE_FORMAT),
                        policyStartDate: currentDate.format(DATE_FORMAT),
                        policyExpirationDate: currentDate.format(DATE_FORMAT),
                        policyStatus: 'BBBBBB',
                        policyComment: 'BBBBBB'
                    },
                    elemDefault
                );
                const expected = Object.assign(
                    {
                        policyOperationDate: currentDate,
                        policyStartDate: currentDate,
                        policyExpirationDate: currentDate
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

            it('should delete a Policy', async () => {
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
