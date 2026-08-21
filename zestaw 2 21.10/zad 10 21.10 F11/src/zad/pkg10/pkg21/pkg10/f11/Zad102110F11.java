package zad.pkg10.pkg21.pkg10.f11;
import java.util.Scanner;

public class Zad102110F11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Podaj liczbę: ");
        int liczba = in.nextInt();
        int suma = 0;
        int cyfra = 0;
        int sumP = 0;
        int liczP = 0;
        int sumNP = 0;
        int liczNP = 0;
        int sredniaP = 0;
        int sredniaNP = 0;
        do {         
            cyfra = liczba % 10;
            liczba = liczba / 10;
            suma = suma + cyfra;
            if (cyfra % 2 == 0 && cyfra != 0) {
                sumP = sumP + cyfra;
                liczP++;
            }
            else if (cyfra % 2 == 1  && cyfra != 0) {
                sumNP = sumNP + cyfra;
                liczNP++;
            }
        } while (liczba != 0);
        System.out.println("Suma cyfr równa się: " + suma);
        if (liczP != 0) {
            sredniaP = sumP / liczP;
        }
        if (liczNP != 0) {
            sredniaNP = sumNP / liczNP;
        }
        System.out.println("Stosunek równa się: " + sredniaP + "/" + sredniaNP);
    }
    
}
