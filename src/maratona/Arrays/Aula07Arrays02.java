package maratona.Arrays;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // Primitive types default values:
        // byte, short, int, long, float, double = 0
        // char = '\u0000' ' '
        // boolean = false

        // reference = null
        String[] names = new String[3];
        names[0] = "itachi";
        names[1] = "naruto";
        names[2] = "sasuke";
        for (int i = 0; i < names.length ; i++) {
            System.out.println(names[i]);
        }
        names = new String[3];


// enhanced for loop
//        for (String name : names) {
//            System.out.println(name);
//        }
    }
}
