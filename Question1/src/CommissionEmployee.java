public class CommissionEmployee extends Employee {
    private double commisionRate;
    private double grossSales;

    // Constructor
    public CommissionEmployee(String name, String lastName, String ssn, double commisionRate, double grossSales) {
        super(name, lastName, ssn);
        this.commisionRate = commisionRate;
        this.grossSales = grossSales;
    }

    // Method to calculate earnings
    public double earnings() {
        return commisionRate * grossSales;
    }

    public void print() {   
    super.print();
    System.out.println("Commission Rate: " + commisionRate + ", Gross Sales: $" + String.format("%,.2f", grossSales));
    }
}   
