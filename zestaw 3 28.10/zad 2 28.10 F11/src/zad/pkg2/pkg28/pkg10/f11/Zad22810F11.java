package zad.pkg2.pkg28.pkg10.f11;
import java.util.Random;

public class Zad22810F11 {

    public static void main(String[] args) {
        int[] tablica = new int[20];
        int licznik = 0;
        
        for (int i = 0; i < tablica.length; i++) {
            Random r = new Random();
            int a = r.nextInt(10)+1;
            tablica[i] = a;
        }
        
        System.out.println("Wylosowane liczby:");
        for (int i = 0; i < tablica.length; i++) {
            System.out.print(tablica[i] + " ");
        }
        System.out.println("");
        System.out.println("Wystąpienia:");
        for (int licz = 1; licz <= 10; licz++) {
            for (int i = 0; i < 20; i++) {
                if (tablica[i] == licz) {
                    licznik++;
                }
            }
            System.out.println(licz + " - " + licznik);
            licznik = 0;
        }
    }
    
}
