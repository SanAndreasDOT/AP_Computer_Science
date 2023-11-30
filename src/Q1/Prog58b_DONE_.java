package Q1;
import java.util.*;
public class Prog58b_DONE_ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter A: ");
        double a = input.nextDouble();
        System.out.println("Enter B: ");
        double b = input.nextDouble();
        System.out.println("Enter C: ");
        double c = input.nextDouble();
        double d = b*b - 4.0 * a * c;
        if (d > 0.0){
            double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);
            //Math.sqrt (b*b - 4 * a * c)
            //Math.sqrt(Math.pow(B,2) - 4 * a * c)
            System.out.println("The Roots are " + r1 + " and " + r2);
        }
        else if (d == 0.0) {
            double r1 = -b / (2.0 * a);
            System.out.println("the root is " + r1);
        }
        else{
            System.out.println("No Real Root");
        }
    }
}
/*
Enter A:
1
Enter B:
5
Enter C:
6
The Roots are -2.0 and -3.0

Process finished with exit code 0
 */