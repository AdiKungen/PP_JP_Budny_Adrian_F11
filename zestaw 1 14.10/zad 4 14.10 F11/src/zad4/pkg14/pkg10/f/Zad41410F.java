package zad4.pkg14.pkg10.f;
import java.util.Scanner;

public class Zad41410F {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Podaj swój dochód: ");
        double dochod = in.nextDouble();
        
        if(dochod < 85528) {
            dochod = dochod * 0.18 - 556.02;
            System.out.format("Twój należny podatek wynosi %.2f zł", dochod);
        }
        else if(dochod >= 85528) {
            double nadwyzka = dochod - 85528;
            dochod = nadwyzka * 0.32 + 14839.02;
            System.out.format("Twój należny podatek wynosi %.2f zł", dochod);
        }
    }
    
}
