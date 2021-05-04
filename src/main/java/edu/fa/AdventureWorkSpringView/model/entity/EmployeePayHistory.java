package edu.fa.AdventureWorkSpringView.model.entity;

import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "EmployeePayHistory", schema = "HumanResources")
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class EmployeePayHistory {

    @EmbeddedId
    private EmployeePayHistoryID employeePayHistoryID;

    @Column(name = "Rate")
    private BigDecimal rate;

    @Column(name = "PayFrequency")
    private Short payFrequency;

    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;

    @ManyToOne
    //@JoinColumn(name = "fk_BusinessEntityID")
    @MapsId("businessEntityID")
    private Employee employee;

    public EmployeePayHistory() {
    }

    public EmployeePayHistory(EmployeePayHistoryID employeePayHistoryID, BigDecimal rate, Short payFrequency, Date modifiedDate) {
        this.employeePayHistoryID = employeePayHistoryID;
        this.rate = rate;
        this.payFrequency = payFrequency;
        this.modifiedDate = modifiedDate;
    }

    public EmployeePayHistoryID getEmployeePayHistoryID() {
        return employeePayHistoryID;
    }

    public void setEmployeePayHistoryID(EmployeePayHistoryID employeePayHistoryID) {
        this.employeePayHistoryID = employeePayHistoryID;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public Short getPayFrequency() {
        return payFrequency;
    }

    public void setPayFrequency(Short payFrequency) {
        this.payFrequency = payFrequency;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }
}
