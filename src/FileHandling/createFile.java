package FileHandling;

import java.io.File;
import java.io.IOException;

class createFile {

    public static void main(String[] args) throws IOException {
        File f = new File("./test.txt");
        System.out.println(f.createNewFile()); // to create File
        System.out.println(f.delete()); // deletes the file
        System.out.println(f.exists()); // returns True if file exists
        System.out.println(f.isHidden()); // returns if the file is hidden
        System.out.println(f.canWrite()); // returns true if the file can be witten else false if file is read only mode
        f.setWritable(true); // To make file writable

        // Folder Creation
        File folder = new File("./Folder");
        folder.mkdir(); // created only the specific folder That mentioned at end of path;
        folder.mkdirs(); // creates the folders that are specified but not present in the disk

        // To get files from a folder

        String[] fileNames = folder.list(); // We can use listFiles method to get files along with its path
    }
}