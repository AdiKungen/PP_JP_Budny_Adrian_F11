package zad2.pkg14.pkg10.f;
import java.util.Scanner;

public class Zad21410F {

    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        
        System.out.println("Podaj pierwszą liczbę: ");
        int liczba1 = in1.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        int liczba2 = in1.nextInt();
        System.out.println("Podaj trzecią liczbę: ");
        int liczba3 = in1.nextInt();
        
        //szukanie najwiekszej
        if(liczba1 > liczba2 && liczba1 > liczba3) {
            System.out.println("Największa liczba: " + liczba1);
        }
        else if (liczba2 > liczba1 && liczba2 > liczba3) {
            System.out.println("Największa liczba: " + liczba2);
        }
        else if (liczba3 > liczba1 && liczba3 > liczba2) {
            System.out.println("Największa liczba: " + liczba3);
        }
        
        //szukanie najmniejszej
        if(liczba1 < liczba2 && liczba1 < liczba3) {
            System.out.println("Najmniejsza liczba: " + liczba1);
        }
        else if (liczba2 < liczba1 && liczba2 < liczba3) {
            System.out.println("Najmniejsza liczba: " + liczba2);
        }
        else if (liczba3 < liczba1 && liczba3 < liczba2) {
            System.out.println("Najmniejsza liczba: " + liczba3);
        }
    }
    
}
