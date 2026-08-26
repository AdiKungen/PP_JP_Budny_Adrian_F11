package zad.pkg4.pkg04.pkg11.f11;
import java.util.Scanner;

public class Zad40411F11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Podaj ciąg znaków: ");
        String napis = in.nextLine();
        
        int suma = 0;
        int cyfra = 0;
        
        for(int i = 0; i < napis.length(); i++) {
            char znak = napis.charAt(i);
            if(Character.isDigit(znak) == true) {
                cyfra = Character.getNumericValue(znak);
                suma = suma + cyfra;
            }
        }
        System.out.println(suma);
    }
    
}
