package maratona.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException{
        makeNewFile();
    }

    public static void makeNewFile()  throws IOException{
        File file = new File("file\\test.txt");
        try{
            boolean isNewFile = file.createNewFile();
            System.out.println("File created: " + isNewFile);
        }catch (IOException e){
            e.printStackTrace();
            throw e;
        }
    }
}
