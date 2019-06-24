package rw.co.snw.domain;


import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Objects;

/**
 * A Company.
 */
@Entity
@Table(name = "company")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Company implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "company_user_name")
    private String companyUserName;

    @Column(name = "company_pass_word")
    private String companyPassWord;

    @Column(name = "company_ti_nnumber")
    private String companyTINnumber;

    @Column(name = "company_email")
    private String companyEmail;

    @Column(name = "company_fax")
    private String companyFax;

    @Column(name = "company_phone")
    private String companyPhone;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyUserName() {
        return companyUserName;
    }

    public Company companyUserName(String companyUserName) {
        this.companyUserName = companyUserName;
        return this;
    }

    public void setCompanyUserName(String companyUserName) {
        this.companyUserName = companyUserName;
    }

    public String getCompanyPassWord() {
        return companyPassWord;
    }

    public Company companyPassWord(String companyPassWord) {
        this.companyPassWord = companyPassWord;
        return this;
    }

    public void setCompanyPassWord(String companyPassWord) {
        this.companyPassWord = companyPassWord;
    }

    public String getCompanyTINnumber() {
        return companyTINnumber;
    }

    public Company companyTINnumber(String companyTINnumber) {
        this.companyTINnumber = companyTINnumber;
        return this;
    }

    public void setCompanyTINnumber(String companyTINnumber) {
        this.companyTINnumber = companyTINnumber;
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public Company companyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
        return this;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }

    public String getCompanyFax() {
        return companyFax;
    }

    public Company companyFax(String companyFax) {
        this.companyFax = companyFax;
        return this;
    }

    public void setCompanyFax(String companyFax) {
        this.companyFax = companyFax;
    }

    public String getCompanyPhone() {
        return companyPhone;
    }

    public Company companyPhone(String companyPhone) {
        this.companyPhone = companyPhone;
        return this;
    }

    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone;
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
        Company company = (Company) o;
        if (company.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), company.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Company{" +
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
