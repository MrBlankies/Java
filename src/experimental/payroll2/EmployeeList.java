package experimental.payroll2;

import experimental.payroll1.Employee;

import java.util.ArrayList;

public class EmployeeList {
    private ArrayList<Clerk> clerks;
    private ArrayList<Manager> managers;
    private ArrayList<ContractWorker> contracts;

    public EmployeeList() {
        clerks = new ArrayList<>();
        managers = new ArrayList<>();
        contracts = new ArrayList<>();
    }

    public void loadEmployees() {
        clerks.add(new Clerk(111,"John", "john@example.com", 1000.0,0));
        clerks.add(new Clerk(222,"Jane", "jane@example.com", 1200.0,4));
        managers.add(new Manager(333,"Jack", "jack@example.com", 5500.0,3800.0));
        contracts.add(new ContractWorker(333,"James", "james@example.com", 35,25.2));
    }

    public void printPayroll() {
        for (Clerk cl : clerks) {
            System.out.println(cl);
        }
        for (Manager m : managers) {
            System.out.println(m);
        }
        for (ContractWorker c : contracts) {
            System.out.println(c);
        }
    }
}
