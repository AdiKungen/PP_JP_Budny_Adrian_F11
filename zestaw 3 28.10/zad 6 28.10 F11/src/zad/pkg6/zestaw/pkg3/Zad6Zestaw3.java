package zad.pkg6.zestaw.pkg3;
import java.util.Scanner;

public class Zad6Zestaw3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Podaj liczbę (> 0): ");
        int n = in.nextInt();

        boolean[][] tab = new boolean[n][n];
        int[] sch = new int[100];
        int licztab = 0;

        for(int i=0; i < tab.length; i++) {
            for(int dz = 1; dz <= i+1; dz++) {
                if(i+1%dz==0) {
                    sch[licztab] = dz;
                    licztab++;
                }
            }
            for(int j=0; j< tab[i].length; j++) {
                for(int dz = 1; dz <= i+1; dz++) {
                    if(j+1%dz==0) {
                        for(int x = 0; x < sch.length; x++) {
                            if(sch[x] == dz && sch[x] != 1) {
                                tab[i][j] = false;
                                
                            }
                            tab[i][j] = true;
                        }
                    }   
                }
            }
        }
        
        for(int i=0; i< tab.length; i++) {
            for(int j=0; j< tab[i].length; j++) {
                System.out.print(tab[i][j] + " ");
                }
                System.out.println();
                }
        
        for(int i=0; i< sch.length; i++) {
            System.out.print(sch[i] + " ");
        }

    }

}
