package com.solid.s;

import com.solid.s.bad.BadEmployee;
import com.solid.s.good.*;

public class SMain {

    public static void main(String[] args) {
        testBadS();
        testGoodS();
    }

    private static void testBadS() {
        BadEmployee employee = new BadEmployee("1", "BadEmployee", 5);
        employee.calculatePay();
        employee.reportHours();
        employee.save();
    }
    ymentService employeePaymentService = new EmployeePaymentService(additionalPaymentService);
        System.out.println(employee + " payed on status: " + employeePaymentService.calculatePay(employee));

    EmployeeTimetrackingService employeeTimetrackingService = new EmployeeTimetrackingService();
        System.out.println(employeeTimetrackingService.reportHours(employee));

    EmployeeRepository employeeRepository = new EmployeeRepository();
    private static void testGoodS() {
        GoodEmployee employee = new GoodEmployee("A", "GoodEmployee!", 42);

        EmployeeAdditionalPaymentService additionalPaymentService = new EmployeeAdditionalPaymentService();
        EmployeePa
        employeeRepository.save(employee);
    }

}
