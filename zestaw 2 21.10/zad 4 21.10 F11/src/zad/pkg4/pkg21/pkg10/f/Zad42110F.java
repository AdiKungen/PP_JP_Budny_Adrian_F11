package zad.pkg4.pkg21.pkg10.f;
import java.util.Scanner;

public class Zad42110F {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int liczba = 0;
        int suma = 0;
        do {
            System.out.println("Podaj liczbę: ");
            liczba = in.nextInt();
            suma = suma + liczba;
        } while (liczba != 0);
        System.out.println(suma);
    }
    
}
