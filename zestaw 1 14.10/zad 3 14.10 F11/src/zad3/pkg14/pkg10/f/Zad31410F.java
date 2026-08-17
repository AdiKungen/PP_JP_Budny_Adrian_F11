package zad3.pkg14.pkg10.f;
import java.util.Scanner;

public class Zad31410F {

    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        
        System.out.println("Podaj swoją wagę w kg: ");
        double waga = in1.nextDouble();
        System.out.println("Podaj swój wzrost w m: ");
        double wzrost = in1.nextDouble();
        
        wzrost = wzrost * wzrost;
        double bmi = waga/wzrost;
        
        if(bmi > 24.9) {
            System.out.println("nadwaga");
        }
        else if(bmi < 18.5) {
            System.out.println("niedowaga");
        }
        else if(bmi>=18.5 && bmi<=24.9) {
            System.out.println("waga prawidłowa");
        }
        
    }
}
