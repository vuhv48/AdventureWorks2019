package edu.fa.AdventureWorkSpringView.model.dto;

public class DepartmentDTO {
    private String departmentID;
    private String name;
    private String groupName;
    private String modifiedDate;

    public DepartmentDTO() {
    }

    public DepartmentDTO(String departmentID, String name, String groupName, String modifiedDate) {
        this.departmentID = departmentID;
        this.name = name;
        this.groupName = groupName;
        this.modifiedDate = modifiedDate;
    }

    public String getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(String departmentID) {
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

    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }
}
