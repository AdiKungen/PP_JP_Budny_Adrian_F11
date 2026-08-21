package zad.pkg11.pkg21.pkg10.f11;
import java.util.Scanner;

public class Zad112110F11 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Podaj liczbę: ");
        int n = in.nextInt();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
