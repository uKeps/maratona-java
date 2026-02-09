package maratona.javacore.ZZAclassesinternas.test;

public class OuterClassTest01 {
    private String name = "Luffy";
    // Nested
    class Inner {
        public void printOuterClassAttribute(){
            System.out.println(name);
            System.out.println(this);
            System.out.println(OuterClassTest01.this);
        }
    }
    public static void main(String[] args) {
        OuterClassTest01 outerCalss = new OuterClassTest01();
        Inner inner = outerCalss.new Inner();
        Inner inner2 = new OuterClassTest01().new Inner();
        inner.printOuterClassAttribute();
        inner2.printOuterClassAttribute();
    }
}
