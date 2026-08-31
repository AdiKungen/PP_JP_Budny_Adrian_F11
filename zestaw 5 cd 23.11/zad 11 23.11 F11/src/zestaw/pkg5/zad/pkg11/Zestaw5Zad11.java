package zestaw.pkg5.zad.pkg11;
import java.util.Scanner;

public class Zestaw5Zad11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Podaj łańcuch znakowy: ");
        String tekst = in.nextLine();

        System.out.println("Podaj startowy punkt: ");
        int poczatek = in.nextInt();

        System.out.println("Podaj ile liter w zakresie powinno się znaleźć: ");
        int dalej = in.nextInt();

        String wynik = strcut(tekst, poczatek, dalej);
        System.out.println(wynik);
    }
    public static String strcut(String str, int start, int ile) {
        String koniec = "";
        String zmienna = "";
        
        zmienna = str.substring(0, start);
        koniec = koniec + zmienna;

        zmienna = str.substring(start+ile, str.length());
        koniec = koniec + zmienna;
        
        return koniec;
    }

}
