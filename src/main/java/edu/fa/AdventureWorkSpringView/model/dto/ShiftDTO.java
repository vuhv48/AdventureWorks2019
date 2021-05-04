package edu.fa.AdventureWorkSpringView.model.dto;


public class ShiftDTO {
    private String shiftID;
    private String name;
    private String startTime;
    private String endTime;
    private String modifiedDate;

    public ShiftDTO() {
    }

    public ShiftDTO(String shiftID, String name, String startTime, String endTime, String modifiedDate) {
        this.shiftID = shiftID;
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
        this.modifiedDate = modifiedDate;
    }

    public String getShiftID() {
        return shiftID;
    }

    public void setShiftID(String shiftID) {
        this.shiftID = shiftID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }
}
