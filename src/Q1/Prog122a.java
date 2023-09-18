package Q1;
import java.util.*;
public class Prog122a {
    public static void main(String[] args) {

        int lcv = 0;
        int lcvsq = 0;
        int lcvsqr = 0;

        while (lcv < 50) {
            lcv += 1; // lvc = lcv + 1;
            System.out.println(lcv);
        }

        while (lcvsq < 2500) {
            lcvsq += Math.pow(lcvsq, 2);

            System.out.println(                      lcvsq);
        }
    }
}
