public class FSFile {
    private String name;

    public FSFile(String name) {
        this.name = name;
    }

    // Getter/Setter
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public void print(String space) {
        System.out.println(space + "   - " + name);
    }
}
