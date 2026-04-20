package com;

import com.admin.model.Employee;
import com.admin.service.AdminService;

public class AdminApplication {

    public static void main(String[] args) {

        AdminService admin = new AdminService();

        // Register employee
        admin.registerEmployee(new Employee(1, "Anagha", 50000));

        // Request leave
        admin.requestLeave(1);

        // Approve leave
        admin.approveLeave(0);

        // Generate payroll
        double salary = admin.generateSalary(1);

        System.out.println("Final Salary: " + salary);
        System.out.println("Leave Status: " + admin.getLeave(0).getStatus());
    }
}