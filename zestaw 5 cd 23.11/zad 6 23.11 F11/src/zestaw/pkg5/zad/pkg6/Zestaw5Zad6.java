package zestaw.pkg5.zad.pkg6;
import java.util.Scanner;

public class Zestaw5Zad6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Podaj łańcuch znakowy: ");
        String tekst = in.nextLine();

        int wynik = strToInt(tekst);
        System.out.println(wynik);
    }
    public static int strToInt(String str) {
        String liczby = "";
        String eliczby = "";
        int znak = 0;
        int koniec = 0;
        int ekoniec = 0;
        int licznike = 0;
        int dycha = 1;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '-' && Character.isDigit(str.charAt(i+1)) && liczby.length() == 0 && licznike == 0) {
                znak = str.charAt(i);
                liczby = liczby + (char)znak;
            }
            else if(str.charAt(i) == '+' && Character.isDigit(str.charAt(i+1)) && liczby.length() == 0 && licznike == 0) {
                continue;
            }
            else if(Character.isDigit(str.charAt(i)) && licznike == 0) {
                znak = str.charAt(i);
                liczby = liczby + (char)znak;
            }
            else if(str.charAt(i) == 'e' && Character.isDigit(str.charAt(i+1)) && Character.isDigit(str.charAt(i-1))) {
                licznike++;
            }
            else if(str.charAt(i) == 'e' && str.charAt(i+1) == '+' && Character.isDigit(str.charAt(i+2)) && Character.isDigit(str.charAt(i-1))) {
                licznike++;
            }
            else if(str.charAt(i) == '+' && Character.isDigit(str.charAt(i+1)) && licznike == 1) {
                continue;
            }
            else if(Character.isDigit(str.charAt(i)) && licznike == 1) {
                znak = str.charAt(i);
                eliczby = eliczby + (char)znak;
            }
            else {
                break;
            }
        }
        if(liczby.length() != 0) {
            koniec = Integer.parseInt(liczby);
        }
        if(eliczby.length() != 0) {
            ekoniec = Integer.parseInt(eliczby);
        }
        if(licznike != 0) {
            for(int i = 0; i < ekoniec; i++) {
                dycha = dycha * 10;
            }
            koniec = koniec * dycha;
        }
        return koniec;
    }

}
