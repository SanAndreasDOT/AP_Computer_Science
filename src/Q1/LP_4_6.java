package Q1;
import java.util.*;
public class LP_4_6 {
    public static void main(String[] args) {
        int mathnum1 =  (int)(Math.random() * (10 - 1) + 1);
        int mathnum2 =  (int)(Math.random() * (10 - 1) + 1);
        int anwser = 0;
        System.out.println("What is " + mathnum1 + " * " + mathnum2 + " = ");
        Scanner input = new Scanner(System.in);
        int userinput = input.nextInt();
        anwser = mathnum1 * mathnum2;
        if (anwser == userinput) {
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect");
        }
    }
}
// link to doc: https://docs.google.com/document/d/1WtTaKG9hO4j5xMpcId-v0wrX74LbT0jZ/edit
/*
What is 2 * 4 =
8
Correct

Process finished with exit code 0

Or

What is 4 * 7 =
8
Incorrect

Process finished with exit code 0

 */