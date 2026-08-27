package zad.pkg2.pkg2.pkg18.pkg11.f11;
import java.util.Scanner;

public class Zad221811F11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Podaj numer wyrazu ciągu, który chcesz sprawdzić: ");
        int n = in.nextInt();
        
        int ciag = ciag(n);
        System.out.println("Spradzony wyraz wynosi: " + ciag);
    }
    public static int ciag(int a) {
        if(a == 0) {
            return 1;
        }
        else if(a == 1) {
            return 2;
        }
        else if(a > 1) {
            return ciag(a-2) + ciag(a-1);
        }
        return 0;
    }
    
}
