public class Main {
    public static void main (String[] args){
        // Main Folders
        Folder root = new Folder("demo 1");
        Folder sourceFiles = new Folder("Source Files");
        Folder phalcon = new Folder(".phalcon");
        Folder app = new Folder("app");
        Folder cache = new Folder("cache");
        Folder publicFolder = new Folder("public");
        Folder includePath = new Folder ("Include Path");
        Folder remoteFiles = new Folder ("Remote Files");
        
        root.addSubFolder(sourceFiles);
        sourceFiles.addSubFolder(app);
        sourceFiles.addSubFolder(phalcon);
        sourceFiles.addSubFolder(cache);
        sourceFiles.addSubFolder(publicFolder);
        root.addSubFolder(includePath);
        root.addSubFolder(remoteFiles);

        // App's subFolders 
        Folder config = new Folder("config");
        Folder controllers = new Folder("controllers");
        Folder library = new Folder("library");
        Folder migrations = new Folder("migrations");
        Folder models = new Folder ("models");
        Folder views = new Folder("views");

        app.addSubFolder(phalcon);
        app.addSubFolder(config);
        app.addSubFolder(controllers);
        app.addSubFolder(library);
        app.addSubFolder(migrations);
        app.addSubFolder(models);
        app.addSubFolder(views);

        // File names
        FSFile file1 = new FSFile(".htaccess");
        FSFile file2 = new FSFile(".htrouter.php");
        FSFile file3 = new FSFile("index.html");
  
        // Files to public folder
        publicFolder.addFile(file1);
        publicFolder.addFile(file2);
        publicFolder.addFile(file3);

        root.print("");

        // Remoce Doc Folder
        System.out.println("\nAfter deleting 'app' folder:\n");
        sourceFiles.deleteSubFolder("app");
        root.print("");

        // Remove public Folder
        System.out.println("\nAfter deleting 'public' folder:\n");
        sourceFiles.deleteSubFolder("public");
        root.print("");
    }
}
