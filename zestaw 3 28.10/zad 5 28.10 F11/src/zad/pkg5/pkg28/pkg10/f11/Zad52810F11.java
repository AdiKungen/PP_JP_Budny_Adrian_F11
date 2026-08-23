package zad.pkg5.pkg28.pkg10.f11;
import java.util.Scanner;

public class Zad52810F11 {

    public static void main(String[] args) {
        int[] tablica = new int[32];
        Scanner in = new Scanner(System.in);
        
        System.out.println("Podaj liczbę całkowitą: ");
        int liczba = in.nextInt();
        int wynik = 0;
        int znak = 0;
        int i = 1;
        int licznik = 0;
        int pierw = 0;
        int licz = -1;
        
        pierw = liczba;
        System.out.println("Wejście:");
        System.out.println("    " + pierw);
        
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
        System.out.println("Wynik ZM:");
        System.out.print("    " + znak + ".");
        for(int j = tablica.length-roznica; j > 0; j--) {
            System.out.print(tablica[j]);
        }
        System.out.println("");
        
        System.out.println("Wynik ZU1:");
        if (pierw >= 0) {
            System.out.print("    " + znak + ".");
            for(int j = tablica.length-roznica; j > 0; j--) {
                System.out.print(tablica[j]);
            }
        }
        else {
            System.out.print("    " + znak + ".");
            for(int j = tablica.length-roznica; j > 0; j--) {
                if(tablica[j] == 0) {
                    System.out.print("1");
                }
                else {
                    System.out.print("0");
                }
            }
        }
        System.out.println("");
        
        System.out.println("Wynik ZU2:");
        if (pierw >= 0) {
            System.out.print("    " + znak + ".");
            for(int j = tablica.length-roznica; j > 0; j--) {
                System.out.print(tablica[j]);
            }
        }
        else {
            for(int j = 0; j < tablica.length-1; j++) {
                licz++;
                if (tablica[j] == 0) {
                    continue;
                }
                if (tablica[j] == 1) {
                    break;
                }
            }
            System.out.print("    " + znak + ".");
                for(int j = tablica.length-roznica; j > licz; j--) {
                    if(tablica[j] == 0) {
                        System.out.print("1");
                    }
                    else {
                        System.out.print("0");
                    }
                }
                for(int j = licz; j > 0; j--) {
                    System.out.print(tablica[j]);
                }
        }
        System.out.println("");
    }
    
}
