package edu.fa.AdventureWorkSpringView.model.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class EmployeeDepartmentHistoryID implements Serializable {

    //@Column(name = "BusinessEntityID")
    private int businessEntityID;

    @Column(name = "DepartmentID")
    private short departmentID;

    @Column(name ="ShiftID")
    private short shiftID;

    @Column(name = "StartDate")
    @Temporal(TemporalType.DATE)
    private Date startDate;


    public int getBusinessEntityID() {
        return businessEntityID;
    }

    public void setBusinessEntityID(int businessEntityID) {
        this.businessEntityID = businessEntityID;
    }

    public short getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(short departmentID) {
        this.departmentID = departmentID;
    }

    public short getShiftID() {
        return shiftID;
    }

    public void setShiftID(short shiftID) {
        this.shiftID = shiftID;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
}
