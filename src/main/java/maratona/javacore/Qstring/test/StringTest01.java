package maratona.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String name = "Erik"; // String constant pool
        String name2 = "Erik";
        name = name.concat(" Piassini"); // name += Piassini
        System.out.println(name);
        System.out.println(name == name2);
        String name3 = new String("Erik"); // 1- varialvel de referencia, 2- objeto do tipo string, 3- uma string no pool de string
        System.out.println(name2 == name3);
        System.out.println(name2 == name3.intern());

    }
}
