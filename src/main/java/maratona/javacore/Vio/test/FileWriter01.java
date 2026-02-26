package maratona.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//File
//FileWritter
//BufferedWriter
//BufferedReader
public class FileWriter01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fileWriter = new FileWriter(file)){
            fileWriter.write("O Norris eh podre");
            fileWriter.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
