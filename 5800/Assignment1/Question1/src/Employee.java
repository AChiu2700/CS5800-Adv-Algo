public class Employee {
    private String name;
    private String lastName;
    private String ssn;

    // Constructor
    public Employee(String name, String lastName, String ssn) {
        this.name = name;
        this.lastName = lastName;
        this.ssn = ssn;
    }
    
    //Methods
    public String getName() {return name;}
    public String getLastName() {return lastName;}
    public String getSsn() {return ssn;}

    public void print(){
        System.out.println();
        System.out.println("Name: " + name + " " + lastName + ", SSN: " + ssn);
    }
    // public static void main(String[] args) throws Exception {
    //     System.out.println("Hello, World!");
    // }
}

