package zestaw.pkg7.zad.pkg1.podejscie.pkg2;

public class Zamowienie {
    public Pozycja[] pozycje;
    public int ileDodanych;
    public int maksRozmiar;
    public int licznik = 0;

    public Zamowienie() {
        maksRozmiar = 10;
    }

    public Zamowienie(int maksRozmiar) {
        this.pozycje = new Pozycja[maksRozmiar];
    }

    public void dodajPozycje(Pozycja p) {
        int licz = 0;
        for(int i = 0; i < pozycje.length; i++) {
            if(pozycje[i] != null) {
                if(pozycje[i].nazwaTowaru == p.nazwaTowaru) {
                    pozycje[i].ileSztuk = pozycje[i].ileSztuk + p.ileSztuk;
                    licz = 1;
                    break;
                }
            }
        }
        if(licz == 0) {
            for(int i = 0; i < pozycje.length; i++) {
                if(pozycje[i] == null) {
                    pozycje[i] = p;
                    break;
                }
            }
        }
    }

    public void usunPozycje(int indeks) {
        pozycje[indeks] = null;
    }

    

    public double obliczWartosc() {
        double wynik = 0;
        for(int i = 0; i < pozycje.length; i++) {
            if(pozycje[i] != null) {
                wynik = wynik + pozycje[i].obliczWartoscZRabatem();
            }
        }
        return wynik;
    }
    
    @Override
    public String toString() {
        String wyniklan = "\nZamówienie:\n";
        for(int i = 0; i < pozycje.length; i++) {
            if(pozycje[i] != null) {
                wyniklan = wyniklan + pozycje[i] + "\n";
            }
        }
        return wyniklan + "\nRazem: " + obliczWartosc() + " zł";
    }
}
