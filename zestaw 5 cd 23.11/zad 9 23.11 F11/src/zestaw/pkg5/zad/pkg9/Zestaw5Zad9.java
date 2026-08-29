package zestaw.pkg5.zad.pkg9;
import java.util.Scanner;

public class Zestaw5Zad9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Podaj ciąg znakowy: ");
        String text = in.nextLine();

        String[] wynik = podzielNaSlowa(text);
        for(int i = 0; i < wynik.length; i++) {
            System.out.println(wynik[i]);
        }
    }
    public static String[] podzielNaSlowa(String tekst) {
        String[] tablicaSlow = tekst.split(" ");
        return tablicaSlow;
    }

}
