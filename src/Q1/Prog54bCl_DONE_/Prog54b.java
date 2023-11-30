package Q1.Prog54bCl_DONE_;

import java.util.Scanner;

public class Prog54b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1 = input.nextInt();

        System.out.print("Enter Second Number: ");
        int num2 = input.nextInt();

        System.out.print("Enter Third Number: ");
        int num3 = input.nextInt();

        System.out.print("Enter Fourth Number: ");
        int num4 = input.nextInt();

        Cl54b calc = new Cl54b(num1, num2, num3, num4);
        calc.calc();

        String output = calc.toString();

        System.out.println(output);


    }
}
/*
Enter First Number: 475
Enter Second Number: 821
Enter Third Number: 369
Enter Fourth Number: 562
The Sum of the four numbers are: 2227 The Average of the four numbers are: 556.75

Process finished with exit code 0

 */