package experimental.payroll1;

import java.util.ArrayList;

public class EmployeeList {
    private ArrayList<Employee> employees;

    public EmployeeList() {
        employees = new ArrayList<>();
    }

    public void loadEmployees() {
        employees.add(new Employee(1,111,"John", "john@example.com", 1000.0,0));
        employees.add(new Employee(1,222,"Jane", "jane@example.com", 1200.0,4));
        employees.add(new Employee(2,333,"Jack", "jack@example.com", 5500.0,3800.0));
        employees.add(new Employee(3,333,"James", "james@example.com", 35,25.2));
    }

    public void printPayroll() {
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

}
