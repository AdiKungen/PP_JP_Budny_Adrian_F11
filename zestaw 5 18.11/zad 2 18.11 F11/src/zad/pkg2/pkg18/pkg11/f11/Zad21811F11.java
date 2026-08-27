package zad.pkg2.pkg18.pkg11.f11;
import java.util.Scanner;

public class Zad21811F11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Podaj n wyrazu ciągu, który chcesz poznać: ");
        int n = in.nextInt();
        int fn = 0;
        
        if (n >= 0) {
            if (n == 0) {
                fn = 1;
            } else if (n == 1) {
                fn = 2;
            } else {
                int f0 = 1;
                int f1 = 2;
                for (int i = 2; i <= n; i++) {
                    fn = f0 + f1;
                    f0 = f1;
                    f1 = fn;
                }
            }
            System.out.println("Wyraz podanego wyrazu ciągu Fibonacciego wynosi: " + fn);
        }
    }
}
