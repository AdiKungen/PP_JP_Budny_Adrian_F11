package zad.pkg6.pkg04.pkg11.f11;
import java.util.Scanner;

public class Zad60411F11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Podaj łańcuch znaków do zaszyfrowania: ");
        String napis = in.nextLine();
        
        System.out.println("Podaj przesunięcie: ");
        int przes = in.nextInt();
        
        System.out.println("Zaszyfrowany tekst: ");
        int litera = 0;
        for(int i=0; i < napis.length(); i++) {
            litera = napis.charAt(i);
            if(litera == 32)  {
                litera = 32;
            }
            else {
                litera = napis.charAt(i) + przes;
                if(litera > 122) {
                    litera = litera - 26;
                }
                else if (litera < 97) {
                    litera = litera + 26;
                }
            }
            char znak = (char)litera;
            System.out.print(znak);
        }
        System.out.println("");
    }
    
}
