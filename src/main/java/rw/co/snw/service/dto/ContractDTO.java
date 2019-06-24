package rw.co.snw.service.dto;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the Contract entity.
 */
public class ContractDTO implements Serializable {

    private Long id;

    private String contractNumber;

    private String contractSerialNumber;

    private String contractName;

    private String contractAmount;

    private String contractAmountCharacter;

    private String contractCurrency;

    private String contractTotalTaxeAmount;

    private String contractTotalTaxeAmountCharacter;

    private String contractVatAmount;

    private String contractVatRate;

    private String contractWhtAmount;

    private String contractWhtRate;

    private String contractDurationYear;

    private String contractDurationMonth;

    private String contractDate;

    private String contractEffectiveDate;

    private String contractWarantyYear;

    private String contractWarantyMonth;

    private String contractPenaltyDelayRate;

    private String contractPenaltyLimitRate;

    private String contractManagerName;

    private String contractManagerPosition;

    private String contractSupervisingFirm;

    private String contractPETINNumber;

    private String contractPEName;

    private String contractPERepresentativeName;

    private String contractPETELNumber;

    private String contractPEAddress;

    private String contractTenderRefNumber;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getContractSerialNumber() {
        return contractSerialNumber;
    }

    public void setContractSerialNumber(String contractSerialNumber) {
        this.contractSerialNumber = contractSerialNumber;
    }

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    public String getContractAmount() {
        return contractAmount;
    }

    public void setContractAmount(String contractAmount) {
        this.contractAmount = contractAmount;
    }

    public String getContractAmountCharacter() {
        return contractAmountCharacter;
    }

    public void setContractAmountCharacter(String contractAmountCharacter) {
        this.contractAmountCharacter = contractAmountCharacter;
    }

    public String getContractCurrency() {
        return contractCurrency;
    }

    public void setContractCurrency(String contractCurrency) {
        this.contractCurrency = contractCurrency;
    }

    public String getContractTotalTaxeAmount() {
        return contractTotalTaxeAmount;
    }

    public void setContractTotalTaxeAmount(String contractTotalTaxeAmount) {
        this.contractTotalTaxeAmount = contractTotalTaxeAmount;
    }

    public String getContractTotalTaxeAmountCharacter() {
        return contractTotalTaxeAmountCharacter;
    }

    public void setContractTotalTaxeAmountCharacter(String contractTotalTaxeAmountCharacter) {
        this.contractTotalTaxeAmountCharacter = contractTotalTaxeAmountCharacter;
    }

    public String getContractVatAmount() {
        return contractVatAmount;
    }

    public void setContractVatAmount(String contractVatAmount) {
        this.contractVatAmount = contractVatAmount;
    }

    public String getContractVatRate() {
        return contractVatRate;
    }

    public void setContractVatRate(String contractVatRate) {
        this.contractVatRate = contractVatRate;
    }

    public String getContractWhtAmount() {
        return contractWhtAmount;
    }

    public void setContractWhtAmount(String contractWhtAmount) {
        this.contractWhtAmount = contractWhtAmount;
    }

    public String getContractWhtRate() {
        return contractWhtRate;
    }

    public void setContractWhtRate(String contractWhtRate) {
        this.contractWhtRate = contractWhtRate;
    }

    public String getContractDurationYear() {
        return contractDurationYear;
    }

    public void setContractDurationYear(String contractDurationYear) {
        this.contractDurationYear = contractDurationYear;
    }

    public String getContractDurationMonth() {
        return contractDurationMonth;
    }

    public void setContractDurationMonth(String contractDurationMonth) {
        this.contractDurationMonth = contractDurationMonth;
    }

    public String getContractDate() {
        return contractDate;
    }

    public void setContractDate(String contractDate) {
        this.contractDate = contractDate;
    }

    public String getContractEffectiveDate() {
        return contractEffectiveDate;
    }

    public void setContractEffectiveDate(String contractEffectiveDate) {
        this.contractEffectiveDate = contractEffectiveDate;
    }

    public String getContractWarantyYear() {
        return contractWarantyYear;
    }

    public void setContractWarantyYear(String contractWarantyYear) {
        this.contractWarantyYear = contractWarantyYear;
    }

    public String getContractWarantyMonth() {
        return contractWarantyMonth;
    }

    public void setContractWarantyMonth(String contractWarantyMonth) {
        this.contractWarantyMonth = contractWarantyMonth;
    }

    public String getContractPenaltyDelayRate() {
        return contractPenaltyDelayRate;
    }

    public void setContractPenaltyDelayRate(String contractPenaltyDelayRate) {
        this.contractPenaltyDelayRate = contractPenaltyDelayRate;
    }

    public String getContractPenaltyLimitRate() {
        return contractPenaltyLimitRate;
    }

    public void setContractPenaltyLimitRate(String contractPenaltyLimitRate) {
        this.contractPenaltyLimitRate = contractPenaltyLimitRate;
    }

    public String getContractManagerName() {
        return contractManagerName;
    }

    public void setContractManagerName(String contractManagerName) {
        this.contractManagerName = contractManagerName;
    }

    public String getContractManagerPosition() {
        return contractManagerPosition;
    }

    public void setContractManagerPosition(String contractManagerPosition) {
        this.contractManagerPosition = contractManagerPosition;
    }

    public String getContractSupervisingFirm() {
        return contractSupervisingFirm;
    }

    public void setContractSupervisingFirm(String contractSupervisingFirm) {
        this.contractSupervisingFirm = contractSupervisingFirm;
    }

    public String getContractPETINNumber() {
        return contractPETINNumber;
    }

    public void setContractPETINNumber(String contractPETINNumber) {
        this.contractPETINNumber = contractPETINNumber;
    }

    public String getContractPEName() {
        return contractPEName;
    }

    public void setContractPEName(String contractPEName) {
        this.contractPEName = contractPEName;
    }

    public String getContractPERepresentativeName() {
        return contractPERepresentativeName;
    }

    public void setContractPERepresentativeName(String contractPERepresentativeName) {
        this.contractPERepresentativeName = contractPERepresentativeName;
    }

    public String getContractPETELNumber() {
        return contractPETELNumber;
    }

    public void setContractPETELNumber(String contractPETELNumber) {
        this.contractPETELNumber = contractPETELNumber;
    }

    public String getContractPEAddress() {
        return contractPEAddress;
    }

    public void setContractPEAddress(String contractPEAddress) {
        this.contractPEAddress = contractPEAddress;
    }

    public String getContractTenderRefNumber() {
        return contractTenderRefNumber;
    }

    public void setContractTenderRefNumber(String contractTenderRefNumber) {
        this.contractTenderRefNumber = contractTenderRefNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ContractDTO contractDTO = (ContractDTO) o;
        if (contractDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), contractDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "ContractDTO{" +
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
