package maratona.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        makeNewFile();
    }

    private static void makeNewFile(){
        File file = new File("file\\test.txt");
        try{
            boolean isNewFile = file.createNewFile();
            System.out.println("File created: " + isNewFile);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
