package zad.pkg1.pkg04.pkg11.f11;
import java.util.Scanner;

public class Zad10411F11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Podaj ciąg znaków: ");
        String napis = in.nextLine();
        int licznik = 0;
        char znak = napis.charAt(napis.length()-1);
        
        for(int i = 0; i<napis.length(); i++) {
            if(napis.charAt(i) == znak) {
                licznik++;
            }
        }
        System.out.println(licznik + " powtórzeń znaku: " + znak);
    }
    
}
