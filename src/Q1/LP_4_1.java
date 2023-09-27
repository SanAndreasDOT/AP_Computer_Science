package Q1;
import java.util.*;
public class LP_4_1 {
    public static void main(String[] args) {
        System.out.print("Number Of Copys Requested: ");
        Scanner input = new Scanner(System.in);
        int NumCopys = input.nextInt();
        double PricePerCopy = 0.00;
        double Total = 0.00;

        if (NumCopys <= 99)
            PricePerCopy = 0.30;
            else if (NumCopys<=499)
            PricePerCopy = 0.28;
            else if (NumCopys<=749)
            PricePerCopy = 0.27;
            else if (NumCopys<=1000)
            PricePerCopy = 0.26;
            else if (NumCopys < 1000)
            PricePerCopy = 0.25;

        Total = PricePerCopy * NumCopys;
        System.out.println("Number Of Copys: " + NumCopys);
        System.out.println("Price Per Copy: " + PricePerCopy);
        System.out.println("Total Cost: " + Total);
    }
}
