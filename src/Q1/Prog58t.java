package Q1;

import java.util.Scanner;

public class Prog58t {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Cost Of Item");
        double cost = input.nextDouble();

        System.out.println("Enter Amount Payed");
        double payed = input.nextDouble();


        int dollars = 0;
        int q = 0;
        int dimes = 0;
        int n =0;
        int p = 0;
        double amtDue = payed - cost;

        dollars = (int) (amtDue / 1.00);












        System.out.printf("Change is $%.2f\n", amtDue);
        System.out.println("Dollars: " + dollars);
        System.out.println("Quarters:  " + q);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickles: " + n);
        System.out.println("Pennys: " + p);



    }
}
