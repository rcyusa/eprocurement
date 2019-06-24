package rw.co.snw.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/**
 * A UserExtra.
 */
@Entity
@Table(name = "user_extra")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class UserExtra implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "phone")
    private String phone;

    @ManyToOne
    @JsonIgnoreProperties("userByBranches")
    private Branch branch;

    @OneToOne
    @JoinColumn(unique = true)
    private User user;

    @OneToMany(mappedBy = "userExtra")
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<Policy> policyByUsers = new HashSet<>();
    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public UserExtra phone(String phone) {
        this.phone = phone;
        return this;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Branch getBranch() {
        return branch;
    }

    public UserExtra branch(Branch branch) {
        this.branch = branch;
        return this;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public User getUser() {
        return user;
    }

    public UserExtra user(User user) {
        this.user = user;
        return this;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<Policy> getPolicyByUsers() {
        return policyByUsers;
    }

    public UserExtra policyByUsers(Set<Policy> policies) {
        this.policyByUsers = policies;
        return this;
    }

    public UserExtra addPolicyByUser(Policy policy) {
        this.policyByUsers.add(policy);
        policy.setUserExtra(this);
        return this;
    }

    public UserExtra removePolicyByUser(Policy policy) {
        this.policyByUsers.remove(policy);
        policy.setUserExtra(null);
        return this;
    }

    public void setPolicyByUsers(Set<Policy> policies) {
        this.policyByUsers = policies;
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
        UserExtra userExtra = (UserExtra) o;
        if (userExtra.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), userExtra.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "UserExtra{" +
            "id=" + getId() +
            ", phone='" + getPhone() + "'" +
            "}";
    }
}
