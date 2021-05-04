package edu.fa.AdventureWorkSpringView.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "EmployeeDepartmentHistory", schema = "HumanResources")
public class EmployeeDepartmentHistory {

    @EmbeddedId
    private EmployeeDepartmentHistoryID employeeDepartmentHistoryID;

    @Temporal(TemporalType.DATE)
    @Column(name = "EndDate")
    private Date endDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "ModifiedDate")
    private Date modifiedDate;

/////////////////////////////
    @ManyToOne
    @MapsId("businessEntityID")
    @JoinColumn(name = "businessEntityID")
    private Employee employee2;

    public Employee getEmployee2() {
        return employee2;
    }

    public void setEmployee2(Employee employee2) {
        this.employee2 = employee2;
    }

    public EmployeeDepartmentHistory(EmployeeDepartmentHistoryID employeeDepartmentHistoryID, Date endDate, Date modifiedDate, Employee employee2) {
        this.employeeDepartmentHistoryID = employeeDepartmentHistoryID;
        this.endDate = endDate;
        this.modifiedDate = modifiedDate;
    }
    ////////////////////////////////////////
//    @OneToMany(mappedBy = "employeeDepartmentHistory")
//    @JsonIgnore
//    @org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
//    private List<Employee> products = new ArrayList<>();
//
//    public List<Employee> getProducts() {
//        return products;
//    }
//
//    public void setProducts(List<Employee> products) {
//        this.products = products;
//    }
    //////////////////////////////////////////////////

    public EmployeeDepartmentHistoryID getEmployeeDepartmentHistoryID() {
        return employeeDepartmentHistoryID;
    }

    public void setEmployeeDepartmentHistoryID(EmployeeDepartmentHistoryID employeeDepartmentHistoryID) {
        this.employeeDepartmentHistoryID = employeeDepartmentHistoryID;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeeDepartmentHistory that = (EmployeeDepartmentHistory) o;

        if (employeeDepartmentHistoryID != null ? !employeeDepartmentHistoryID.equals(that.employeeDepartmentHistoryID) : that.employeeDepartmentHistoryID != null)
            return false;
        if (endDate != null ? !endDate.equals(that.endDate) : that.endDate != null) return false;
        if (modifiedDate != null ? !modifiedDate.equals(that.modifiedDate) : that.modifiedDate != null) return false;
        if (employee2 != null ? !employee2.equals(that.employee2) : that.employee2 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = employeeDepartmentHistoryID != null ? employeeDepartmentHistoryID.hashCode() : 0;
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (modifiedDate != null ? modifiedDate.hashCode() : 0);
        result = 31 * result + (employee2 != null ? employee2.hashCode() : 0);
        return result;
    }

    public EmployeeDepartmentHistory() {
    }
}
