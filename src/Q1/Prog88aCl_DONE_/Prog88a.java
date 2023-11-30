package Q1.Prog88aCl_DONE_;

import java.util.Scanner;

public class Prog88a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number");
        int num1 = input.nextInt();
        System.out.println("Enter Second Number");
        int num2 = input.nextInt();

        Cl88a calc = new Cl88a(num1, num2);
        calc.calc();

        String output = calc.toString();

        System.out.println(output);
    }
}
/*
Enter First Number
13
Enter Second Number
20
Original numbers are 13 and 20
Maximum = 20
Minimum = 13
Sum = 33
Difference = -7
Product = 260
Average = 16
Absolute Value = 7

Process finished with exit code 0

 */