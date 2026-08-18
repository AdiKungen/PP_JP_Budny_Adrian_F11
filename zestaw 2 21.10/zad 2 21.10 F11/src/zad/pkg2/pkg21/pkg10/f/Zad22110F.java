package zad.pkg2.pkg21.pkg10.f;
import java.util.Scanner;

public class Zad22110F {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Podaj pierwszą liczbę: ");
        int pier = in.nextInt();
        
        System.out.println("Podaj drugą liczbę: ");
        int drug = in.nextInt();
        
        int liczbaA = 0;
        int liczbaB = 0;
        
        if (pier > drug) {
            liczbaB = pier;
            liczbaA = drug;
        }
        else {
            liczbaA = pier;
            liczbaB = drug;
        }
        
        int liczbaAW = liczbaA;
        int liczbaBW = liczbaB;
        int suma1 = 0;
        while(liczbaAW <= liczbaBW) {
            suma1 = suma1 + liczbaAW;
            liczbaAW++;
        }
        System.out.println(suma1);
        
        
        int liczbaAD = liczbaA;
        int liczbaBD = liczbaB;
        int suma2 = 0;
        do {
            suma2 = suma2 + liczbaAD;
            liczbaAD++;
        } while (liczbaAD <= liczbaBD);
        System.out.println(suma2);
        
        
        int suma3 = 0;
        for (int i = liczbaA; i <= liczbaB; i++) {
            suma3 = suma3 + i;
        }
        System.out.println(suma3);
    }
    
}
