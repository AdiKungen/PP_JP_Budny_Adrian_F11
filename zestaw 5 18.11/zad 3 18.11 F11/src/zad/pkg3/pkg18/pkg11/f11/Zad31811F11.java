package zad.pkg3.pkg18.pkg11.f11;
import java.util.Scanner;

public class Zad31811F11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Podaj łańcuch znakowy: ");
        String tekst = in.nextLine();
        
        System.out.println("Podaj znak: ");
        char znak = in.next().charAt(0);
        
        int indx = strpos(tekst, znak);
        System.out.println("Indeks: " + indx);
    }
    public static int strpos(String text, char z) {
        int indeks = text.indexOf(z);
        return indeks;
    }
}
