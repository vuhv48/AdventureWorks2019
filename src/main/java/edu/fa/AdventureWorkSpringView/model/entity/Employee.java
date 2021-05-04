package edu.fa.AdventureWorkSpringView.model.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Employee", schema = "HumanResources")
public class Employee {
    @Id
    @Column(name = "BusinessEntityID")
    private Integer businessEntityID;
    @Basic(optional = false)
    @Column(name = "NationalIDNumber")
    private String nationalIDNumber;
    @Basic(optional = false)


    @Column(name = "LoginID")
    private String loginID;
    @Lob
    @Column(name = "OrganizationNode")
    @Type(type = "org.hibernate.type.ImageType")
    private byte[] organizationNode;
    @Column(name = "OrganizationLevel")
    private Short organizationLevel;
    @Basic(optional = false)

    @Column(name = "JobTitle")
    private String jobTitle;
    @Basic(optional = false)

    @Column(name = "BirthDate")
    @Temporal(TemporalType.DATE)
    private Date birthDate;
    @Basic(optional = false)


    @Column(name = "MaritalStatus")
    private String maritalStatus;
    @Basic(optional = false)

    @Column(name = "Gender")
    private String gender;
    @Basic(optional = false)

    @Column(name = "HireDate")
    @Temporal(TemporalType.DATE)
    private Date hireDate;
    @Basic(optional = false)

    @Column(name = "SalariedFlag")
    private boolean salariedFlag;

    @Column(name = "VacationHours")
    private short vacationHours;
    @Basic(optional = false)

    @Column(name = "SickLeaveHours")
    private short sickLeaveHours;
    @Basic(optional = false)

    @Column(name = "CurrentFlag")
    private boolean currentFlag;
    @Basic(optional = false)

    @Column(name = "rowguid")
    private String rowguid;
    @Basic(optional = false)

    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    @JsonIgnore
//    @org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private List<EmployeePayHistory> employeePayHistories = new ArrayList<>();


//    @ManyToOne
//    private EmployeeDepartmentHistory employeeDepartmentHistory;
//
//    public List<EmployeePayHistory> getEmployeePayHistories() {
//        return employeePayHistories;
//    }
//
//    public void setEmployeePayHistories(List<EmployeePayHistory> employeePayHistories) {
//        this.employeePayHistories = employeePayHistories;
//    }
//
//    public EmployeeDepartmentHistory getEmployeeDepartmentHistory() {
//        return employeeDepartmentHistory;
//    }
//
//    public void setEmployeeDepartmentHistory(EmployeeDepartmentHistory employeeDepartmentHistory) {
//        this.employeeDepartmentHistory = employeeDepartmentHistory;
//    }
    //////////////////////////////////////////////////////
    @OneToMany(mappedBy = "employee2")
    @JsonIgnore
    @org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private List<EmployeeDepartmentHistory> employeeDepartmentHistories = new ArrayList<>();

    public List<EmployeePayHistory> getEmployeePayHistories() {
        return employeePayHistories;
    }

    public void setEmployeePayHistories(List<EmployeePayHistory> employeePayHistories) {
        this.employeePayHistories = employeePayHistories;
    }

    public Integer getBusinessEntityID() {
        return businessEntityID;
    }

    public void setBusinessEntityID(Integer businessEntityID) {
        this.businessEntityID = businessEntityID;
    }

    public String getNationalIDNumber() {
        return nationalIDNumber;
    }

    public void setNationalIDNumber(String nationalIDNumber) {
        this.nationalIDNumber = nationalIDNumber;
    }

    public String getLoginID() {
        return loginID;
    }

    public void setLoginID(String loginID) {
        this.loginID = loginID;
    }

    public byte[] getOrganizationNode() {
        return organizationNode;
    }

    public void setOrganizationNode(byte[] organizationNode) {
        this.organizationNode = organizationNode;
    }

    public Short getOrganizationLevel() {
        return organizationLevel;
    }

    public void setOrganizationLevel(Short organizationLevel) {
        this.organizationLevel = organizationLevel;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public boolean isSalariedFlag() {
        return salariedFlag;
    }

    public void setSalariedFlag(boolean salariedFlag) {
        this.salariedFlag = salariedFlag;
    }

    public short getVacationHours() {
        return vacationHours;
    }

    public void setVacationHours(short vacationHours) {
        this.vacationHours = vacationHours;
    }

    public short getSickLeaveHours() {
        return sickLeaveHours;
    }

    public void setSickLeaveHours(short sickLeaveHours) {
        this.sickLeaveHours = sickLeaveHours;
    }

    public boolean isCurrentFlag() {
        return currentFlag;
    }

    public void setCurrentFlag(boolean currentFlag) {
        this.currentFlag = currentFlag;
    }

    public String getRowguid() {
        return rowguid;
    }

    public void setRowguid(String rowguid) {
        this.rowguid = rowguid;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }
}
