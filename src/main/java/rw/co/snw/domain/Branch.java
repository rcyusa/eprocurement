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
 * A Branch.
 */
@Entity
@Table(name = "branch")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Branch implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "branch_name")
    private String branchName;

    @Column(name = "branch_address")
    private String branchAddress;

    @Column(name = "branch_manager")
    private String branchManager;

    @Column(name = "branch_phone")
    private String branchPhone;

    @Column(name = "branch_fax")
    private String branchFax;

    @Column(name = "branch_email")
    private String branchEmail;

    @OneToMany(mappedBy = "branch")
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<UserExtra> userByBranches = new HashSet<>();
    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBranchName() {
        return branchName;
    }

    public Branch branchName(String branchName) {
        this.branchName = branchName;
        return this;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getBranchAddress() {
        return branchAddress;
    }

    public Branch branchAddress(String branchAddress) {
        this.branchAddress = branchAddress;
        return this;
    }

    public void setBranchAddress(String branchAddress) {
        this.branchAddress = branchAddress;
    }

    public String getBranchManager() {
        return branchManager;
    }

    public Branch branchManager(String branchManager) {
        this.branchManager = branchManager;
        return this;
    }

    public void setBranchManager(String branchManager) {
        this.branchManager = branchManager;
    }

    public String getBranchPhone() {
        return branchPhone;
    }

    public Branch branchPhone(String branchPhone) {
        this.branchPhone = branchPhone;
        return this;
    }

    public void setBranchPhone(String branchPhone) {
        this.branchPhone = branchPhone;
    }

    public String getBranchFax() {
        return branchFax;
    }

    public Branch branchFax(String branchFax) {
        this.branchFax = branchFax;
        return this;
    }

    public void setBranchFax(String branchFax) {
        this.branchFax = branchFax;
    }

    public String getBranchEmail() {
        return branchEmail;
    }

    public Branch branchEmail(String branchEmail) {
        this.branchEmail = branchEmail;
        return this;
    }

    public void setBranchEmail(String branchEmail) {
        this.branchEmail = branchEmail;
    }

    public Set<UserExtra> getUserByBranches() {
        return userByBranches;
    }

    public Branch userByBranches(Set<UserExtra> userExtras) {
        this.userByBranches = userExtras;
        return this;
    }

    public Branch addUserByBranch(UserExtra userExtra) {
        this.userByBranches.add(userExtra);
        userExtra.setBranch(this);
        return this;
    }

    public Branch removeUserByBranch(UserExtra userExtra) {
        this.userByBranches.remove(userExtra);
        userExtra.setBranch(null);
        return this;
    }

    public void setUserByBranches(Set<UserExtra> userExtras) {
        this.userByBranches = userExtras;
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
        Branch branch = (Branch) o;
        if (branch.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), branch.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Branch{" +
            "id=" + getId() +
            ", branchName='" + getBranchName() + "'" +
            ", branchAddress='" + getBranchAddress() + "'" +
            ", branchManager='" + getBranchManager() + "'" +
            ", branchPhone='" + getBranchPhone() + "'" +
            ", branchFax='" + getBranchFax() + "'" +
            ", branchEmail='" + getBranchEmail() + "'" +
            "}";
    }
}
