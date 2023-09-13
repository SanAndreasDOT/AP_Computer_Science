package Q1;
import java.util.*;
public class Prog76a {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number you dislike between 1 - 9 ");

        int dislike = input.nextInt();

        int sum = dislike * 9;

        int boom = sum * 12345679;



        System.out.println(dislike + " * 9  = " + sum);
        System.out.println (dislike + " and " + sum + " * 12345679 ");
        System.out.println (" = " + boom + " Haha Sucker");




        
    }
}
