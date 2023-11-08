package Q1.Prog54cCl;

import java.util.Scanner;

public class Prog54c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter Radius: ");
        int radi = input.nextInt();

        System.out.print("Please enter circumference: ");
        int circ = input.nextInt();

        System.out.print("Please enter area: ");
        double ara = input.nextDouble();


        Cl54c calc = new Cl54c(radi, circ, ara);
        calc.calc();
    }
}
/*
Please enter Radius: 3
Please enter circumference: 22
Please enter area: 41
Area = 41.0
Radius: 3
Circumference: 22

Process f
 */