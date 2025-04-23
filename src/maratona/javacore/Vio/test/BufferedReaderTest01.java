package maratona.javacore.Vio.test;

import java.io.*;

public class BufferedReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()){
                System.out.println(line);
            }
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
