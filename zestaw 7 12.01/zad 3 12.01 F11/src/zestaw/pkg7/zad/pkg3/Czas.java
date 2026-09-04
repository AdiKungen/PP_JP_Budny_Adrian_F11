package zestaw.pkg7.zad.pkg3;

public class Czas {
    private int godz;
    private int minuty;

    public Czas(int godz, int minuty) {
        this.godz = godz;
        this.minuty = minuty;
    }

    public Czas(String lancuch) {
        String[] tablica = lancuch.split(" ");

        godz = Integer.parseInt(tablica[0]);
        minuty = Integer.parseInt(tablica[2]);
    }

    public Czas dodaj(Czas t) {
        int wyngodz = this.godz + t.godz;
        int wynmin = this.minuty + t.minuty;

        Czas wynik = new Czas(wyngodz, wynmin);
        return wynik;
    }

    public Czas odejmij(Czas t) {
        int wyngodz = this.godz - t.godz;
        int wynmin = this.minuty - t.minuty;

        Czas wynik = new Czas(wyngodz, wynmin);
        return wynik;
    }

    public Czas pomnoz(int ile) {
        int wyngodz = this.godz * ile;
        int wynmin = this.minuty * ile;

        Czas wynik = new Czas(wyngodz, wynmin);
        return wynik;
    }

    public static Czas sumuj(Czas[] tab, int n) {
        int wygo = 0;
        int wymi = 0;
        for(int i = 0; i < n; i++) {
            wygo = wygo + tab[i].godz;
            wymi = wymi + tab[i].minuty;
        }
        Czas wynik1 = new Czas(wygo,wymi);
        return wynik1;
    }

    public String toString() {
        while(minuty>=60) {
            minuty = minuty - 60;
            godz++;
        }
        while(minuty<0 && godz>0) {
            godz--;
            minuty = minuty + 60;
        }
        return godz + " h " + minuty + " min";
    }

}
