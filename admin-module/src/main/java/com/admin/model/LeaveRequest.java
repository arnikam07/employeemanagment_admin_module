package com.admin.model;

public class LeaveRequest {

    private int empId;
    private String status;

    public LeaveRequest(int empId) {
        this.empId = empId;
        this.status = "PENDING";
    }

    public int getEmpId() {
        return empId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}