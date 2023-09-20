package Q1;
import java.util.*;
public class Prog122a {
    public static void main(String[] args) {

        int lcv = 0;
        int lcvsq = 0;
        double lcvsqr = 0;


        while (lcv < 50) {
            lcv += 1; // lvc = lcv + 1;
            System.out.println(lcv);
        }

        while (lcvsq < 2500) {
            lcvsq += (int) Math.pow(lcvsq, lcv);
            System.out.println(lcvsq);
        }

        while (lcvsqr < 7.0711); {
            lcvsqr += Math.sqrt(lcvsq);
            System.out.println(lcvsqr);
        }
    }
}
