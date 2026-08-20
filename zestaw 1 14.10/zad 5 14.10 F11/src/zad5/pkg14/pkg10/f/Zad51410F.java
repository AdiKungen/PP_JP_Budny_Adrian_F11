package zad5.pkg14.pkg10.f;
import java.util.Scanner;

public class Zad51410F {

    public static void main(String[] args) {
            Scanner in1 = new Scanner(System.in);
            
            System.out.println("Proszę podać cenę towaru w zakresie 100-10 000: ");
            double cena = in1.nextDouble();
            
            if(cena < 100 || cena > 10000) {
                System.out.println("Cena nie mieściła się w zakresie. Proszę o ponowne podanie ceny towaru: ");
                cena = in1.nextInt();
            }
            
            System.out.println("Proszę podać liczbę rat w zakresie 6-48: ");
            double il_rat = in1.nextDouble();
            
            if(il_rat < 6 || il_rat > 48) {
                System.out.println("Ilość rat nie mieściła się w zakresie. Proszę o ponowne podanie ilości rat: ");
                il_rat = in1.nextInt();
            }
            
            if(il_rat >= 6 && il_rat <= 12) {
                double cz_kap = cena / il_rat;
                double cz_ods = (cena * 0.025) / il_rat;
                double rata = cz_kap + cz_ods;
                System.out.format("Wysokość twojej miesięcznej raty wynosi: %.2f zł", rata);
            }
            else if(il_rat >= 13 && il_rat <= 24) {
                double cz_kap = cena / il_rat;
                double cz_ods = (cena * 0.05) / il_rat;
                double rata = cz_kap + cz_ods;
                System.out.format("Wysokość twojej miesięcznej raty wynosi: %.2f zł", rata);
            }
            else if(il_rat >= 25 && il_rat <= 48) {
                double cz_kap = cena / il_rat;
                double cz_ods = (cena * 0.1) / il_rat;
                double rata = cz_kap + cz_ods;
                System.out.format("Wysokość twojej miesięcznej raty wynosi: %.2f zł", rata);
            }
    }
    
}
