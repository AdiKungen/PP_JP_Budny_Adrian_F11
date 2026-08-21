package zad.pkg11.pkg21.pkg10.f11;
import java.util.Scanner;

public class Zad112110F11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Podaj liczbę: ");
        int n = in.nextInt();
        int ilosc = 0;
        
        ilosc = n - 1 + n;
        
        for (int i = 0; i < n; i++) {
            int gwiazdki = 1;
            for (i = 1; i < (ilosc-1)/2; i=i+2) {
                System.out.println(" ");
            }
            for (i = 0; i < gwiazdki; i++) {
                System.out.println("*");
            }
            
            
        }
    }
    
}
