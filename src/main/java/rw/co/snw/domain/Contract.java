package rw.co.snw.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/**
 * A Contract.
 */
@Entity
@Table(name = "contract")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Contract implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "contract_number")
    private String contractNumber;

    @Column(name = "contract_serial_number")
    private String contractSerialNumber;

    @Column(name = "contract_name")
    private String contractName;

    @Column(name = "contract_amount")
    private String contractAmount;

    @Column(name = "contract_amount_character")
    private String contractAmountCharacter;

    @Column(name = "contract_currency")
    private String contractCurrency;

    @Column(name = "contract_total_taxe_amount")
    private String contractTotalTaxeAmount;

    @Column(name = "contract_total_taxe_amount_character")
    private String contractTotalTaxeAmountCharacter;

    @Column(name = "contract_vat_amount")
    private String contractVatAmount;

    @Column(name = "contract_vat_rate")
    private String contractVatRate;

    @Column(name = "contract_wht_amount")
    private String contractWhtAmount;

    @Column(name = "contract_wht_rate")
    private String contractWhtRate;

    @Column(name = "contract_duration_year")
    private String contractDurationYear;

    @Column(name = "contract_duration_month")
    private String contractDurationMonth;

    @Column(name = "contract_date")
    private String contractDate;

    @Column(name = "contract_effective_date")
    private String contractEffectiveDate;

    @Column(name = "contract_waranty_year")
    private String contractWarantyYear;

    @Column(name = "contract_waranty_month")
    private String contractWarantyMonth;

    @Column(name = "contract_penalty_delay_rate")
    private String contractPenaltyDelayRate;

    @Column(name = "contract_penalty_limit_rate")
    private String contractPenaltyLimitRate;

    @Column(name = "contract_manager_name")
    private String contractManagerName;

    @Column(name = "contract_manager_position")
    private String contractManagerPosition;

    @Column(name = "contract_supervising_firm")
    private String contractSupervisingFirm;

    @Column(name = "contract_petin_number")
    private String contractPETINNumber;

    @Column(name = "contract_pe_name")
    private String contractPEName;

    @Column(name = "contract_pe_representative_name")
    private String contractPERepresentativeName;

    @Column(name = "contract_petel_number")
    private String contractPETELNumber;

    @Column(name = "contract_pe_address")
    private String contractPEAddress;

    @Column(name = "contract_tender_ref_number")
    private String contractTenderRefNumber;

    @OneToMany(mappedBy = "contract")
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<Lot> lotByContracts = new HashSet<>();
    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public Contract contractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
        return this;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getContractSerialNumber() {
        return contractSerialNumber;
    }

    public Contract contractSerialNumber(String contractSerialNumber) {
        this.contractSerialNumber = contractSerialNumber;
        return this;
    }

    public void setContractSerialNumber(String contractSerialNumber) {
        this.contractSerialNumber = contractSerialNumber;
    }

    public String getContractName() {
        return contractName;
    }

    public Contract contractName(String contractName) {
        this.contractName = contractName;
        return this;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    public String getContractAmount() {
        return contractAmount;
    }

    public Contract contractAmount(String contractAmount) {
        this.contractAmount = contractAmount;
        return this;
    }

    public void setContractAmount(String contractAmount) {
        this.contractAmount = contractAmount;
    }

    public String getContractAmountCharacter() {
        return contractAmountCharacter;
    }

    public Contract contractAmountCharacter(String contractAmountCharacter) {
        this.contractAmountCharacter = contractAmountCharacter;
        return this;
    }

    public void setContractAmountCharacter(String contractAmountCharacter) {
        this.contractAmountCharacter = contractAmountCharacter;
    }

    public String getContractCurrency() {
        return contractCurrency;
    }

    public Contract contractCurrency(String contractCurrency) {
        this.contractCurrency = contractCurrency;
        return this;
    }

    public void setContractCurrency(String contractCurrency) {
        this.contractCurrency = contractCurrency;
    }

    public String getContractTotalTaxeAmount() {
        return contractTotalTaxeAmount;
    }

    public Contract contractTotalTaxeAmount(String contractTotalTaxeAmount) {
        this.contractTotalTaxeAmount = contractTotalTaxeAmount;
        return this;
    }

    public void setContractTotalTaxeAmount(String contractTotalTaxeAmount) {
        this.contractTotalTaxeAmount = contractTotalTaxeAmount;
    }

    public String getContractTotalTaxeAmountCharacter() {
        return contractTotalTaxeAmountCharacter;
    }

    public Contract contractTotalTaxeAmountCharacter(String contractTotalTaxeAmountCharacter) {
        this.contractTotalTaxeAmountCharacter = contractTotalTaxeAmountCharacter;
        return this;
    }

    public void setContractTotalTaxeAmountCharacter(String contractTotalTaxeAmountCharacter) {
        this.contractTotalTaxeAmountCharacter = contractTotalTaxeAmountCharacter;
    }

    public String getContractVatAmount() {
        return contractVatAmount;
    }

    public Contract contractVatAmount(String contractVatAmount) {
        this.contractVatAmount = contractVatAmount;
        return this;
    }

    public void setContractVatAmount(String contractVatAmount) {
        this.contractVatAmount = contractVatAmount;
    }

    public String getContractVatRate() {
        return contractVatRate;
    }

    public Contract contractVatRate(String contractVatRate) {
        this.contractVatRate = contractVatRate;
        return this;
    }

    public void setContractVatRate(String contractVatRate) {
        this.contractVatRate = contractVatRate;
    }

    public String getContractWhtAmount() {
        return contractWhtAmount;
    }

    public Contract contractWhtAmount(String contractWhtAmount) {
        this.contractWhtAmount = contractWhtAmount;
        return this;
    }

    public void setContractWhtAmount(String contractWhtAmount) {
        this.contractWhtAmount = contractWhtAmount;
    }

    public String getContractWhtRate() {
        return contractWhtRate;
    }

    public Contract contractWhtRate(String contractWhtRate) {
        this.contractWhtRate = contractWhtRate;
        return this;
    }

    public void setContractWhtRate(String contractWhtRate) {
        this.contractWhtRate = contractWhtRate;
    }

    public String getContractDurationYear() {
        return contractDurationYear;
    }

    public Contract contractDurationYear(String contractDurationYear) {
        this.contractDurationYear = contractDurationYear;
        return this;
    }

    public void setContractDurationYear(String contractDurationYear) {
        this.contractDurationYear = contractDurationYear;
    }

    public String getContractDurationMonth() {
        return contractDurationMonth;
    }

    public Contract contractDurationMonth(String contractDurationMonth) {
        this.contractDurationMonth = contractDurationMonth;
        return this;
    }

    public void setContractDurationMonth(String contractDurationMonth) {
        this.contractDurationMonth = contractDurationMonth;
    }

    public String getContractDate() {
        return contractDate;
    }

    public Contract contractDate(String contractDate) {
        this.contractDate = contractDate;
        return this;
    }

    public void setContractDate(String contractDate) {
        this.contractDate = contractDate;
    }

    public String getContractEffectiveDate() {
        return contractEffectiveDate;
    }

    public Contract contractEffectiveDate(String contractEffectiveDate) {
        this.contractEffectiveDate = contractEffectiveDate;
        return this;
    }

    public void setContractEffectiveDate(String contractEffectiveDate) {
        this.contractEffectiveDate = contractEffectiveDate;
    }

    public String getContractWarantyYear() {
        return contractWarantyYear;
    }

    public Contract contractWarantyYear(String contractWarantyYear) {
        this.contractWarantyYear = contractWarantyYear;
        return this;
    }

    public void setContractWarantyYear(String contractWarantyYear) {
        this.contractWarantyYear = contractWarantyYear;
    }

    public String getContractWarantyMonth() {
        return contractWarantyMonth;
    }

    public Contract contractWarantyMonth(String contractWarantyMonth) {
        this.contractWarantyMonth = contractWarantyMonth;
        return this;
    }

    public void setContractWarantyMonth(String contractWarantyMonth) {
        this.contractWarantyMonth = contractWarantyMonth;
    }

    public String getContractPenaltyDelayRate() {
        return contractPenaltyDelayRate;
    }

    public Contract contractPenaltyDelayRate(String contractPenaltyDelayRate) {
        this.contractPenaltyDelayRate = contractPenaltyDelayRate;
        return this;
    }

    public void setContractPenaltyDelayRate(String contractPenaltyDelayRate) {
        this.contractPenaltyDelayRate = contractPenaltyDelayRate;
    }

    public String getContractPenaltyLimitRate() {
        return contractPenaltyLimitRate;
    }

    public Contract contractPenaltyLimitRate(String contractPenaltyLimitRate) {
        this.contractPenaltyLimitRate = contractPenaltyLimitRate;
        return this;
    }

    public void setContractPenaltyLimitRate(String contractPenaltyLimitRate) {
        this.contractPenaltyLimitRate = contractPenaltyLimitRate;
    }

    public String getContractManagerName() {
        return contractManagerName;
    }

    public Contract contractManagerName(String contractManagerName) {
        this.contractManagerName = contractManagerName;
        return this;
    }

    public void setContractManagerName(String contractManagerName) {
        this.contractManagerName = contractManagerName;
    }

    public String getContractManagerPosition() {
        return contractManagerPosition;
    }

    public Contract contractManagerPosition(String contractManagerPosition) {
        this.contractManagerPosition = contractManagerPosition;
        return this;
    }

    public void setContractManagerPosition(String contractManagerPosition) {
        this.contractManagerPosition = contractManagerPosition;
    }

    public String getContractSupervisingFirm() {
        return contractSupervisingFirm;
    }

    public Contract contractSupervisingFirm(String contractSupervisingFirm) {
        this.contractSupervisingFirm = contractSupervisingFirm;
        return this;
    }

    public void setContractSupervisingFirm(String contractSupervisingFirm) {
        this.contractSupervisingFirm = contractSupervisingFirm;
    }

    public String getContractPETINNumber() {
        return contractPETINNumber;
    }

    public Contract contractPETINNumber(String contractPETINNumber) {
        this.contractPETINNumber = contractPETINNumber;
        return this;
    }

    public void setContractPETINNumber(String contractPETINNumber) {
        this.contractPETINNumber = contractPETINNumber;
    }

    public String getContractPEName() {
        return contractPEName;
    }

    public Contract contractPEName(String contractPEName) {
        this.contractPEName = contractPEName;
        return this;
    }

    public void setContractPEName(String contractPEName) {
        this.contractPEName = contractPEName;
    }

    public String getContractPERepresentativeName() {
        return contractPERepresentativeName;
    }

    public Contract contractPERepresentativeName(String contractPERepresentativeName) {
        this.contractPERepresentativeName = contractPERepresentativeName;
        return this;
    }

    public void setContractPERepresentativeName(String contractPERepresentativeName) {
        this.contractPERepresentativeName = contractPERepresentativeName;
    }

    public String getContractPETELNumber() {
        return contractPETELNumber;
    }

    public Contract contractPETELNumber(String contractPETELNumber) {
        this.contractPETELNumber = contractPETELNumber;
        return this;
    }

    public void setContractPETELNumber(String contractPETELNumber) {
        this.contractPETELNumber = contractPETELNumber;
    }

    public String getContractPEAddress() {
        return contractPEAddress;
    }

    public Contract contractPEAddress(String contractPEAddress) {
        this.contractPEAddress = contractPEAddress;
        return this;
    }

    public void setContractPEAddress(String contractPEAddress) {
        this.contractPEAddress = contractPEAddress;
    }

    public String getContractTenderRefNumber() {
        return contractTenderRefNumber;
    }

    public Contract contractTenderRefNumber(String contractTenderRefNumber) {
        this.contractTenderRefNumber = contractTenderRefNumber;
        return this;
    }

    public void setContractTenderRefNumber(String contractTenderRefNumber) {
        this.contractTenderRefNumber = contractTenderRefNumber;
    }

    public Set<Lot> getLotByContracts() {
        return lotByContracts;
    }

    public Contract lotByContracts(Set<Lot> lots) {
        this.lotByContracts = lots;
        return this;
    }

    public Contract addLotByContract(Lot lot) {
        this.lotByContracts.add(lot);
        lot.setContract(this);
        return this;
    }

    public Contract removeLotByContract(Lot lot) {
        this.lotByContracts.remove(lot);
        lot.setContract(null);
        return this;
    }

    public void setLotByContracts(Set<Lot> lots) {
        this.lotByContracts = lots;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Contract contract = (Contract) o;
        if (contract.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), contract.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Contract{" +
            "id=" + getId() +
            ", contractNumber='" + getContractNumber() + "'" +
            ", contractSerialNumber='" + getContractSerialNumber() + "'" +
            ", contractName='" + getContractName() + "'" +
            ", contractAmount='" + getContractAmount() + "'" +
            ", contractAmountCharacter='" + getContractAmountCharacter() + "'" +
            ", contractCurrency='" + getContractCurrency() + "'" +
            ", contractTotalTaxeAmount='" + getContractTotalTaxeAmount() + "'" +
            ", contractTotalTaxeAmountCharacter='" + getContractTotalTaxeAmountCharacter() + "'" +
            ", contractVatAmount='" + getContractVatAmount() + "'" +
            ", contractVatRate='" + getContractVatRate() + "'" +
            ", contractWhtAmount='" + getContractWhtAmount() + "'" +
            ", contractWhtRate='" + getContractWhtRate() + "'" +
            ", contractDurationYear='" + getContractDurationYear() + "'" +
            ", contractDurationMonth='" + getContractDurationMonth() + "'" +
            ", contractDate='" + getContractDate() + "'" +
            ", contractEffectiveDate='" + getContractEffectiveDate() + "'" +
            ", contractWarantyYear='" + getContractWarantyYear() + "'" +
            ", contractWarantyMonth='" + getContractWarantyMonth() + "'" +
            ", contractPenaltyDelayRate='" + getContractPenaltyDelayRate() + "'" +
            ", contractPenaltyLimitRate='" + getContractPenaltyLimitRate() + "'" +
            ", contractManagerName='" + getContractManagerName() + "'" +
            ", contractManagerPosition='" + getContractManagerPosition() + "'" +
            ", contractSupervisingFirm='" + getContractSupervisingFirm() + "'" +
            ", contractPETINNumber='" + getContractPETINNumber() + "'" +
            ", contractPEName='" + getContractPEName() + "'" +
            ", contractPERepresentativeName='" + getContractPERepresentativeName() + "'" +
            ", contractPETELNumber='" + getContractPETELNumber() + "'" +
            ", contractPEAddress='" + getContractPEAddress() + "'" +
            ", contractTenderRefNumber='" + getContractTenderRefNumber() + "'" +
            "}";
    }
}
