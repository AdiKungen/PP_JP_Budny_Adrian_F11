package zestaw.pkg7.zad.pkg1.podejscie.pkg2;
import java.io.*;

public class Zestaw7Zad1Podejscie2 {

    public static void main(String[] args) throws IOException {
    	Pozycja p1 = new Pozycja("Chleb", 1, 3.5);
        System.out.println(p1);
        Pozycja p2 = new Pozycja("Cukier", 3, 4);
        System.out.println(p2);
        Pozycja p3 = new Pozycja("Cukier", 5, 4);
        System.out.println(p3);
        Zamowienie z = new Zamowienie(20);
        z.dodajPozycje(p1);
        z.dodajPozycje(p2);
        z.dodajPozycje(p3);
        System.out.println(z);
        Pozycja.zapiszZamowienie(z, "zamowienie.txt");
        Pozycja.wczytajZamowienie("zamowienie.txt");
    }

}
