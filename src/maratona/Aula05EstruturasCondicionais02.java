package maratona;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // age < 15 child category
        // age >= 15 && age < 18 teenager category
        // age >= 18 adult category

        int age = 12;
        String category = ""; // empty string
        if (age < 15) {
            category = "Child category";
        } else if (age >= 15 && age < 18){
            category = "Teenager category";
        } else {
            category = "Adult category";
        }
        System.out.println(category);
    }
}
