package rw.co.snw.service.dto;
import java.time.LocalDate;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the Policy entity.
 */
public class PolicyDTO implements Serializable {

    private Long id;

    private String policyNumber;

    private String policyType;

    private Double policyAmount;

    private String policyAmountChar;

    private String policyAmountCurrancy;

    private Double primeAmount;

    private LocalDate policyOperationDate;

    private LocalDate policyStartDate;

    private LocalDate policyExpirationDate;

    private String policyStatus;

    private String policyComment;


    private Long lotOnPolicyId;

    private Long clientId;

    private Long userExtraId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getPolicyType() {
        return policyType;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    public Double getPolicyAmount() {
        return policyAmount;
    }

    public void setPolicyAmount(Double policyAmount) {
        this.policyAmount = policyAmount;
    }

    public String getPolicyAmountChar() {
        return policyAmountChar;
    }

    public void setPolicyAmountChar(String policyAmountChar) {
        this.policyAmountChar = policyAmountChar;
    }

    public String getPolicyAmountCurrancy() {
        return policyAmountCurrancy;
    }

    public void setPolicyAmountCurrancy(String policyAmountCurrancy) {
        this.policyAmountCurrancy = policyAmountCurrancy;
    }

    public Double getPrimeAmount() {
        return primeAmount;
    }

    public void setPrimeAmount(Double primeAmount) {
        this.primeAmount = primeAmount;
    }

    public LocalDate getPolicyOperationDate() {
        return policyOperationDate;
    }

    public void setPolicyOperationDate(LocalDate policyOperationDate) {
        this.policyOperationDate = policyOperationDate;
    }

    public LocalDate getPolicyStartDate() {
        return policyStartDate;
    }

    public void setPolicyStartDate(LocalDate policyStartDate) {
        this.policyStartDate = policyStartDate;
    }

    public LocalDate getPolicyExpirationDate() {
        return policyExpirationDate;
    }

    public void setPolicyExpirationDate(LocalDate policyExpirationDate) {
        this.policyExpirationDate = policyExpirationDate;
    }

    public String getPolicyStatus() {
        return policyStatus;
    }

    public void setPolicyStatus(String policyStatus) {
        this.policyStatus = policyStatus;
    }

    public String getPolicyComment() {
        return policyComment;
    }

    public void setPolicyComment(String policyComment) {
        this.policyComment = policyComment;
    }

    public Long getLotOnPolicyId() {
        return lotOnPolicyId;
    }

    public void setLotOnPolicyId(Long lotId) {
        this.lotOnPolicyId = lotId;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public Long getUserExtraId() {
        return userExtraId;
    }

    public void setUserExtraId(Long userExtraId) {
        this.userExtraId = userExtraId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        PolicyDTO policyDTO = (PolicyDTO) o;
        if (policyDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), policyDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "PolicyDTO{" +
            "id=" + getId() +
            ", policyNumber='" + getPolicyNumber() + "'" +
            ", policyType='" + getPolicyType() + "'" +
            ", policyAmount=" + getPolicyAmount() +
            ", policyAmountChar='" + getPolicyAmountChar() + "'" +
            ", policyAmountCurrancy='" + getPolicyAmountCurrancy() + "'" +
            ", primeAmount=" + getPrimeAmount() +
            ", policyOperationDate='" + getPolicyOperationDate() + "'" +
            ", policyStartDate='" + getPolicyStartDate() + "'" +
            ", policyExpirationDate='" + getPolicyExpirationDate() + "'" +
            ", policyStatus='" + getPolicyStatus() + "'" +
            ", policyComment='" + getPolicyComment() + "'" +
            ", lotOnPolicy=" + getLotOnPolicyId() +
            ", client=" + getClientId() +
            ", userExtra=" + getUserExtraId() +
            "}";
    }
}
