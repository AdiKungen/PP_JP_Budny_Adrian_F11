package zad.pkg6.pkg21.pkg10.f;
import java.util.Scanner;
import java.util.Random;

public class Zad62110F {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random r = new Random();
        
        int los = r.nextInt(100)+1;
        System.out.println("Podaj liczbę: ");
        int liczba = in.nextInt();
        
        while(liczba != los) {
            if(liczba < los) {
                System.out.println("Podałeś za małą wartość");
            }
            else if (liczba > los) {
                System.out.println("Podałeś za dużą wartość");
            }
            System.out.println("Podaj kolejną liczbę: ");
            liczba = in.nextInt();
        }
        System.out.println("Gratulacje");
    }
    
}
