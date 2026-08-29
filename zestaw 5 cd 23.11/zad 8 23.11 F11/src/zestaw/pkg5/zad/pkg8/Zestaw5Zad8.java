package zestaw.pkg5.zad.pkg8;
import java.util.Scanner;

public class Zestaw5Zad8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Podaj tekst: ");
        String tekst = in.nextLine();

        int wynik = wordCount(tekst);
        System.out.println(wynik);
    }
    public static int wordCount(String text) {
        int licznik = 0;
        int koniec = 0;
        for(int i = 0; i < text.length(); i++) {
            if(!Character.isWhitespace(text.charAt(i))) {
                licznik++;
            }
            else {
                if(licznik > 0) {
                    koniec++;
                }
                licznik = 0;
            }
        }
        if(licznik > 0) {
            koniec++;
        }
        return koniec;
    }

}
