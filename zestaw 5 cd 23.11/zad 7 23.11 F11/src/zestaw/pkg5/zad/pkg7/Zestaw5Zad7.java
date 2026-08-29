package zestaw.pkg5.zad.pkg7;
import java.util.Scanner;

public class Zestaw5Zad7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Podaj ciąg znakowy: ");
        String tekst = in.nextLine();

        System.out.println("Podaj ciąg szukany: ");
        String szuka = in.nextLine();
        
        int wynik = strfind(tekst, szuka);
        System.out.println(wynik);
    }
    public static int strfind(String gdzie, String co) {
        int indeks = gdzie.indexOf(co);
        return indeks;
    }

}
