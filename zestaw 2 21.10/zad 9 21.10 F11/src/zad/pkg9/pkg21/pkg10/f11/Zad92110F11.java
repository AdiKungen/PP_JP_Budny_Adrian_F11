package zad.pkg9.pkg21.pkg10.f11;
import java.util.Scanner;

public class Zad92110F11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Podaj liczbę: ");
        int liczba = in.nextInt();
        
        if (liczba > 1) {
            int dzielnik = 0;
            int licznik = 0;
            for (int i = 2; i < liczba; i++) {
                if (liczba % i == 0) {
                    System.out.println("Podana liczba nie jest liczbą pierwszą!");
                    licznik++;
                    break;
                }
            }
            if (licznik == 0) {
                System.out.println("Podana liczba jest liczbą pierwszą!");
            }
        }
    }
    
}
