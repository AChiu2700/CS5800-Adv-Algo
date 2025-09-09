public class Ship {
    private String name;
    private String yearBuilt;

    //Constructor
    public Ship(String name, String yearBuilt) {
        this.name = name;
        this.yearBuilt = yearBuilt;
    }

    // Getters
    public String getName() { return name; }
    public String getYearBuilt() { return yearBuilt; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setYearBuilt(String yearBuilt) { this.yearBuilt = yearBuilt; }

    public void print() {
        System.out.println("Ship Name: " + name + ", Year Built: " + yearBuilt);
    }
    // public static void main(String[] args) throws Exception {
    //     System.out.println("Hello, World!");
    // }
}
