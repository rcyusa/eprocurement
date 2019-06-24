package rw.co.snw.domain;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Objects;

/**
 * A Lot.
 */
@Entity
@Table(name = "lot")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Lot implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "lot_name")
    private String lotName;

    @Column(name = "lot_number")
    private String lotNumber;

    @Column(name = "lot_desc")
    private String lotDesc;

    @Column(name = "lot_amount")
    private Double lotAmount;

    @Column(name = "lot_currancy")
    private String lotCurrancy;

    @Column(name = "lot_ref_number")
    private String lotRefNumber;

    @ManyToOne
    @JsonIgnoreProperties("lotByTenders")
    private Tender tender;

    @ManyToOne
    @JsonIgnoreProperties("lotByContracts")
    private Contract contract;

    public Lot(String lotName, String lotNumber, String lotDesc, Double lotAmount,String lotCurrancy) {
        this.lotName = lotName;
        this.lotNumber = lotNumber;
        this.lotDesc = lotDesc;
        this.lotAmount = lotAmount;
        this.lotCurrancy=lotCurrancy;
    }

    public Lot() { }

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLotName() {
        return lotName;
    }

    public Lot lotName(String lotName) {
        this.lotName = lotName;
        return this;
    }

    public void setLotName(String lotName) {
        this.lotName = lotName;
    }

    public String getLotNumber() {
        return lotNumber;
    }

    public Lot lotNumber(String lotNumber) {
        this.lotNumber = lotNumber;
        return this;
    }

    public void setLotNumber(String lotNumber) {
        this.lotNumber = lotNumber;
    }

    public String getLotDesc() {
        return lotDesc;
    }

    public Lot lotDesc(String lotDesc) {
        this.lotDesc = lotDesc;
        return this;
    }

    public void setLotDesc(String lotDesc) {
        this.lotDesc = lotDesc;
    }

    public Double getLotAmount() {
        return lotAmount;
    }

    public Lot lotAmount(Double lotAmount) {
        this.lotAmount = lotAmount;
        return this;
    }

    public void setLotAmount(Double lotAmount) {
        this.lotAmount = lotAmount;
    }

    public String getLotCurrancy() {
        return lotCurrancy;
    }

    public Lot lotCurrancy(String lotCurrancy) {
        this.lotCurrancy = lotCurrancy;
        return this;
    }

    public void setLotCurrancy(String lotCurrancy) {
        this.lotCurrancy = lotCurrancy;
    }

    public String getLotRefNumber() {
        return lotRefNumber;
    }

    public Lot lotRefNumber(String lotRefNumber) {
        this.lotRefNumber = lotRefNumber;
        return this;
    }

    public void setLotRefNumber(String lotRefNumber) {
        this.lotRefNumber = lotRefNumber;
    }

    public Tender getTender() {
        return tender;
    }

    public Lot tender(Tender tender) {
        this.tender = tender;
        return this;
    }

    public void setTender(Tender tender) {
        this.tender = tender;
    }

    public Contract getContract() {
        return contract;
    }

    public Lot contract(Contract contract) {
        this.contract = contract;
        return this;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
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
        Lot lot = (Lot) o;
        if (lot.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), lot.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Lot{" +
            "id=" + getId() +
            ", lotName='" + getLotName() + "'" +
            ", lotNumber='" + getLotNumber() + "'" +
            ", lotDesc='" + getLotDesc() + "'" +
            ", lotAmount=" + getLotAmount() +
            ", lotCurrancy='" + getLotCurrancy() + "'" +
            ", lotRefNumber='" + getLotRefNumber() + "'" +
            "}";
    }
}
