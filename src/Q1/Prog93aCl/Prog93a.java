package Q1.Prog93aCl;
import java.util.*;
public class Prog93a {
    public static void main(String[] args) {
        // Input Section
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Energy Used: ");
        int kwatts = input.nextInt();
        // Calculation Section
        Cl93a data = new Cl93a(kwatts);
        data.calc();

        String output = data.toString();

        //Output Section
        System.out.println(output);
    }
}