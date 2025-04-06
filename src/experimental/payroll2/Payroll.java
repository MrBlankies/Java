package experimental.payroll2;

public class Payroll {
    public static void main(String[] args) {
        EmployeeList employees = new EmployeeList();
        employees.loadEmployees();
        employees.printPayroll();
    }
}
