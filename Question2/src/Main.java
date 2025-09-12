import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Payable> payables = new ArrayList<>();

    //     Testing Freelancer instance
    //     Freelancer freelancer = new Freelancer("Jane", "Doe", 20.0, 45);
    //     freelancer.print();
    //     System.out.println();

    //     Testing VendorInvoice instance
    //     VendorInvoice invoice = new VendorInvoice("ABC Education", "INV12345", 1500.0);
    //     invoice.print();
    // }

        //Freelancer
        payables.add(new Freelancer("Jane", "Doe", 20.0, 45));
        payables.add(new Freelancer("John", "Smith", 25.0, 38));

        // Vendor Invoices
        payables.add(new VendorInvoice("XYZ Inc", "INV67890", 2000.0));
        payables.add(new VendorInvoice("ABC Education", "INV12345", 1500));

        // Loop through each element
        double totalPayout = 0;
        for (Payable payable : payables) {
            // payable.print();
            if (payable instanceof Freelancer) {
                ((Freelancer) payable).print();
            } else if (payable instanceof VendorInvoice) {
                ((VendorInvoice) payable).print();
            }
            System.out.println();
            totalPayout += payable.calculatePayment();
        }
        System.out.println("Total Payout for all Payables: $" + totalPayout);
    }   
}
