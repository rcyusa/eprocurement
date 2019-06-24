package rw.co.snw.service.dto;
import java.time.LocalDate;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the Tender entity.
 */
public class TenderDTO implements Serializable {

    private Long id;

    private String tenderRefNumber;

    private String tenderRefName;

    private String tenderPEName;

    private String tenderPECode;

    private String tenderType;

    private String tenderMethod;

    private String tenderOnOff;

    private LocalDate tenderPublicDate;

    private LocalDate tenderReceiveDate;

    private LocalDate tenderDeadLineDate;

    private LocalDate tenderOpenDate;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTenderRefNumber() {
        return tenderRefNumber;
    }

    public void setTenderRefNumber(String tenderRefNumber) {
        this.tenderRefNumber = tenderRefNumber;
    }

    public String getTenderRefName() {
        return tenderRefName;
    }

    public void setTenderRefName(String tenderRefName) {
        this.tenderRefName = tenderRefName;
    }

    public String getTenderPEName() {
        return tenderPEName;
    }

    public void setTenderPEName(String tenderPEName) {
        this.tenderPEName = tenderPEName;
    }

    public String getTenderPECode() {
        return tenderPECode;
    }

    public void setTenderPECode(String tenderPECode) {
        this.tenderPECode = tenderPECode;
    }

    public String getTenderType() {
        return tenderType;
    }

    public void setTenderType(String tenderType) {
        this.tenderType = tenderType;
    }

    public String getTenderMethod() {
        return tenderMethod;
    }

    public void setTenderMethod(String tenderMethod) {
        this.tenderMethod = tenderMethod;
    }

    public String getTenderOnOff() {
        return tenderOnOff;
    }

    public void setTenderOnOff(String tenderOnOff) {
        this.tenderOnOff = tenderOnOff;
    }

    public LocalDate getTenderPublicDate() {
        return tenderPublicDate;
    }

    public void setTenderPublicDate(LocalDate tenderPublicDate) {
        this.tenderPublicDate = tenderPublicDate;
    }

    public LocalDate getTenderReceiveDate() {
        return tenderReceiveDate;
    }

    public void setTenderReceiveDate(LocalDate tenderReceiveDate) {
        this.tenderReceiveDate = tenderReceiveDate;
    }

    public LocalDate getTenderDeadLineDate() {
        return tenderDeadLineDate;
    }

    public void setTenderDeadLineDate(LocalDate tenderDeadLineDate) {
        this.tenderDeadLineDate = tenderDeadLineDate;
    }

    public LocalDate getTenderOpenDate() {
        return tenderOpenDate;
    }

    public void setTenderOpenDate(LocalDate tenderOpenDate) {
        this.tenderOpenDate = tenderOpenDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TenderDTO tenderDTO = (TenderDTO) o;
        if (tenderDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), tenderDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "TenderDTO{" +
            "id=" + getId() +
            ", tenderRefNumber='" + getTenderRefNumber() + "'" +
            ", tenderRefName='" + getTenderRefName() + "'" +
            ", tenderPEName='" + getTenderPEName() + "'" +
            ", tenderPECode='" + getTenderPECode() + "'" +
            ", tenderType='" + getTenderType() + "'" +
            ", tenderMethod='" + getTenderMethod() + "'" +
            ", tenderOnOff='" + getTenderOnOff() + "'" +
            ", tenderPublicDate='" + getTenderPublicDate() + "'" +
            ", tenderReceiveDate='" + getTenderReceiveDate() + "'" +
            ", tenderDeadLineDate='" + getTenderDeadLineDate() + "'" +
            ", tenderOpenDate='" + getTenderOpenDate() + "'" +
            "}";
    }
}
