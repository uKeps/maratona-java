package maratona.javacore.Oexception.runtime.test;

public class RunTimeExceptionTest02 {
    public static void main(String[] args) {
        System.out.println(division(1,0));

        System.out.println("Finalized");
    }

    /**
     *
     * @param a
     * @param b /cant be 0
     * @return
     * @throws IllegalArgumentException if b = 0
     */

    private static int division(int a, int b){
        if(b == 0){
            throw new IllegalArgumentException("can't divide by 0");
        }
        try{
            return a/b;
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        return a/b;
    }
}
