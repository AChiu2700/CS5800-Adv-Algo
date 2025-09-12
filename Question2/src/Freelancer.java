public class Freelancer implements Payable {
    private String name;
    private String lname;
    private double hourlyRate;
    private double hoursWorked;

    public Freelancer(String name, String lname, double hourlyRate, double hoursWorked) {
        this.name = name;
        this.lname = lname;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Getters
    public String getFirstName() { return name; }
    public String getLastName() { return lname; }
    public double getHourlyRate() { return hourlyRate; }
    public double getHoursWorked() { return hoursWorked; }

    // Setteers
    public void setHoursWorked(double hoursWorked) {
        if (hoursWorked< 0) {
            hoursWorked = 0;
        }
        this.hoursWorked = hoursWorked; 
    }

    //Overtime pay
    public double calculatePayment() {
        double payment = hourlyRate * hoursWorked;
        if (hoursWorked > 40) {
            payment = hourlyRate * 40;
            double overtimeHours = hoursWorked - 40;
            // System.out.println("Overtime Hours: " + overtimeHours);
            // double payments = overtimeHours * hourlyRate * 1.5; 
            payment += overtimeHours * hourlyRate * 1.5; 
            // System.out.println("Overtime Payment: $" + payments);
        }
        return payment;
    }

    public String getPayeeName(){
        return name + " " + lname;
    }

    //Test print
    public void print(){
        System.out.println("Freelancer: " + name + " " + lname);
        System.out.println("Hourly Rate: $" + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Total Payment: $" + calculatePayment());
    }
}
