package Q1;
import java.util.*;
public class GradeCalc_DONE_ {
    public static void main(String[] args) {
        // Input Section
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Grade as a percent ");
        double gp = input.nextDouble();

        // Calculation Section
        String grade = "";
        if (gp >= 90) grade = "A";
        else if (gp >= 80) grade = "B";
        else if (gp >= 70) grade = "C";
        else if (gp >= 60) grade = "D";
        else grade = "F";

        // Output Section
        System.out.println("Your Grade is a(n) " + grade);





    }
}
