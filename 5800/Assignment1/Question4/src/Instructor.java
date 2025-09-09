public class Instructor {
    
    private String name;
    private String lName;
    private String officeNumber;

    public Instructor(String name, String lName, String officeNumber) {
        this.name = name;
        this.lName = lName;
        this.officeNumber = officeNumber;
    }

    // Getters
    public String getName() {return name;}
    public String getlName() {return lName;}
    public String getOfficeNumber() {return officeNumber;}

    // Setters
    public void setName(String name) {this.name = name;}
    public void setlName(String lName) {this.lName = lName;}    
    public void setOfficeNumber(String officeNumber) {this.officeNumber = officeNumber;}

    public void print(){
        System.out.println("Instructor Name: " + name + " " + lName + ", Office Number: " + officeNumber);
    }
    // public static void main(String[] args) throws Exception {
    //     System.out.println("Hello, World!");
    // }
}
