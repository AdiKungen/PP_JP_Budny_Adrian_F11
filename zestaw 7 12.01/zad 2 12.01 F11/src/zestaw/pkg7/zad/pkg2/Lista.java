package zestaw.pkg7.zad.pkg2;
import java.io.FileWriter;
import java.io.IOException;

public class Lista {
    private int pojemnosc;
    private int[] liczby;
    private int rozmiar;

    public Lista(int pojemnosc) {
        this.pojemnosc = pojemnosc;
        liczby = new int[pojemnosc];
        this.rozmiar = 0;
    }

    public void dodajElement(int element) {
        if(rozmiar != pojemnosc) {
            for(int i = 0; i < pojemnosc; i++) {
                if(liczby[i] == 0) {
                    liczby[i] = element;
                    rozmiar++;
                    break;
                }
            }
        }
        else {
            System.out.println("Lista jest pełna!");
        }
    }
    
    public int znajdz(int liczba) {
        for(int i = 0; i < pojemnosc; i++) {
            if(liczby[i] == liczba) {
                return i;
            }
        }
        return -1;
    }

    public void pisz() {
        System.out.println("Lista:");
        System.out.println("Pojemność: " + pojemnosc);
        System.out.println("Rozmiar: " + rozmiar);
        for(int i = 0; i < pojemnosc; i++) {
            if(liczby[i] != 0) {
                System.out.print(liczby[i] + " ");
            }
        }
        System.out.println();
    }
    
    public void usunPierwszy(int litera) {
        for(int i = 0; i < pojemnosc; i++) {
            if(liczby[i] == litera) {
                liczby[i] = 0;
                rozmiar--;
                break;
            }
        }
        for(int i = 0; i < pojemnosc; i++) {
            if(liczby[i] == 0) {
                int j = i;
                while(j<pojemnosc-1) {
                    liczby[j] = liczby[j+1];
                    j++;
                }
            }
        }
    }
    
    public void usunPowtorzenia() {
        for(int i = 0; i < pojemnosc-1; i++) {
            if(liczby[i] == 0) {
                continue;
            }
            else {
                for(int j = i+1; j < pojemnosc; j++) {
                    if(liczby[i] == liczby[j]) {
                        liczby[j] = 0;
                        rozmiar--;
                    }
                }
            }
        }
    }
    
    public void odwroc() {
        int x = 0;
        int y = liczby.length-1;
        int pocz;
        int kon;
            while(y>x && x != y) {
                while(liczby[x] == 0) {
                    x++;
                }
                while(liczby[y] == 0) {
                    y--;
                }
                pocz = liczby[x];
                System.out.println(x);
                kon = liczby[y];
                System.out.println(y);
                liczby[x] = kon;
                System.out.println(kon);
                liczby[y] = pocz;
                System.out.println(pocz);
                x++;
                y--;
            }
    }
    
    public void zapiszDoPliku(String nazwa) throws IOException {
        FileWriter plikWy = null;
        try {
            plikWy = new FileWriter("C:/Users/Adrian/Documents/tekstowe/" + nazwa);
            for(int i = 0; i < pojemnosc; i++) {
                plikWy.write(liczby[i] + " ");
            }
        }
        finally {
            if(plikWy != null) {
                plikWy.close();
            }
        }
    }
}
