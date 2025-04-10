package maratona.javacore.Oexception.exception.test;

import maratona.javacore.Oexception.exception.domain.LoginInvalidException;

import java.util.Scanner;

public class LoginInvalidExceptionTest01 {
    public static void main(String[] args) {
        try {
            login();
        } catch (LoginInvalidException e) {
            throw new RuntimeException(e);
        }
    }

    private static void login() throws LoginInvalidException {
        Scanner sc = new Scanner(System.in);
        String usernameDB = "Goku";
        String passwordDB = "ssj";
        System.out.println("User");
        String usernameRead = sc.nextLine();
        System.out.println("Password");
        String passwordRead = sc.nextLine();
        if(!usernameDB.equals(usernameRead) || !passwordDB.equals(passwordRead) ){
            throw new LoginInvalidException("User or password invalid");
        }
        System.out.println("login successfully");
    }
}
