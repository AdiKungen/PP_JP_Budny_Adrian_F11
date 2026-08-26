package zad.pkg5.pkg04.pkg11.f11;
import java.util.Scanner;

public class Zad50411F11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Podaj ciąg znaków: ");
        String napis = in.nextLine();
        
        int licznik = 0;
        
        for(int i = 0; i < napis.length(); i++) {
            if(napis.charAt(i) == '(') {
                licznik++;
            }
            else if(napis.charAt(i) == ')') {
                licznik--;
            }
        }
        if(licznik == 0) {
            System.out.println("OK");
        }
        else if (licznik != 0) {
            System.out.println("Błędne sparowanie nawiasów");
        }
    }
    
}
