public class VendorInvoice implements Payable {
    private String vendorName;
    private String invoiceNumber;
    private double amount;

    public VendorInvoice(String vendorName, String invoiceNumber, double amount) {
        this.vendorName = vendorName;
        this.invoiceNumber = invoiceNumber;
        this.amount = amount;
    }

    // Getters
    public String getVendorName() { return vendorName; }
    public String getInvoiceNumber() { return invoiceNumber; }
    public double getAmount() { return amount; }

    // Setters
    public void setAmount(double amount) {
        if (amount < 0) {
            amount = 0;
        }
        this.amount = amount; 
    }

    // Calculate payment
    public double calculatePayment() {
        return amount;
    }

    public String getPayeeName(){
        return vendorName;
    }

    // Test print
    public void print(){
        System.out.println("Vendor: " + vendorName);
        System.out.println("Invoice Number: " + invoiceNumber);
        System.out.println("Amount: $" + amount);
        System.out.println("Total Payment: $" + calculatePayment());
    }
    
}
