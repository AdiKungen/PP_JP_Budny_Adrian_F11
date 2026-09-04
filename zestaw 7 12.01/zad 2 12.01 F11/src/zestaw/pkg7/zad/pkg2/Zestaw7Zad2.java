package zestaw.pkg7.zad.pkg2;
import java.io.IOException;

public class Zestaw7Zad2 {

    public static void main(String[] args) throws IOException {
        final int N = 10;
        Lista l = new Lista(N);
        for (int i = 0; i < N/2; ++i) {
            l.dodajElement( (1 << i) );
        }
        l.dodajElement(2);
        l.dodajElement(8);
        l.pisz();
        l.usunPierwszy(2);
        l.pisz();
        for (int i = 0; i < N/2; ++i) {
            l.dodajElement( (1 << i) );
        }
        l.pisz();
        System.out.println("Po usunięciu powtórzeń:");
        l.usunPowtorzenia();
        l.pisz();
        System.out.println("Po odwróceniu:");
        l.odwroc();
        l.pisz();
        l.zapiszDoPliku("test.txt");
    }
}
