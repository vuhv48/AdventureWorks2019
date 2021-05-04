package edu.fa.AdventureWorkSpringView.model.entity;

import com.sun.istack.NotNull;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class EmployeePayHistoryID implements Serializable {

    @NotNull
    @Column(name = "BusinessEntityID")
    private int businessEntityID;

    @NotNull
    @Column(name = "RateChangeDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rateChangeDate;

    public EmployeePayHistoryID() {
    }

    public EmployeePayHistoryID(int businessEntityID, Date rateChangeDate) {
        this.businessEntityID = businessEntityID;
        this.rateChangeDate = rateChangeDate;
    }

    public int getBusinessEntityID() {
        return businessEntityID;
    }

    public void setBusinessEntityID(int businessEntityID) {
        this.businessEntityID = businessEntityID;
    }

    public Date getRateChangeDate() {
        return rateChangeDate;
    }

    public void setRateChangeDate(Date rateChangeDate) {
        this.rateChangeDate = rateChangeDate;
    }
}
