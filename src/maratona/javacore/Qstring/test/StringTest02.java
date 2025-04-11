package maratona.javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String name = "    Sasuke       ";
        String numbers = "012345";
        System.out.println(name.charAt(2));
        System.out.println(name.replace("u", "a"));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(numbers.length());
        System.out.println(name.trim());
    }
}
