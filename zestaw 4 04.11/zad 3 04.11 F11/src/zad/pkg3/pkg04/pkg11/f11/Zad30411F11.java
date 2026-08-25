package zad.pkg3.pkg04.pkg11.f11;
import java.util.Scanner;

public class Zad30411F11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Podaj ciąg znaków: ");
        String napis = in.nextLine();
        
        int tyl = napis.length() - 1;
        int licznik = 0;
        for(int i = 0; i < napis.length(); i++) {
            if(napis.charAt(i) != napis.charAt(tyl)) {
                System.out.println("Podany ciąg nie jest palindromem!");
                licznik++;
                break;
            }
            tyl--;
        }
        if(licznik==0) {
            System.out.println("Podany ciąg jest palindromem!");
        }
    }
    
}
