package Q1;
import java.util.*;
public class Prog65h_DONE_ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter pounds: ");
        double pounds = input.nextDouble();

        System.out.print("Enter shillings: ");
        double shillings = input.nextDouble();

        System.out.print("Enter pence: ");
        double pence = input.nextDouble();

        double shilltopound = 0.20;
        double pentoshill =  0.12;

        double Decimal_pounds = 0.00;

        pounds += shillings / shilltopound;
        shillings += pence / pentoshill;

        Decimal_pounds = pounds + shillings + pence;


        System.out.println(Decimal_pounds);
        System.out.println(pence);
        System.out.println(pounds);
        System.out.println(pentoshill);
        System.out.println(shilltopound);
        System.out.println(shillings);

/*
Enter pounds: 0.7
Enter shillings: 0.17
Enter pence: 0.9
10.120000000000001
0.9
1.5499999999999998
0.12
0.2
7.670000000000001

Process finished with exit code 0
 */



        // It's not right but it doesn't make sense

    }
}
