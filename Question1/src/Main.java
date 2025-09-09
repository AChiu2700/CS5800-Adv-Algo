import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a list to hold Employee references
        List<Employee> employees = new ArrayList<>();

        // Add some SalariedEmployee and CommissionEmployee objects to the list
        employees.add(new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500));
        employees.add(new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25, 32));
        employees.add(new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19, 47));
        employees.add(new CommissionEmployee("Nicole", "Dior", "444-44-4444", 0.15, 50000));
        employees.add(new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700));
        employees.add(new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000));
        employees.add(new CommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", 0.22, 40000));

        // Iterate through the list and print details and earnings
        for (Employee person : employees) {
            person.print(); 
            if (person instanceof SalariedEmployee) {
                System.out.println("Earnings: $" + String.format("%,.2f", ((SalariedEmployee) person).earnings()));
            } else if (person instanceof CommissionEmployee) {
                System.out.println("Earnings: $" + String.format("%,.2f", ((CommissionEmployee) person).earnings()));
            } else if (person instanceof BaseEmployee) {
                System.out.println("Earnings: $" + String.format("%,.2f", ((BaseEmployee) person).earnings()));
            }
        }

        scanner.close();
    }
}
