package zestaw.pkg5.zad.pkg10;
import java.util.Scanner;

public class Zestaw5Zad10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Podaj ciąg znakowy: ");
        String tekst = in.nextLine();

        System.out.println("Podaj ciąg szukany: ");
        String szuka = in.nextLine();

        int wynik = strFindAndCount(tekst, szuka);
        System.out.println(wynik);
    }
    public static int strFindAndCount(String gdzie, String co) {
        int licznik = 0;
        do {
            if(gdzie.indexOf(co) != -1) {
                licznik++;
                gdzie = gdzie.substring(gdzie.indexOf(co)+co.length(), gdzie.length());
            }
        } while(gdzie.indexOf(co) != -1);
        return licznik;
    }

}
