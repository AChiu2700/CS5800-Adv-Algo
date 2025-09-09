public class SalariedEmployee extends Employee {
    private double weeklySalary;

    // Constructor
    public SalariedEmployee(String name, String lastName, String ssn, double weeklySalary) {
        super(name, lastName, ssn);
        this.weeklySalary = weeklySalary;
    }

    // Method to calculate earnings
    public double earnings() {
        return weeklySalary;
    }

    public void print() {
    super.print();
    System.out.println("Weekly Salary: $" + String.format("%,.2f", weeklySalary));
    }
}
