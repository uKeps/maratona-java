package maratona.javacore.Oexception.runtime.test;

public class RunTimeExceptionTest03 {
    public static void main(String[] args) {
        openConnection();
    }
    private static String openConnection(){
        try {
            System.out.println("Opening file");
            System.out.println("Writing data on file");
            return "connection open";
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Closing resource released by SO");
        }
        return null;
    }

    private static void openConnection2(){
        try {
            System.out.println("Opening file");
            System.out.println("Writing data on file");
        } finally {
            System.out.println("Closing resource released by SO");
        }
    }
}
