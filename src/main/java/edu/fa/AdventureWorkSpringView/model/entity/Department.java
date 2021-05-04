package edu.fa.AdventureWorkSpringView.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Department", schema = "HumanResources")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DepartmentID")
    private Integer departmentID;

    @NotNull
    @Column(name = "Name")
    private String name;


    @Basic(optional = false)
    @NotNull
    @Column(name = "GroupName")
    private String groupName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;

    public Department(Integer departmentID, String name, String groupName, Date modifiedDate) {
        this.departmentID = departmentID;
        this.name = name;
        this.groupName = groupName;
        this.modifiedDate = modifiedDate;
    }
    public Department(String name, String groupName, Date modifiedDate) {

        this.name = name;
        this.groupName = groupName;
        this.modifiedDate = modifiedDate;
    }

    public Department() {
    }

    public Integer getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(Integer departmentID) {
        this.departmentID = departmentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

}
