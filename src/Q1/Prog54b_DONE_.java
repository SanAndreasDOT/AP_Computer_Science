package Q1;
import java.util.*;
public class Prog54b_DONE_ {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);


        System.out.print("Enter First Number: ");
        int num1 = keyboard.nextInt();

        System.out.print("Enter Second Number: ");
        int num2 = keyboard.nextInt();

        System.out.print("Enter Third Number: ");
        int num3 = keyboard.nextInt();

        System.out.print("Enter Fourth Number: ");
        int num4 = keyboard.nextInt();

        int sum = num1 + num2 + num3 + num4;

                System.out.println("The Sum of the four numbers are: " + sum);

        double ave = sum / 4.0;

        System.out.println("The Average of the four numbers are: " + ave);

/*
Enter First Number: 475
Enter Second Number: 821
Enter Third Number: 369
Enter Fourth Number: 562
The Sum of the four numbers are: 2227
The Average of the four numbers are: 556.75
 */















    }
}
