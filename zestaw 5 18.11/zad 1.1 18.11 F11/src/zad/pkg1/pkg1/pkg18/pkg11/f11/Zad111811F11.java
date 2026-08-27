package zad.pkg1.pkg1.pkg18.pkg11.f11;
import java.util.Scanner;

public class Zad111811F11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Podaj liczbę całkowitą, z której chcesz uzyskać silnię rekurencyjną: ");
        int licz = in.nextInt();
        int sil = sil(licz);
        System.out.println("Twoja silnia wyliczona rekurencyjnie: " + sil);
    }
    public static int sil(int a) {
        if(a > 1) {
            return a * sil(a-1);
        }
        return 1;
    }
}

