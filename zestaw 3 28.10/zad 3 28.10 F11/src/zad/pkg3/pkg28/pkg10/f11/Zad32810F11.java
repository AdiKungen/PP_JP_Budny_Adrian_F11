package zad.pkg3.pkg28.pkg10.f11;
import java.util.Random;

public class Zad32810F11 {

    public static void main(String[] args) {
        int[][] tablica = new int[5][5];
        int min = 6;
        int max = -6;
        
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++) {
                Random r = new Random();
                int a = r.nextInt(11)-5;
                tablica[i][j] = a;
            }
        }
        
        
        System.out.println("Wylosowana macierz: ");
        for (int i = 0; i< tablica.length; i++) {
            for (int j = 0; j< tablica[i].length; j++) {
                if (tablica[i][j] >= 0) {
                    System.out.print(" " + tablica[i][j] + " ");
                }
                else {
                    System.out.print(tablica[i][j] + " ");
                }
            }
            System.out.println();
        }
        
        System.out.println("Minimalne wartości w wierszach: ");
        for (int i = 0; i< tablica.length; i++) {
            for (int j = 0; j< tablica[i].length; j++) {
                if (tablica[i][j] < min) {
                    min = tablica[i][j];
                }
            }
            System.out.println(i + ": " + min);
            min = 6;
        }
        
        
        System.out.println("Maksymalne wartości w kolumnach: ");
        for (int i = 0; i< tablica.length; i++) {
            for (int j = 0; j< tablica[i].length; j++) {
                if (tablica[j][i] > max) {
                    max = tablica[j][i];
                }
            }
            System.out.println(i + ": " + max);
            max = -6;
        }
        
        
        for(int i=0; i< tablica.length; i++) {
            for(int j=0; j< tablica[i].length; j++) {
                if (i == j) {
                    if (tablica[i][j] > max) {
                        max = tablica[i][j];
                    }
                }
            }
        }
        System.out.println("Maksimum na 1. przekątnej: " + max);
        
        for(int i=0; i< tablica.length; i++) {
            for(int j=0; j< tablica[i].length; j++) {
                if (i + j == tablica.length - 1) {
                    if (tablica[i][j] < min) {
                        min = tablica[i][j];
                    }
                }
            }
        }
        System.out.println("Minimum na 2. przekątnej: " + min);
    }
    
}
