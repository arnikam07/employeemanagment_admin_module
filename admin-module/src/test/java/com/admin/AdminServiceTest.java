package com.admin;

import com.admin.model.Employee;
import com.admin.service.AdminService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AdminServiceTest {

    @Test
    void testAdminFlow() {

        AdminService admin = new AdminService();

        // 1. Register employee
        admin.registerEmployee(new Employee(1, "Anagha", 50000));
        assertNotNull(admin.getEmployee(1));

        // 2. Request leave
        admin.requestLeave(1);

        // 3. Approve leave
        admin.approveLeave(0);
        assertEquals("APPROVED", admin.getLeave(0).getStatus());

        // 4. Payroll calculation
        double salary = admin.generateSalary(1);
        assertEquals(45000, salary);
    }
}