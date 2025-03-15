package maratona.Arrays;

public class Aula07ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int [][] arrayInt = new int[3][]; // 3 arrays

        arrayInt[0] = new int[2]; // 2 elements
        arrayInt[1] = new int[3]; // 3 elements
        arrayInt[2] = new int[6]; // 4 elements

        int [][] arrayInt2 = {{0,0}, {0,0,0}, {0,0,0,0,0,0}};

         for(int[] arrBase : arrayInt) {
            for (int num : arrBase) {
                System.out.println(num);
            }
         }
    }
}
