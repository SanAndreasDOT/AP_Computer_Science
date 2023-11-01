package Q1;

import java.util.Scanner;

public class Prog82a {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Speed limit");
        int Speedlimit = input.nextInt();
        System.out.println("Enter Your Speed");
        int YourSpeed = input.nextInt();

        int tooFast = 0;
        int Ticket = 20;

        tooFast = YourSpeed - Speedlimit;
        Ticket = Ticket + tooFast * 5;

        System.out.println("The Speed Limit is: " + Speedlimit + " MPH");
        System.out.println("Your Speed is: " + YourSpeed + " MPH");
        System.out.println("Your Fine is: $" + Ticket);
    }
}
/*
Enter Speed limit
30
Enter Your Speed
42
The Speed Limit is: 30 MPH
Your Speed is: 42 MPH
Your Fine is: $80

Process finished with exit code 0
 */