package zad.pkg12.zestaw.pkg2;
import java.util.Scanner;

public class Zad12Zestaw2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Podaj ilość złotych: ");
        int zlote = in.nextInt();
        int grosze = in.nextInt();
        int licznik = 0;

        do {
            zlote = zlote - 5;
            if(zlote>=0) {
                licznik++;
            }
        } while(zlote>=0);
        zlote = zlote + 5;
        if (licznik>0) {
            System.out.println(licznik + " x 5 zł");
        }
        licznik = 0;

        do {
            zlote = zlote - 2;
            if(zlote>=0) {
                licznik++;
            }
        } while(zlote>=0);
        zlote = zlote + 2;
        if (licznik>0) {
            System.out.println(licznik + " x 2 zł");
        }
        licznik = 0;

        do {
            zlote = zlote - 1;
            if(zlote>=0) {
                licznik++;
            }
        } while(zlote>=0);
        zlote = zlote + 1;
        if (licznik>0) {
            System.out.println(licznik + " x 1 zł");
        }
        licznik = 0;

        do {
            grosze = grosze - 50;
            if(grosze>=0) {
                licznik++;
            }
        } while(grosze>=0);
        grosze = grosze + 50;
        if (licznik>0) {
            System.out.println(licznik + " x 50 gr");
        }
        licznik = 0;

        do {
            grosze = grosze - 20;
            if(grosze>=0) {
                licznik++;
            }
        } while(grosze>=0);
        grosze = grosze + 20;
        if (licznik>0) {
            System.out.println(licznik + " x 20 gr");
        }
        licznik = 0;

        do {
            grosze = grosze - 10;
            if(grosze>=0) {
                licznik++;
            }
        } while(grosze>=0);
        grosze = grosze + 10;
        if (licznik>0) {
            System.out.println(licznik + " x 10 gr");
        }
        licznik = 0;

        do {
            grosze = grosze - 5;
            if(grosze>=0) {
                licznik++;
            }
        } while(grosze>=0);
        grosze = grosze + 5;
        if (licznik>0) {
            System.out.println(licznik + " x 5 gr");
        }
        licznik = 0;

        do {
            grosze = grosze - 2;
            if(grosze>=0) {
                licznik++;
            }
        } while(grosze>=0);
        grosze = grosze + 2;
        if (licznik>0) {
            System.out.println(licznik + " x 2 gr");
        }
        licznik = 0;

        do {
            grosze = grosze - 1;
            if(grosze>=0) {
                licznik++;
            }
        } while(grosze>=0);
        grosze = grosze + 1;
        if (licznik>0) {
            System.out.println(licznik + " x 1 gr");
        }
        licznik = 0;
    }

}
