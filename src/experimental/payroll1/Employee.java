package experimental.payroll1;


public class Employee {
    private int type;
    private int ssn;
    private String name;
    private String email;
    private Double salary;
    private double bonus;
    private int hoursWorked;
    private double hourlyRate;
    public static final double overtimeAmount = 35.0;

    public Employee(int type,int ssn, String name, String email) {
        this.type = type;
        this.ssn = ssn;
        this.name = name;
        this.email = email;
    }

    // 1. Clerk
    public Employee(int type,int ssn, String name, String email, double salary, int hoursWorked) {
        this(type,ssn,name,email);
        this.salary = salary;
        this.hoursWorked = hoursWorked;
    }

    // 2. Manager
    public Employee(int type,int ssn, String name, String email, double salary,double bonus) {
        this(type, ssn, name, email);
        this.salary = salary;
        this.bonus = bonus;
    }

    // 3. ContractWorker
    public Employee(int type,int ssn, String name, String email, int hoursWorked, double hourlyRate) {
        this(type,ssn,name,email);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public double calculatePayment() {
        if (type == 1) {
            return salary + (hoursWorked * overtimeAmount);
        } else if (type == 2) {
            return salary + bonus;
        } else if (type == 3) {
            return hoursWorked * hourlyRate;
        } else {
            System.out.println("Invalid type");
            return 0;
        }
    }

    public String toString() {
        String stype;
        if (type ==1) {stype = "Clerk";}
        else if (type ==2) {stype = "Manager";}
        else {stype = "Contract";}

        return ssn + " " + name + " " + stype + " " + calculatePayment();
    }
}
