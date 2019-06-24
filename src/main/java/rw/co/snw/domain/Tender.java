package rw.co.snw.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/**
 * A Tender.
 */
@Entity
@Table(name = "tender")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Tender implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tender_ref_number")
    private String tenderRefNumber;

    @Column(name = "tender_ref_name")
    private String tenderRefName;

    @Column(name = "tender_pe_name")
    private String tenderPEName;

    @Column(name = "tender_pe_code")
    private String tenderPECode;

    @Column(name = "tender_type")
    private String tenderType;

    @Column(name = "tender_method")
    private String tenderMethod;

    @Column(name = "tender_on_off")
    private String tenderOnOff;

    @Column(name = "tender_public_date")
    private LocalDate tenderPublicDate;

    @Column(name = "tender_receive_date")
    private LocalDate tenderReceiveDate;

    @Column(name = "tender_dead_line_date")
    private LocalDate tenderDeadLineDate;

    @Column(name = "tender_open_date")
    private LocalDate tenderOpenDate;

    @OneToMany(mappedBy = "tender")
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<Lot> lotByTenders = new HashSet<>();
    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTenderRefNumber() {
        return tenderRefNumber;
    }

    public Tender tenderRefNumber(String tenderRefNumber) {
        this.tenderRefNumber = tenderRefNumber;
        return this;
    }

    public void setTenderRefNumber(String tenderRefNumber) {
        this.tenderRefNumber = tenderRefNumber;
    }

    public String getTenderRefName() {
        return tenderRefName;
    }

    public Tender tenderRefName(String tenderRefName) {
        this.tenderRefName = tenderRefName;
        return this;
    }

    public void setTenderRefName(String tenderRefName) {
        this.tenderRefName = tenderRefName;
    }

    public String getTenderPEName() {
        return tenderPEName;
    }

    public Tender tenderPEName(String tenderPEName) {
        this.tenderPEName = tenderPEName;
        return this;
    }

    public void setTenderPEName(String tenderPEName) {
        this.tenderPEName = tenderPEName;
    }

    public String getTenderPECode() {
        return tenderPECode;
    }

    public Tender tenderPECode(String tenderPECode) {
        this.tenderPECode = tenderPECode;
        return this;
    }

    public void setTenderPECode(String tenderPECode) {
        this.tenderPECode = tenderPECode;
    }

    public String getTenderType() {
        return tenderType;
    }

    public Tender tenderType(String tenderType) {
        this.tenderType = tenderType;
        return this;
    }

    public void setTenderType(String tenderType) {
        this.tenderType = tenderType;
    }

    public String getTenderMethod() {
        return tenderMethod;
    }

    public Tender tenderMethod(String tenderMethod) {
        this.tenderMethod = tenderMethod;
        return this;
    }

    public void setTenderMethod(String tenderMethod) {
        this.tenderMethod = tenderMethod;
    }

    public String getTenderOnOff() {
        return tenderOnOff;
    }

    public Tender tenderOnOff(String tenderOnOff) {
        this.tenderOnOff = tenderOnOff;
        return this;
    }

    public void setTenderOnOff(String tenderOnOff) {
        this.tenderOnOff = tenderOnOff;
    }

    public LocalDate getTenderPublicDate() {
        return tenderPublicDate;
    }

    public Tender tenderPublicDate(LocalDate tenderPublicDate) {
        this.tenderPublicDate = tenderPublicDate;
        return this;
    }

    public void setTenderPublicDate(LocalDate tenderPublicDate) {
        this.tenderPublicDate = tenderPublicDate;
    }

    public LocalDate getTenderReceiveDate() {
        return tenderReceiveDate;
    }

    public Tender tenderReceiveDate(LocalDate tenderReceiveDate) {
        this.tenderReceiveDate = tenderReceiveDate;
        return this;
    }

    public void setTenderReceiveDate(LocalDate tenderReceiveDate) {
        this.tenderReceiveDate = tenderReceiveDate;
    }

    public LocalDate getTenderDeadLineDate() {
        return tenderDeadLineDate;
    }

    public Tender tenderDeadLineDate(LocalDate tenderDeadLineDate) {
        this.tenderDeadLineDate = tenderDeadLineDate;
        return this;
    }

    public void setTenderDeadLineDate(LocalDate tenderDeadLineDate) {
        this.tenderDeadLineDate = tenderDeadLineDate;
    }

    public LocalDate getTenderOpenDate() {
        return tenderOpenDate;
    }

    public Tender tenderOpenDate(LocalDate tenderOpenDate) {
        this.tenderOpenDate = tenderOpenDate;
        return this;
    }

    public void setTenderOpenDate(LocalDate tenderOpenDate) {
        this.tenderOpenDate = tenderOpenDate;
    }

    public Set<Lot> getLotByTenders() {
        return lotByTenders;
    }

    public Tender lotByTenders(Set<Lot> lots) {
        this.lotByTenders = lots;
        return this;
    }

    public Tender addLotByTender(Lot lot) {
        this.lotByTenders.add(lot);
        lot.setTender(this);
        return this;
    }

    public Tender removeLotByTender(Lot lot) {
        this.lotByTenders.remove(lot);
        lot.setTender(null);
        return this;
    }

    public void setLotByTenders(Set<Lot> lots) {
        this.lotByTenders = lots;
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
        Tender tender = (Tender) o;
        if (tender.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), tender.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Tender{" +
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
