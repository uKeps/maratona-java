package maratona.javacore.ZZAclassesinternas.test;

public class OuterClassTest02 {
    private String name = "Genji";

    void print(){
        final String lastName = "Yamado";
       class LocalClass{
           public void printLocal(){
               System.out.println(name + " "+lastName);
           }
       }
       new LocalClass().printLocal();
    }

    public static void main(String[] args) {
        OuterClassTest02 outer = new OuterClassTest02();
        outer.print();
    }
}
