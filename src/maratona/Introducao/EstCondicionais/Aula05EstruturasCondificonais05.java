package maratona.Introducao.EstCondicionais;

public class Aula05EstruturasCondificonais05 {
    public static void main(String[] args) {
        // Print the day of the week, based 1 = Sunday...

        int day = 5;
        // char, int, byte, short, enum, String
        switch (day){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
        }

        char gender = 'F';
        switch (gender) {
            case 'M':
                System.out.println("Male");
                break;
            case 'F':
                System.out.println("Female");
                break;
            default:
                System.out.println("Invalid");
        }

    }
}
