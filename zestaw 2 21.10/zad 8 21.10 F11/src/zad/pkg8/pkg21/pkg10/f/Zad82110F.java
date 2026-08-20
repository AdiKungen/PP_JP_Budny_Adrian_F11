package zad.pkg8.pkg21.pkg10.f;
import java.util.Scanner;

public class Zad82110F {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Podaj liczbę: ");
        int liczba = in.nextInt();
        
        for (int i = 1; i <= liczba; i++) {
            if (liczba % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
    
}
