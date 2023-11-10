package Q1;
import java.util.*;
public class LP_4_3 {
    public static void main(String[] args) {
        System.out.println("Enter Number Of Dozens Wanted: ");
        Scanner input = new Scanner(System.in);
        int numDozen = input.nextInt();
        double pricePerDozen;
        double Total;

        if (numDozen <= 3)
            pricePerDozen = 0.50;
        else if (numDozen <= 5)
            pricePerDozen = 0.45;
        else if (numDozen <= 10)
            pricePerDozen = 0.40;
        else pricePerDozen = 0.35;


        Total = pricePerDozen * numDozen;
        System.out.println("Number of Dozen: " + numDozen);
        System.out.println("Price Per Dozen: " + pricePerDozen);
        System.out.println("Total Cost: " + Total);
    }
}
/*
Enter Number Of Dozens Wanted:
18
Number of Dozen: 18
Price Per Dozen: 0.35
Total Cost: 0.75

Process finished with exit code 0

 */