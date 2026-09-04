package zestaw.pkg7.zad.pkg1.podejscie.pkg2;
import java.io.*;

public class Pozycja {
    public String nazwaTowaru;
    public int ileSztuk;
    public double cena;

    public Pozycja(String nazwaTowaru, int ileSztuk, double cena) {
        this.nazwaTowaru = nazwaTowaru;
        this.ileSztuk = ileSztuk;
        this.cena = cena;
    }

    public double obliczWartosc() {
        return ileSztuk * cena;
    }

    public double obliczWartoscZRabatem() {
        if(ileSztuk >= 5 && ileSztuk < 10) {
            return ileSztuk * cena * 0.95;
        }
        else if(ileSztuk >= 10 && ileSztuk <= 20) {
            return ileSztuk * cena * 0.90;
        }
        else if(ileSztuk > 20) {
            return ileSztuk * cena * 0.85;
        }
        else {
            return ileSztuk * cena;
        }
    }
    
    public static void zapiszZamowienie(Zamowienie z, String nazwaPliku) throws IOException {
        FileWriter plikWy = null;
        try {
            plikWy = new FileWriter("C:/Users/Adrian/Documents/tekstowe/" + nazwaPliku);
            plikWy.write(z.toString());
            
        }
        finally {
            if(plikWy != null) {
                plikWy.close();
            }
        }
    }

    public static String wczytajZamowienie(String nazwaPliku) throws IOException {
        BufferedReader plikWy = null;   
        String ala = "";
        try {
            plikWy = new BufferedReader(new FileReader("C:/Users/Adrian/Documents/tekstowe/" + nazwaPliku));
            String l;
            while ((l = plikWy.readLine()) != null) {
                ala = ala + l + "\n";
            }
        } finally {
            if(plikWy != null) {
                plikWy.close();
            }
        }
        System.out.print(ala);
        return ala;
    }
    
    @Override
    public String toString() {
        return nazwaTowaru + "  " + cena + " zł" + "    " + ileSztuk + " szt." + "  " + obliczWartosc() + " zł" + " " + obliczWartoscZRabatem() + " zł";
    }
}
