package pkg14.pkg10.f;
import java.util.Scanner;

public class F {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Podaj temperaturę w stopniach Celsjusza: ");
        
        double stopnie_C = in.nextDouble();
        double stopnie_F = stopnie_C * 1.8 + 32.0;
        
        System.out.println("Wartość: " + stopnie_C + " w stopniach Celsjusza odpowiada wartości: " + stopnie_F + " w stopniach Fahrenheita");
    }
    
}
