package Q1;

import java.util.Scanner;

public class Prog58h {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Base Amount");
        double p = input.nextDouble();
        System.out.println("Enter Interest Rate");
        double r = input.nextDouble();
        System.out.println("Enter the time Compound per year");
        int n = input.nextInt();
        System.out.println("Enter Time");
        double t = input.nextDouble();


        double i = p * (Math.pow((1+(.01*r)/n),(n*t)/365)-1);
        double a = p + i;
        System.out.printf("The Interest Earned is $%.2f\n", i);
        System.out.printf("Total Saving Amount is $%.2f\n", a);

    }
}
/*
Enter Base Amount
5000
Enter Interest Rate
11.5
Enter the time Compound per year
365
Enter Time
900
The Interest Earned is $1638.96
Total Saving Amount is $6638.96

Process finished with exit code 0
 */