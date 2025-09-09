public class BaseEmployee extends Employee {
    private double baseSalary;

    // Constructor
    public BaseEmployee(String name, String lastName, String ssn, double baseSalary) {
        super(name, lastName, ssn);
        this.baseSalary = baseSalary;
    }

    public double earnings() {
        return baseSalary;
    }

    public void print() {
    super.print();
    System.out.println("Base Salary: $" + String.format("%,.2f", baseSalary));
    }
}
