package edu.fa.AdventureWorkSpringView.model.entity;



import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Shift", schema = "HumanResources")
@Data
public class Shift {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ShiftID")
    private Short shiftID;

    @Column(name = "Name")
    private String name;

    @Column(name = "StartTime")
    @Temporal(TemporalType.TIME)
    private Date startTime;

    @Column(name = "EndTime")
    @Temporal(TemporalType.TIME)
    private Date endTime;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "ModifiedDate")
    private Date modifiedDate;


    public Shift() {
    }

    public Shift(Short shiftID, String name, Date startTime, Date endTime, Date modifiedDate) {
        this.shiftID = shiftID;
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
        this.modifiedDate = modifiedDate;
    }

    public Short getShiftID() {
        return shiftID;
    }

    public void setShiftID(Short shiftID) {
        this.shiftID = shiftID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }
}
