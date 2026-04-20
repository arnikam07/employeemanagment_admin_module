package com.admin.service;

import com.admin.model.Employee;
import com.admin.model.LeaveRequest;

import java.util.*;

public class AdminService {

    private Map<Integer, Employee> employees = new HashMap<>();
    private List<LeaveRequest> leaves = new ArrayList<>();

    // Register employee
    public void registerEmployee(Employee emp) {
        employees.put(emp.getId(), emp);
    }

    // Simulate employee requesting leave
    public void requestLeave(int empId) {
        leaves.add(new LeaveRequest(empId));
    }

    // Approve leave
    public void approveLeave(int index) {
        leaves.get(index).setStatus("APPROVED");
    }

    // Reject leave
    public void rejectLeave(int index) {
        leaves.get(index).setStatus("REJECTED");
    }

    // Generate payroll (after tax)
    public double generateSalary(int empId) {
        Employee emp = employees.get(empId);
        double tax = emp.getSalary() * 0.1;
        return emp.getSalary() - tax;
    }

    public LeaveRequest getLeave(int index) {
        return leaves.get(index);
    }

    public Employee getEmployee(int id) {
        return employees.get(id);
    }
}