package zad.pkg6.pkg14.pkg10.f;
import java.util.Scanner;

public class Zad61410F {

    public static void main(String[] args) {
            Scanner in1 = new Scanner(System.in);
            
            System.out.println("Witaj jestem kalkulatorem. Proszę wpisać pierwszą liczbę: ");
            double licz1 = in1.nextDouble();
            System.out.println("Proszę wpisać drugą liczbę: ");
            double licz2 = in1.nextDouble();
            System.out.println("Proszę wpisać symbol operacji arytmetycznej: ");
            String symb = in1.next();
            switch(symb) {
                case "+":
                    double wynik = licz1 + licz2;
                    System.out.println("Wynikiem twojej operacji jest: " + wynik);
                    break;
                case "-":
                    wynik = licz1 - licz2;
                    System.out.println("Wynikiem twojej operacji jest: " + wynik);
                    break;
                case "*":
                    wynik = licz1 * licz2;
                    System.out.println("Wynikiem twojej operacji jest: " + wynik);
                    break;
                case "/":
                    if(licz2!=0){
                        wynik = licz1 / licz2;
                        System.out.println("Wynikiem twojej operacji jest: " + wynik);
                    }
                    else {
                        System.out.println("Nie można dzielić przez zero!");
                    }
                    break;
                default:
                    System.out.println("Podany operator arytmetytczny jest błędny!");
            }
    }
    
}
