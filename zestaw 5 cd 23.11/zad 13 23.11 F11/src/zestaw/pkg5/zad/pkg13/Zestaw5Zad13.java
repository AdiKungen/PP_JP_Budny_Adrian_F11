package zestaw.pkg5.zad.pkg13;
import java.util.Scanner;

public class Zestaw5Zad13 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String tekst = "Egzamin";
        int [] kol = { 0, 1, 4, 3, 2, 6, 5 };
        System.out.println(poprzestawiaj(tekst, kol));
    }
    public static String poprzestawiaj(String tekst, int [] kolejnosc) {
        String wynik = "";
        int znak = 0;

        for(int i = 0; i < tekst.length(); i++) {
            znak = tekst.charAt(kolejnosc[i]);
            wynik = wynik + (char)znak;
        }
        return wynik;
    }
}
