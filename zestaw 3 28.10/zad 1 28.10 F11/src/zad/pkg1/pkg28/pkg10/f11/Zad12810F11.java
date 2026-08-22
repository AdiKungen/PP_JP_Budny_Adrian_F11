package zad.pkg1.pkg28.pkg10.f11;
import java.util.Random;

public class Zad12810F11 {

    public static void main(String[] args) {
        int[] tablica = new int[10];
        int max = -11;
        int min = 11;
        double suma = 0;
        double srednia = 0;
        int licznikwi = 0;
        int licznikmn = 0;
        for (int i = 0; i < tablica.length; i++) {
            Random r = new Random();
            int a = r.nextInt(21)-10;
            tablica[i] = a;
        }
        
        
        System.out.println("Wylosowane liczby:");
        for (int i = 0; i < tablica.length; i++) {
            System.out.print(tablica[i] + " ");
        }
        
        
        
        for (int i = 0; i < tablica.length; i++) {
            if(tablica[i] < min) {
                min = tablica[i];
            }
        }
        for (int i = 0; i < tablica.length; i++) {
            if(tablica[i] > max) {
                max = tablica[i];
            }
        }
        System.out.println("");
        System.out.println("Min: " + min + ", max: " + max);
        
        
        
        for (int i = 0; i < tablica.length; i++) {
            suma = suma + tablica[i];
        }
        srednia = suma / 10;
        System.out.println("Średnia: " + srednia);
        
        for (int i = 0; i < tablica.length; i++) {
            if(tablica[i] > srednia) {
                licznikwi++;
            }
            if(tablica[i] < srednia) {
                licznikmn++;
            }
        }
        System.out.println("Mniejszych od śr: " + licznikmn);
        System.out.println("Większych od śr: " + licznikwi);
        
        
        
        System.out.println("Liczby w odwrotnej kolejności:");
        for (int i = tablica.length-1; i >= 0; i--) {
            System.out.print(tablica[i] + " ");
        }
        System.out.println("");
    }
    
}
