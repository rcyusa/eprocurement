package rw.co.snw.domain;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

/**
 * A Policy.
 */
@Entity
@Table(name = "policy")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Policy implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "policy_number")
    private String policyNumber;

    @Column(name = "policy_type")
    private String policyType;

    @Column(name = "policy_amount")
    private Double policyAmount;

    @Column(name = "policy_amount_char")
    private String policyAmountChar;

    @Column(name = "policy_amount_currancy")
    private String policyAmountCurrancy;

    @Column(name = "prime_amount")
    private Double primeAmount;

    @Column(name = "policy_operation_date")
    private LocalDate policyOperationDate;

    @Column(name = "policy_start_date")
    private LocalDate policyStartDate;

    @Column(name = "policy_expiration_date")
    private LocalDate policyExpirationDate;

    @Column(name = "policy_status")
    private String policyStatus;

    @Column(name = "policy_comment")
    private String policyComment;

    @OneToOne
    @JoinColumn(unique = true)
    private Lot lotOnPolicy;

    @ManyToOne
    @JsonIgnoreProperties("policyByClients")
    private Client client;

    @ManyToOne
    @JsonIgnoreProperties("policyByUsers")
    private UserExtra userExtra;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public Policy policyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
        return this;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getPolicyType() {
        return policyType;
    }

    public Policy policyType(String policyType) {
        this.policyType = policyType;
        return this;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    public Double getPolicyAmount() {
        return policyAmount;
    }

    public Policy policyAmount(Double policyAmount) {
        this.policyAmount = policyAmount;
        return this;
    }

    public void setPolicyAmount(Double policyAmount) {
        this.policyAmount = policyAmount;
    }

    public String getPolicyAmountChar() {
        return policyAmountChar;
    }

    public Policy policyAmountChar(String policyAmountChar) {
        this.policyAmountChar = policyAmountChar;
        return this;
    }

    public void setPolicyAmountChar(String policyAmountChar) {
        this.policyAmountChar = policyAmountChar;
    }

    public String getPolicyAmountCurrancy() {
        return policyAmountCurrancy;
    }

    public Policy policyAmountCurrancy(String policyAmountCurrancy) {
        this.policyAmountCurrancy = policyAmountCurrancy;
        return this;
    }

    public void setPolicyAmountCurrancy(String policyAmountCurrancy) {
        this.policyAmountCurrancy = policyAmountCurrancy;
    }

    public Double getPrimeAmount() {
        return primeAmount;
    }

    public Policy primeAmount(Double primeAmount) {
        this.primeAmount = primeAmount;
        return this;
    }

    public void setPrimeAmount(Double primeAmount) {
        this.primeAmount = primeAmount;
    }

    public LocalDate getPolicyOperationDate() {
        return policyOperationDate;
    }

    public Policy policyOperationDate(LocalDate policyOperationDate) {
        this.policyOperationDate = policyOperationDate;
        return this;
    }

    public void setPolicyOperationDate(LocalDate policyOperationDate) {
        this.policyOperationDate = policyOperationDate;
    }

    public LocalDate getPolicyStartDate() {
        return policyStartDate;
    }

    public Policy policyStartDate(LocalDate policyStartDate) {
        this.policyStartDate = policyStartDate;
        return this;
    }

    public void setPolicyStartDate(LocalDate policyStartDate) {
        this.policyStartDate = policyStartDate;
    }

    public LocalDate getPolicyExpirationDate() {
        return policyExpirationDate;
    }

    public Policy policyExpirationDate(LocalDate policyExpirationDate) {
        this.policyExpirationDate = policyExpirationDate;
        return this;
    }

    public void setPolicyExpirationDate(LocalDate policyExpirationDate) {
        this.policyExpirationDate = policyExpirationDate;
    }

    public String getPolicyStatus() {
        return policyStatus;
    }

    public Policy policyStatus(String policyStatus) {
        this.policyStatus = policyStatus;
        return this;
    }

    public void setPolicyStatus(String policyStatus) {
        this.policyStatus = policyStatus;
    }

    public String getPolicyComment() {
        return policyComment;
    }

    public Policy policyComment(String policyComment) {
        this.policyComment = policyComment;
        return this;
    }

    public void setPolicyComment(String policyComment) {
        this.policyComment = policyComment;
    }

    public Lot getLotOnPolicy() {
        return lotOnPolicy;
    }

    public Policy lotOnPolicy(Lot lot) {
        this.lotOnPolicy = lot;
        return this;
    }

    public void setLotOnPolicy(Lot lot) {
        this.lotOnPolicy = lot;
    }

    public Client getClient() {
        return client;
    }

    public Policy client(Client client) {
        this.client = client;
        return this;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public UserExtra getUserExtra() {
        return userExtra;
    }

    public Policy userExtra(UserExtra userExtra) {
        this.userExtra = userExtra;
        return this;
    }

    public void setUserExtra(UserExtra userExtra) {
        this.userExtra = userExtra;
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
        Policy policy = (Policy) o;
        if (policy.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), policy.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Policy{" +
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
            "}";
    }
}
