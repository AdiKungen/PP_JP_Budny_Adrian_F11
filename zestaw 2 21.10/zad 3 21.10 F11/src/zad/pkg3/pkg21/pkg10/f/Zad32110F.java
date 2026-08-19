package zad.pkg3.pkg21.pkg10.f;
import java.util.Scanner;

public class Zad32110F {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Podaj całkowitą liczbę dodatnią: ");
        int n = in.nextInt();
        
        if (n > 0) {
            double potega = 0;
            for (int i = 0; n >= potega; i++) {
                potega = Math.pow(2, i);
                if(potega > n) {
                    break;
                }
                System.out.println(potega);
            }
        }
    }
    
}
