package zad.pkg2.pkg2.pkg14.pkg10.f;
import java.util.Scanner;

public class Zad221410F {

    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        
        System.out.println("Podaj pierwszą liczbę: ");
        int liczba1 = in1.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        int liczba2 = in1.nextInt();
        System.out.println("Podaj trzecią liczbę: ");
        int liczba3 = in1.nextInt();
        
        int min = Math.min(liczba1, liczba2);
        min = Math.min(min, liczba3);
        
        System.out.println("Najmniejsza liczba: " + min);
        
        int max = Math.max(liczba1, liczba2);
        max = Math.max(max, liczba3);
        
        System.out.println("Największa liczba: " + max);
    }
    
}
