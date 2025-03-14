package maratona.EstCondicionais;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int age = 15;
        boolean isAuthorizedBuyDrink = age >= 18;
        // !
        if (isAuthorizedBuyDrink != false) {
            System.out.println("Authorized to drink");
        } else {
            System.out.println("Not authorized to drink");
        }

        if (!isAuthorizedBuyDrink){
            System.out.println("Not authorized to drink");
        }

        System.out.println("After the If");
    }
}
