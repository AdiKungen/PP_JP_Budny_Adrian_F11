package zestaw.pkg6b.zadanie.pkg1;
import java.util.*;
import java.io.*;

public class Zestaw6BZadanie1 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        odwrocKolejnosc("C:/Users/Adrian/Documents/tekstowe/plik.txt");
    }

    public static void odwrocKolejnosc(String sciezka) throws FileNotFoundException, IOException {
        RandomAccessFile RAF = new RandomAccessFile(sciezka, "rw");
        RAF.setLength(0);
        Random r = new Random();
        int liczba;
        
        for (int i = 0; i < 10; i++) {
            liczba = r.nextInt(101);
            RAF.write(liczba);
        }
        
        RAF.seek(0);
        System.out.println("Przed odwroceniem:");
        for (int i = 0; i < 10; i++) {
            int a = RAF.read();
            System.out.print(a + " ");
        }
        System.out.println();

        int pocz = 0;
        int kon = 0;
        long x = 0;
        long y = RAF.length() - 1;

        while (x < y) {
            RAF.seek(x);
            pocz = RAF.read();
            RAF.seek(y);
            kon = RAF.read();

            RAF.seek(x);
            RAF.write(kon);
            RAF.seek(y);
            RAF.write(pocz);

            x++;
            y--;
        }

        RAF.seek(0);
        System.out.println("Po odwroceniu:");
        for (int i = 0; i < 10; i++) {
            int a = RAF.read();
            System.out.print(a + " ");
        }
        System.out.println();

        RAF.close();
    }
}