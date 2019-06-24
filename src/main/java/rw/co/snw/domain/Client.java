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
 * A Client.
 */
@Entity
@Table(name = "client")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Client implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "client_name")
    private String clientName;

    @Column(name = "client_tin_number")
    private String clientTINNumber;

    @Column(name = "client_address")
    private String clientAddress;

    @Column(name = "client_po_box")
    private String clientPoBox;

    @Column(name = "client_cell_phone_number")
    private String clientCellPhoneNumber;

    @Column(name = "client_tel_number")
    private String clientTelNumber;

    @Column(name = "client_email_address")
    private String clientEmailAddress;

    @OneToMany(mappedBy = "client")
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<Policy> policyByClients = new HashSet<>();
    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClientName() {
        return clientName;
    }

    public Client clientName(String clientName) {
        this.clientName = clientName;
        return this;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientTINNumber() {
        return clientTINNumber;
    }

    public Client clientTINNumber(String clientTINNumber) {
        this.clientTINNumber = clientTINNumber;
        return this;
    }

    public void setClientTINNumber(String clientTINNumber) {
        this.clientTINNumber = clientTINNumber;
    }

    public String getClientAddress() {
        return clientAddress;
    }

    public Client clientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
        return this;
    }

    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }

    public String getClientPoBox() {
        return clientPoBox;
    }

    public Client clientPoBox(String clientPoBox) {
        this.clientPoBox = clientPoBox;
        return this;
    }

    public void setClientPoBox(String clientPoBox) {
        this.clientPoBox = clientPoBox;
    }

    public String getClientCellPhoneNumber() {
        return clientCellPhoneNumber;
    }

    public Client clientCellPhoneNumber(String clientCellPhoneNumber) {
        this.clientCellPhoneNumber = clientCellPhoneNumber;
        return this;
    }

    public void setClientCellPhoneNumber(String clientCellPhoneNumber) {
        this.clientCellPhoneNumber = clientCellPhoneNumber;
    }

    public String getClientTelNumber() {
        return clientTelNumber;
    }

    public Client clientTelNumber(String clientTelNumber) {
        this.clientTelNumber = clientTelNumber;
        return this;
    }

    public void setClientTelNumber(String clientTelNumber) {
        this.clientTelNumber = clientTelNumber;
    }

    public String getClientEmailAddress() {
        return clientEmailAddress;
    }

    public Client clientEmailAddress(String clientEmailAddress) {
        this.clientEmailAddress = clientEmailAddress;
        return this;
    }

    public void setClientEmailAddress(String clientEmailAddress) {
        this.clientEmailAddress = clientEmailAddress;
    }

    public Set<Policy> getPolicyByClients() {
        return policyByClients;
    }

    public Client policyByClients(Set<Policy> policies) {
        this.policyByClients = policies;
        return this;
    }

    public Client addPolicyByClient(Policy policy) {
        this.policyByClients.add(policy);
        policy.setClient(this);
        return this;
    }

    public Client removePolicyByClient(Policy policy) {
        this.policyByClients.remove(policy);
        policy.setClient(null);
        return this;
    }

    public void setPolicyByClients(Set<Policy> policies) {
        this.policyByClients = policies;
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
        Client client = (Client) o;
        if (client.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), client.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Client{" +
            "id=" + getId() +
            ", clientName='" + getClientName() + "'" +
            ", clientTINNumber='" + getClientTINNumber() + "'" +
            ", clientAddress='" + getClientAddress() + "'" +
            ", clientPoBox='" + getClientPoBox() + "'" +
            ", clientCellPhoneNumber='" + getClientCellPhoneNumber() + "'" +
            ", clientTelNumber='" + getClientTelNumber() + "'" +
            ", clientEmailAddress='" + getClientEmailAddress() + "'" +
            "}";
    }
}
