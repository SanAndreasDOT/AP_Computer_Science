package Q1;
import java.util.*;
public class LP_4_9_DONE_ {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Enter Number Between 1 - 20: ");
        int player = input.nextInt();
        int computerNum = (int)(Math.random() * (20 - 1) + 1);
        System.out.println("Computer's Number: " + computerNum);
        if (computerNum == player){
            System.out.println("Correct");
        } else {
            System.out.println("Sorry Wrong Number");
        }








    }
}
/*
Enter Number Between 1 - 20:
5
Computers Number: 1
Sorry Wrong Number

Process finished with exit code 0

 */
// link to doc: https://docs.google.com/document/d/1WtTaKG9hO4j5xMpcId-v0wrX74LbT0jZ/edit