package Q1;
import java.util.*;
public class LP_4_1 {
    public static void main(String[] args) {
        System.out.print("Number Of Copys Requested: ");
        Scanner input = new Scanner(System.in);
        int NumCopys = input.nextInt();
        double PricePerCopy = 0.00;
        double Total = 0.00;

        if (NumCopys =< 99) {
            PricePerCopy = NumCopys * 0.30;
            Total = PricePerCopy;
            System.out.print("Number Of Copys: " + NumCopys);
            System.out.println();
        }
    }
}
