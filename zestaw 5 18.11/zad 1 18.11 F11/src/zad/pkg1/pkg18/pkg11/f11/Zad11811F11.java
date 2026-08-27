package zad.pkg1.pkg18.pkg11.f11;
import java.util.Scanner;

public class Zad11811F11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Podaj liczbę całkowitą, z której chcesz uzyskać silnię iteracyjną: ");
        int licz = in.nextInt();
        int silnia = 1;
        
        for(int i = 2; i <= licz; i++) {
            silnia = silnia * i;
        }
        System.out.println("Twoja silnia wyliczona iteracyjnie: " + silnia);
    }
}

