package Q1;
import java.util.*;
public class Prog93a {
    public static void main(String[] args) {

        //Need Help

        double base = 0.0475;
        double surcharge = 0.1;
        double basetax = 0;
        double cityutil = 0.03;
        double citytaxtot = 0;
        double latefee = 0.4;
        double latefeetot = 0;
        double total = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Energy Used ");
        int UserInput = input.nextInt();

        UserInput = (int) (UserInput * base);
        basetax = UserInput + (UserInput * surcharge);
        citytaxtot = UserInput + (UserInput * cityutil);
        latefeetot = UserInput + (UserInput * latefee);
        total = basetax + citytaxtot + latefeetot;






            System.out.println(UserInput);
            System.out.println(base);
            System.out.println(surcharge);
            System.out.println(basetax);
            System.out.println(cityutil);
            System.out.println(citytaxtot);
            System.out.println(latefee);
            System.out.println(latefeetot);
            System.out.println(total);










    }
}
