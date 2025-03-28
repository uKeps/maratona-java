package maratona.javacore.Gassociacao.test;

import java.util.Scanner;

public class KeyboardReadingTest02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write your question and i will answer with YES OR NO: ");
        String question = sc.nextLine();
        if(question.charAt(0) == ' '){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        } // use spacebar = yes
    }
}
