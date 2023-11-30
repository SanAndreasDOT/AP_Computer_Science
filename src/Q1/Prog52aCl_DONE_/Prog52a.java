package Q1.Prog52aCl_DONE_;
import java.util.*;

public class Prog52a { // Driver Class (main)
    public static void main(String[] args) {
        // Input Section
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length: ");
        int l = input.nextInt();
        System.out.print("Enter Width: ");
        int w = input.nextInt();

        // Calculation Section
        Cl52a wow = new Cl52a(l, w);
        wow.calc();  // Don't for get to call calc or setThing!


        int area = wow.getArea();
        int perim = wow.getPerim();

        //Output Section
        System.out.println("Rectangle area: " + area);
        System.out.println("Rectangle perimeter: " + perim);
    }
}
