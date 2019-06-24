package rw.co.snw.service.dto;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the Lot entity.
 */
public class LotDTO implements Serializable {

    private Long id;

    private String lotName;

    private String lotNumber;

    private String lotDesc;

    private Double lotAmount;

    private String lotCurrancy;

    private String lotRefNumber;


    private Long tenderId;

    private Long contractId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLotName() {
        return lotName;
    }

    public void setLotName(String lotName) {
        this.lotName = lotName;
    }

    public String getLotNumber() {
        return lotNumber;
    }

    public void setLotNumber(String lotNumber) {
        this.lotNumber = lotNumber;
    }

    public String getLotDesc() {
        return lotDesc;
    }

    public void setLotDesc(String lotDesc) {
        this.lotDesc = lotDesc;
    }

    public Double getLotAmount() {
        return lotAmount;
    }

    public void setLotAmount(Double lotAmount) {
        this.lotAmount = lotAmount;
    }

    public String getLotCurrancy() {
        return lotCurrancy;
    }

    public void setLotCurrancy(String lotCurrancy) {
        this.lotCurrancy = lotCurrancy;
    }

    public String getLotRefNumber() {
        return lotRefNumber;
    }

    public void setLotRefNumber(String lotRefNumber) {
        this.lotRefNumber = lotRefNumber;
    }

    public Long getTenderId() {
        return tenderId;
    }

    public void setTenderId(Long tenderId) {
        this.tenderId = tenderId;
    }

    public Long getContractId() {
        return contractId;
    }

    public void setContractId(Long contractId) {
        this.contractId = contractId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        LotDTO lotDTO = (LotDTO) o;
        if (lotDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), lotDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "LotDTO{" +
            "id=" + getId() +
            ", lotName='" + getLotName() + "'" +
            ", lotNumber='" + getLotNumber() + "'" +
            ", lotDesc='" + getLotDesc() + "'" +
            ", lotAmount=" + getLotAmount() +
            ", lotCurrancy='" + getLotCurrancy() + "'" +
            ", lotRefNumber='" + getLotRefNumber() + "'" +
            ", tender=" + getTenderId() +
            ", contract=" + getContractId() +
            "}";
    }
}
