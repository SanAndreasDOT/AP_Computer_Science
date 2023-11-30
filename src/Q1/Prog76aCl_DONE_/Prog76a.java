package Q1.Prog76aCl_DONE_;

import java.util.Scanner;

public class Prog76a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number you dislike between 1 - 9");
        int dislike = input.nextInt();

        Cl76a calc = new Cl76a(dislike);
        calc.calc();

        String output = calc.toString();

        System.out.println(output);
    }
}
/*
Enter a number you dislike between 1 - 9
5
5 * 9 = 45
5 and 45 * 123456789
 = 555555555

Process finished with exit code 0

 */