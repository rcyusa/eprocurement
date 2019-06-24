package rw.co.snw.service.dto;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the Company entity.
 */
public class CompanyDTO implements Serializable {

    private Long id;

    private String companyUserName;

    private String companyPassWord;

    private String companyTINnumber;

    private String companyEmail;

    private String companyFax;

    private String companyPhone;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyUserName() {
        return companyUserName;
    }

    public void setCompanyUserName(String companyUserName) {
        this.companyUserName = companyUserName;
    }

    public String getCompanyPassWord() {
        return companyPassWord;
    }

    public void setCompanyPassWord(String companyPassWord) {
        this.companyPassWord = companyPassWord;
    }

    public String getCompanyTINnumber() {
        return companyTINnumber;
    }

    public void setCompanyTINnumber(String companyTINnumber) {
        this.companyTINnumber = companyTINnumber;
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }

    public String getCompanyFax() {
        return companyFax;
    }

    public void setCompanyFax(String companyFax) {
        this.companyFax = companyFax;
    }

    public String getCompanyPhone() {
        return companyPhone;
    }

    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        CompanyDTO companyDTO = (CompanyDTO) o;
        if (companyDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), companyDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "CompanyDTO{" +
            "id=" + getId() +
            ", companyUserName='" + getCompanyUserName() + "'" +
            ", companyPassWord='" + getCompanyPassWord() + "'" +
            ", companyTINnumber='" + getCompanyTINnumber() + "'" +
            ", companyEmail='" + getCompanyEmail() + "'" +
            ", companyFax='" + getCompanyFax() + "'" +
            ", companyPhone='" + getCompanyPhone() + "'" +
            "}";
    }
}
