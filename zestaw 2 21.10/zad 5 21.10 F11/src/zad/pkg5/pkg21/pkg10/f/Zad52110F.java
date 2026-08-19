package zad.pkg5.pkg21.pkg10.f;
import java.util.Scanner;

public class Zad52110F {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int liczba = 0;
        double suma = 0;
        double licznik = 0;
        int min = 0;
        int max = 0;
        do {
            System.out.println("Podaj liczbę: ");
            liczba = in.nextInt();
            
            if (liczba == 0) {
                break;
            }
            
            if (min == 0) {
                min = liczba;
            }
            else if (min > liczba) {
                min = liczba;
            }
            
            if (max == 0) {
                max = liczba;
            }
            else if (max < liczba) {
                max = liczba;
            }
            
            suma = suma + liczba;
            
            licznik++;
        } while (liczba != 0);
        double srednia = 0;
        if (licznik != 0) {
            srednia = suma / licznik;
        }
        
        System.out.println("min: " + min);
        System.out.println("max: " + max);
        System.out.println("suma: " + suma);
        System.out.println("średnia: " + srednia);
    }
    
}
