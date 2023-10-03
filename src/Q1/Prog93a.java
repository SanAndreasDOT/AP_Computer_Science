package Q1;
import java.util.*;
public class Prog93a {
    public static void main(String[] args) {

        //Need Help

        double base = 0.0475;
        double surcharge = 0.1;
        double cityutil = 0.3;
        double latefee = 0.4;
        double total = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Energy Used ");
        double UserInput = input.nextDouble();


            total = base  * UserInput + surcharge + cityutil;
            System.out.println(UserInput);
            System.out.println(base);
            System.out.println(surcharge);
            System.out.println(cityutil);
            System.out.println(latefee);
            System.out.println(total);










    }
}
