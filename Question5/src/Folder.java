import java.util.ArrayList;

public class Folder {
    private String name;
    private ArrayList<FSFile> files = new ArrayList<>();
    private ArrayList<Folder> folders = new ArrayList<>();
    
    public Folder(String name) {
        this.name = name;
    }

    //Getter and Setter
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public ArrayList<FSFile> getFiles() { return files; }
    public ArrayList<Folder> getSubFolders() { return folders; }

    public void addFile(FSFile file) {
        files.add(file);
    }

    public void addSubFolder(Folder folder) {
        folders.add(folder);
    }

    // Delete subfolder
    public boolean deleteSubFolder(String name) {
        for (int i = 0; i < folders.size(); i++) {
            if (folders.get(i).getName().equals(name)) {
                folders.remove(i);
                return true;
            }
        }
        return false;
    }

    // Print everythin
    public void print(String space) {
        if (this.name.equals("demo 1") || this.name.equals("Source Files") || this.name.equals("app")) {
            System.out.println(space + "-  " + this.name);
        } else {
            System.out.println(space + "+  " + this.name);
        }

        for (FSFile file : files) {
            file.print(space + "   ");
        }
        for (Folder folder : folders) {
            folder.print(space + "   ");
        }
    }
}
