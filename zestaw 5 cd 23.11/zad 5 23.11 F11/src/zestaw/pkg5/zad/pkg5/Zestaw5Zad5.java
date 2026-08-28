package zestaw.pkg5.zad.pkg5;
import java.util.Scanner;

public class Zestaw5Zad5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Podaj łańcuch znakowy: ");
        String tekst = in.nextLine();

        System.out.println("Podaj prefiks: ");
        String pref = in.nextLine();

        boolean wynik = startsWith(tekst, pref);
        System.out.println(wynik);
    }
    public static boolean startsWith(String str1, String str2) {
        for(int i = 0; i < str2.length(); i++) {
            if(str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

}
