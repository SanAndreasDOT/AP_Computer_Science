package Q1;
import java.util.*;
public class Prog54a_DONE_ {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        //int,double, boolean, String
        System.out.print("Enter the car model: ");
        String model = keyboard.nextLine();

        System.out.print("Enter miles driven: ");
        int miles = keyboard.nextInt();

        System.out.print("Enter Gallons used: ");
        int gallons = keyboard.nextInt();

        double  mpg = miles / (double)gallons;
        System.out.println("MPG used by " + model + " is " + mpg + " m/g");

/*
Enter the car model: 1970 VW Bug
Enter miles driven: 286
Enter Gallons used: 9
MPG used by 1970 VW Bug	 is 31.77777777777778 m/g
 */












    }
}
