/* tslint:disable max-line-length */
import { TestBed, getTestBed } from '@angular/core/testing';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
import { HttpClient, HttpResponse } from '@angular/common/http';
import { of } from 'rxjs';
import { take, map } from 'rxjs/operators';
import { ContractService } from 'app/entities/contract/contract.service';
import { IContract, Contract } from 'app/shared/model/contract.model';

describe('Service Tests', () => {
    describe('Contract Service', () => {
        let injector: TestBed;
        let service: ContractService;
        let httpMock: HttpTestingController;
        let elemDefault: IContract;
        beforeEach(() => {
            TestBed.configureTestingModule({
                imports: [HttpClientTestingModule]
            });
            injector = getTestBed();
            service = injector.get(ContractService);
            httpMock = injector.get(HttpTestingController);

            elemDefault = new Contract(
                0,
                'AAAAAAA',
                'AAAAAAA',
                'AAAAAAA',
                'AAAAAAA',
                'AAAAAAA',
                'AAAAAAA',
                'AAAAAAA',
                'AAAAAAA',
                'AAAAAAA',
                'AAAAAAA',
                'AAAAAAA',
                'AAAAAAA',
                'AAAAAAA',
                'AAAAAAA',
                'AAAAAAA',
                'AAAAAAA',
                'AAAAAAA',
                'AAAAAAA',
                'AAAAAAA',
                'AAAAAAA',
                'AAAAAAA',
                'AAAAAAA',
                'AAAAAAA',
                'AAAAAAA',
                'AAAAAAA',
                'AAAAAAA',
                'AAAAAAA',
                'AAAAAAA',
                'AAAAAAA'
            );
        });

        describe('Service methods', async () => {
            it('should find an element', async () => {
                const returnedFromService = Object.assign({}, elemDefault);
                service
                    .find(123)
                    .pipe(take(1))
                    .subscribe(resp => expect(resp).toMatchObject({ body: elemDefault }));

                const req = httpMock.expectOne({ method: 'GET' });
                req.flush(JSON.stringify(returnedFromService));
            });

            it('should create a Contract', async () => {
                const returnedFromService = Object.assign(
                    {
                        id: 0
                    },
                    elemDefault
                );
                const expected = Object.assign({}, returnedFromService);
                service
                    .create(new Contract(null))
                    .pipe(take(1))
                    .subscribe(resp => expect(resp).toMatchObject({ body: expected }));
                const req = httpMock.expectOne({ method: 'POST' });
                req.flush(JSON.stringify(returnedFromService));
            });

            it('should update a Contract', async () => {
                const returnedFromService = Object.assign(
                    {
                        contractNumber: 'BBBBBB',
                        contractSerialNumber: 'BBBBBB',
                        contractName: 'BBBBBB',
                        contractAmount: 'BBBBBB',
                        contractAmountCharacter: 'BBBBBB',
                        contractCurrency: 'BBBBBB',
                        contractTotalTaxeAmount: 'BBBBBB',
                        contractTotalTaxeAmountCharacter: 'BBBBBB',
                        contractVatAmount: 'BBBBBB',
                        contractVatRate: 'BBBBBB',
                        contractWhtAmount: 'BBBBBB',
                        contractWhtRate: 'BBBBBB',
                        contractDurationYear: 'BBBBBB',
                        contractDurationMonth: 'BBBBBB',
                        contractDate: 'BBBBBB',
                        contractEffectiveDate: 'BBBBBB',
                        contractWarantyYear: 'BBBBBB',
                        contractWarantyMonth: 'BBBBBB',
                        contractPenaltyDelayRate: 'BBBBBB',
                        contractPenaltyLimitRate: 'BBBBBB',
                        contractManagerName: 'BBBBBB',
                        contractManagerPosition: 'BBBBBB',
                        contractSupervisingFirm: 'BBBBBB',
                        contractPETINNumber: 'BBBBBB',
                        contractPEName: 'BBBBBB',
                        contractPERepresentativeName: 'BBBBBB',
                        contractPETELNumber: 'BBBBBB',
                        contractPEAddress: 'BBBBBB',
                        contractTenderRefNumber: 'BBBBBB'
                    },
                    elemDefault
                );

                const expected = Object.assign({}, returnedFromService);
                service
                    .update(expected)
                    .pipe(take(1))
                    .subscribe(resp => expect(resp).toMatchObject({ body: expected }));
                const req = httpMock.expectOne({ method: 'PUT' });
                req.flush(JSON.stringify(returnedFromService));
            });

            it('should return a list of Contract', async () => {
                const returnedFromService = Object.assign(
                    {
                        contractNumber: 'BBBBBB',
                        contractSerialNumber: 'BBBBBB',
                        contractName: 'BBBBBB',
                        contractAmount: 'BBBBBB',
                        contractAmountCharacter: 'BBBBBB',
                        contractCurrency: 'BBBBBB',
                        contractTotalTaxeAmount: 'BBBBBB',
                        contractTotalTaxeAmountCharacter: 'BBBBBB',
                        contractVatAmount: 'BBBBBB',
                        contractVatRate: 'BBBBBB',
                        contractWhtAmount: 'BBBBBB',
                        contractWhtRate: 'BBBBBB',
                        contractDurationYear: 'BBBBBB',
                        contractDurationMonth: 'BBBBBB',
                        contractDate: 'BBBBBB',
                        contractEffectiveDate: 'BBBBBB',
                        contractWarantyYear: 'BBBBBB',
                        contractWarantyMonth: 'BBBBBB',
                        contractPenaltyDelayRate: 'BBBBBB',
                        contractPenaltyLimitRate: 'BBBBBB',
                        contractManagerName: 'BBBBBB',
                        contractManagerPosition: 'BBBBBB',
                        contractSupervisingFirm: 'BBBBBB',
                        contractPETINNumber: 'BBBBBB',
                        contractPEName: 'BBBBBB',
                        contractPERepresentativeName: 'BBBBBB',
                        contractPETELNumber: 'BBBBBB',
                        contractPEAddress: 'BBBBBB',
                        contractTenderRefNumber: 'BBBBBB'
                    },
                    elemDefault
                );
                const expected = Object.assign({}, returnedFromService);
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

            it('should delete a Contract', async () => {
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
