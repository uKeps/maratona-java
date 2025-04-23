package maratona.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File directory = new File("folder");
        boolean isDirectoryCreated = directory.mkdir();
        System.out.println(isDirectoryCreated);
        File fileDirectory = new File(directory, "file1.txt");
        boolean isNewFileCreated = fileDirectory.createNewFile();
        System.out.println(isNewFileCreated);

        File fileRenamed = new File(directory,"file_renamed.txt");
        boolean isRenamed = fileDirectory.renameTo(fileRenamed);
        System.out.println(isRenamed);

        File directoryRenamed = new File("folder_renamed");
        boolean isDirectoryRenamed = directory.renameTo(directoryRenamed);
        System.out.println(isDirectoryRenamed);
    }
}
