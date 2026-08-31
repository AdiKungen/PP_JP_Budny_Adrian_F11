package zad.pkg5.zestaw.pkg6;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;

public class Zad5Zestaw6 {

    public static void main(String[] args) throws IOException  {
        emerytura("zad5.txt");
    }
    public static boolean emerytura(String nazwaPliku) throws IOException  {
        BufferedReader br = null;
        FileWriter plikWy = null;
        try {
            br = new BufferedReader(new FileReader("C:/Users/Adrian/Documents/pliki/" + nazwaPliku));
            String l;
            String[] tab = new String[4];
            int licznik = 0;
            String slowo = "";
            while ((l = br.readLine()) != null) {
                for(int i = 0; i < l.length(); i++) {
                    if(!Character.isWhitespace(l.charAt(i))) {
                        slowo = slowo + l.charAt(i);
                    }
                    else if(Character.isWhitespace(l.charAt(i))) {
                        tab[licznik] = slowo;
                        slowo = "";
                        licznik++;
                    }
                    tab[licznik] = slowo;
                }
                int wiek = Integer.parseInt(tab[3]);
                int ile = 65 - wiek;
                String plikFin = "";
                if(tab[2].contains("M")) {
                    plikFin = "mezczyzni.txt";
                }
                else if(tab[2].contains("K")) {
                    plikFin = "kobiety.txt";
                }
                plikWy = new FileWriter("C:/Users/Adrian/Documents/pliki/" + plikFin, true);
                plikWy.write(tab[1] + " " + tab[0] + " " + ile + "\n");
                licznik = 0;
                slowo = "";
                for(int i = 0; i < tab.length; i++) {
                    tab[i] = "";
                }
                plikWy.close();
            }
        } finally {
            if (br != null) {
                br.close();
                }
            if (plikWy != null) {
                plikWy.close();
            }
        }
        return true;
    }
}
