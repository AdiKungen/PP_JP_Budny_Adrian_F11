package zestaw.pkg5.zad.pkg4;
import java.util.Scanner;

public class Zestaw5Zad4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Podaj łańcuch znaków: ");
        String tekst = in.nextLine();
        
        String wynik = flipCase(tekst);
        System.out.println(wynik);
    }
    public static String flipCase(String text) {
        String text2 = "";
        int znak2 = 0;
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) >= 'A' && text.charAt(i) <= 'Z') {
                znak2 = text.charAt(i);
                znak2 = znak2 + 32;
                text2 = text2 + (char)znak2;
            }
            else if(text.charAt(i) >= 'a' && text.charAt(i) <= 'z') {
                znak2 = text.charAt(i);
                znak2 = znak2 - 32;
                text2 = text2 + (char)znak2;
            }
            else {
                znak2 = text.charAt(i);
                text2 = text2 + (char)znak2;
            }
        }
        return text2;
    }

}
