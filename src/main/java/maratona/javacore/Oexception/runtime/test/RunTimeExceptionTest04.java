package maratona.javacore.Oexception.runtime.test;

import java.io.IOException;
import java.sql.SQLException;

public class RunTimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException |IllegalArgumentException | ArithmeticException e) {
            System.out.println("Inside the ArrayIndexOutOfBoundsException |IllegalArgumentException | ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("Inside the RuntimeException");
        }

        try {
            maybeThrowsException();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void maybeThrowsException() throws SQLException, IOException {

    }
}

