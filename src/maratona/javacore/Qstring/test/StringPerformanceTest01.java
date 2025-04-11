package maratona.javacore.Qstring.test;

public class StringPerformanceTest01 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        concatString(100000);
        long end = System.currentTimeMillis();
        System.out.println("Time taken for String " + (end - start) + " ms");

        start = System.currentTimeMillis();
        concatStringBuilder(100000);
        end = System.currentTimeMillis();
        System.out.println("Time taken for StringBuilder " + (end - start) + " ms");

        start = System.currentTimeMillis();
        concatStringBuffer(100000);
        end = System.currentTimeMillis();
        System.out.println("Time taken for StringBuffer " + (end - start) + " ms");
    }


    private static void concatString(int lenght){
        String text = "";
        for (int i = 0; i < lenght ; i++) {
            text += i; // 0,01,012,013

        }
    }

    private static void concatStringBuilder(int lenght){
        String text = "";
        for (int i = 0; i < lenght ; i++) {
            StringBuilder sb = new StringBuilder(lenght);
            sb.append(i);
        }
    }

    private static void concatStringBuffer(int lenght){
        String text = "";
        for (int i = 0; i < lenght ; i++) {
            StringBuffer sb = new StringBuffer(lenght);
            sb.append(i);
        }
    }
}
