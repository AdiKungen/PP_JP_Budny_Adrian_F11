package zestaw.pkg5.zad.pkg15;

public class Zestaw5Zad15 {

    public static void main(String[] args) {
        int[] wynik = HTMLColor2RGB("#001020");
        for(int i = 0; i < wynik.length; i++) {
            System.out.print(wynik[i] + ", ");
        }
        System.out.println();
    }
    public static int [] HTMLColor2RGB(String color) {
        int tablicz = 0;
        int[] koniec = new int[3];
        int liczba = 0;
        int wynik = 0;
        int licznik = 0;
        int znak;
        for(int i = 1; i < color.length(); i++) {
            if(Character.isDigit(color.charAt(i))) {
                liczba = Character.getNumericValue(color.charAt(i));
                if(i%2 == 0) {
                    wynik = liczba * 1;
                    licznik++;
                }
                else {
                    wynik = liczba * 16;
                    licznik++;
                }
            }
            else {
                switch(color.charAt(i)) {
                    case 'A':
                        liczba = 10;
                        break;
                    case 'B':
                        liczba = 11;
                        break;
                    case 'C':
                        liczba = 12;
                        break;
                    case 'D':
                        liczba = 13;
                        break;
                    case 'E':
                        liczba = 14;
                        break;
                    case 'F':
                        liczba = 15;
                        break;
                }
                if(i%2 == 0) {
                    wynik = liczba * 1;
                    licznik++;
                }
                else {
                    wynik = liczba * 16;
                    licznik++;
                }
            }
            koniec[tablicz] = koniec[tablicz] + wynik;
            if(licznik == 2) {
                licznik = 0;
                tablicz++;
            }
        }
        return koniec;
    }
}
