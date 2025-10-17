package com.solid.s.good;

public class EmployeeRepository {
    public void save(GoodEmployee goodEmployee) {
        System.out.printf("%s saved to database.\n", goodEmployee.getName());
    }
}
