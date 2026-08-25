package zad.pkg2.pkg04.pkg11.f11;
import java.util.Scanner;

public class Zad20411F11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Podaj ciąg znaków: ");
        String napis = in.nextLine();
        
        for(int i = napis.length()-1; i>=0; i--) {
            System.out.print(napis.charAt(i));
        }
        System.out.println("");
    }
    
}
