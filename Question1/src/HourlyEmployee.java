public class HourlyEmployee extends Employee {
    private double wage; 
    private double hours; 

    // Constructor
    public HourlyEmployee(String name, String lastName, String ssn, double wage, double hours) {
        super(name, lastName, ssn);
        this.wage = wage;
        this.hours = hours;
    }

    // Calculate earnings
    public double earnings() {
        if (hours <= 40) {
            return wage * hours;
        } else { // Overtime pay
            return 40 * wage + (hours - 40) * wage * 1.5;
        }
    }

    public void print() {
    super.print();
    System.out.println("Hourly Wage: $" + String.format("%,.2f", wage) + ", Hours Worked: " + hours);
    }
}