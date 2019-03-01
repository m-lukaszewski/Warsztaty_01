import java.util.Random;
import java.util.Scanner;

public class Liczby {
    public static void main(String[] args) {

        Random rnd = new Random();
        int liczba = rnd.nextInt(101) + 1;
        System.out.println("zgadnij liczbę");
        Scanner scan = new Scanner(System.in);


        int answer = getAnswer(scan);
        while (answer != liczba) {
            if (answer < liczba) {
                System.out.println("trochę więcej");
            } else {
                System.out.println("trochę mniej");
            }

            answer = getAnswer(scan);


        }
        System.out.println("brawo " + answer + " to " + liczba);


    }


    private static int getAnswer(Scanner scan) {

        while (!scan.hasNextInt()) {
            String value = scan.next();
            System.out.println("to nie liczba");
        }
        return scan.nextInt();
    }
}
