package Q1;
import java.util.*;
public class Prog72t {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Time (Hr) ");
        int time1 = input.nextInt();
        System.out.print("Enter the First Time (Min) ");
        int time2 = input.nextInt();
        System.out.print("Enter the Second Time (Hr) ");
        int time3 = input.nextInt();
        System.out.print("Enter the Second Time (Min) ");
        int time4 = input.nextInt();

        int out1 = time1 - time3;
        int out2 = time2 - time4;
        int out3 = time3 - time1;
        int out4 = time4 - time2;
        int timeset1 = 0;
        int timeset2 = 0;
        int timeout1 = 0;
        int timeout2 = 0;
        if (out1 > out3) {timeset1 = timeout1;}
        if (out2 > out4) {timeset2 = timeout2;}



        System.out.println("Hour = " +timeout1 );
        //System.out.println("Hour 2 = " + out3);
        System.out.println("Min = " + timeout2);
        //System.out.println("Min 2 = " + out4);
        //* Test Output | System.out.println(time1); System.out.println(time2); | *//











    }
}
