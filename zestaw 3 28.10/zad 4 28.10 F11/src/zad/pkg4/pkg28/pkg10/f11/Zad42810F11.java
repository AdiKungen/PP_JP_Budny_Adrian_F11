package zad.pkg4.pkg28.pkg10.f11;
import java.util.Scanner;
        
public class Zad42810F11 {

    public static void main(String[] args) {
        int[] tablica = new int[32];
        Scanner in = new Scanner(System.in);
        
        System.out.println("Podaj liczbę całkowitą: ");
        int liczba = in.nextInt();
        int wynik = 0;
        int znak = 0;
        int i = 1;
        int licznik = 0;
        
        System.out.println("Wejście:");
        System.out.println("    " + liczba);
        
        if (liczba<0) {
            znak = 1;
            liczba = -(liczba);
        }
        while(liczba != 1) {
            wynik = liczba % 2;
            liczba = liczba / 2;
            tablica[i] = wynik;
            i++;
            licznik++;
        }
        if(liczba == 1) {
           tablica[i] = 1;
           licznik++;
        }
        int roznica = 0;
        roznica = tablica.length - licznik;
        System.out.println("Wynik:");
        System.out.print("    " + znak + ".");
        for(int j = tablica.length-roznica; j > 0; j--) {
            System.out.print(tablica[j]);
        }
        System.out.println("");
    }
}
