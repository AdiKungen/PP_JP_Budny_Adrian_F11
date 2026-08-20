package zad.pkg7.pkg21.pkg10.f;
import java.util.Scanner;

public class Zad72110F {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Podaj współrzędną x: ");
        int wspX = in.nextInt();
        
        System.out.println("Podaj współrzędną y: ");
        int wspY = in.nextInt();
        
        System.out.println("Podaj długość boku a: ");
        int dlgA = in.nextInt();
        
        System.out.println("Podaj długość boku b: ");
        int dlgB = in.nextInt();
        
        System.out.println("Podaj znak wypełnienia: ");
        String znak = in.next();
        
        for (int i = 1; i < wspY; i++) {
            System.out.println("");
        }
        int licznik = 0;
        while (licznik < dlgA) {
            for (int i = 1; i < wspX; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < dlgB; i++) {
                System.out.print(znak);
            }
            licznik++;
            System.out.println("");
        }
        
    }
    
}
