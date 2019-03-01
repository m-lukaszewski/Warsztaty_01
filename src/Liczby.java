import java.util.Random;
import java.util.Scanner;

public class Liczby {
    public static void main(String[] args) {

        Random rnd = new Random();
        int liczba = rnd.nextInt(101) + 1;
        System.out.println("zgadnij liczbę");
        Scanner scan = new Scanner(System.in);


        try {
            int answer = scan.nextInt();
            while (answer != liczba) {
                if (answer < liczba) {
                    System.out.println("trochę więcej");
                } else {
                    System.out.println("trochę mniej");
                }

                answer = scan.nextInt();


            }
            System.out.println("brawo " + answer + " to " + liczba);

        } catch (
                Exception e) {
            System.out.println("wprowadź liczbę całkowitą");
        }


    }
}
