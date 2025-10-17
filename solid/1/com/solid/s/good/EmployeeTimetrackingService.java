package com.solid.s.good;

public class EmployeeTimetrackingService {
    public String reportHours(GoodEmployee goodEmployee) {
        return String.format("%s worked %d hours.\n", goodEmployee.getName(), goodEmployee.getHours());
    }

}
