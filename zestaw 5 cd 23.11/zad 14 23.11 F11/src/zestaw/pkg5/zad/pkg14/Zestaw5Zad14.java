package zestaw.pkg5.zad.pkg14;

public class Zestaw5Zad14 {

    public static void main(String[] args) {
        System.out.println(czyAnagram("kolej", "olejk"));
        System.out.println(czyAnagram("kolej", "kole"));
        System.out.println(czyAnagram("kolej", "K O L E J"));
        System.out.println(czyAnagram("Gregory House", "Huge ego, sorry"));
    }
    public static boolean czyAnagram(String t1, String t2) {
        String wynik = "";
        String czesc = "";
        String czesc2 = "";
        int znak = 0;
        int znak2 = 0;
        for(int i = 0; i < t1.length(); i++) {
            if(Character.isLetter(t1.charAt(i))) {
                if(t1.charAt(i) >= 'A' && t1.charAt(i) <= 'Z') {
                    znak = t1.charAt(i);
                    znak2 = t1.charAt(i) + 32;
                }
                else {
                    znak = t1.charAt(i);
                    znak2 = t1.charAt(i) - 32;
                }
                if(t2.indexOf((char)znak) == -1 && t2.indexOf((char)znak2) == -1) {
                    return false;
                }
                else {
                    if(t2.indexOf((char)znak) != -1) {
                        czesc = t2.substring(0, t2.indexOf((char)znak));
                        czesc2 = t2.substring(t2.indexOf((char)znak)+1, t2.length());
                        t2 = czesc + czesc2;
                    }
                    else {
                        czesc = t2.substring(0, t2.indexOf((char)znak2));
                        czesc2 = t2.substring(t2.indexOf((char)znak2)+1, t2.length());
                        t2 = czesc + czesc2;
                    }
                }
            }
        }
        return true;
    }
}
