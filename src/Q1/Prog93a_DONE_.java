package Q1;
import java.util.*;
public class Prog93a_DONE_ {
    public static void main(String[] args) {

        double base = 0.0475;
        double surcharge = 0.1;
        double basetax;
        double cityutil = 0.03;
        double citytaxtot = 0;
        double latefee = 0.04;
        double latefeetot = 0;
        double total;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Energy Used ");
        double UserInput = input.nextDouble();

        UserInput = (UserInput * base);
        basetax = UserInput + (UserInput * surcharge);
        cityutil = basetax + (basetax * cityutil);
        latefee = basetax + (basetax * latefee);
        total = latefee;

            System.out.println("total " + total);
    }
}
/*
Enter Energy Used 993
total 53.95

Process finished with exit code 0
 */