package zad.pkg1.pkg21.pkg10.f;
import java.util.Scanner;

public class Zad12110F {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Podaj całkowitą liczbę dodatnią: ");
        int liczba = in.nextInt();
        
        if (liczba > 0) {
            for (int i = 1; i < liczba; i++) {
                if (i % 2 == 1) {
                    System.out.println(i);
                }
            }
        }
    }
    
}
