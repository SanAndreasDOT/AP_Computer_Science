package Q1.Prog82aCl;

import java.util.Scanner;

public class Prog82a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Speed Limit: ");
        int lSpeed = input.nextInt();
        System.out.println("Your Speed: ");
        int ySpeed = input.nextInt();

        Cl82a calc = new Cl82a(ySpeed, lSpeed);
        calc.calc();

        String output = calc.toString();

        System.out.println(output);
    }
}
/*
Enter Speed Limit:
30
Your Speed:
42
The Speed Limit was: 30Your Speed Was: 42Your Fine is $80

Process finished with exit code 0
 */