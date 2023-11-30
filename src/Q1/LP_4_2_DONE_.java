package Q1;

import java.util.Scanner;

public class LP_4_2_DONE_ {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("Enter Length: ");
        int Length = input.nextInt();
        System.out.print("Enter Width: ");
        int Width = input.nextInt();
        System.out.print("Enter Height: ");
        int Height = input.nextInt();
        System.out.print("Enter Weight: ");
        int Weight = input.nextInt();
        int Size = 0;

        Size = Length * Weight * Height;

        if (Weight > 27 & Size > 100000) {
            System.out.println("Too Heavy and to big");

        }
         if (Weight > 27) {
             System.out.println("To Heavy");
         }

         if (Size > 100000) {
             System.out.println("Too Big");
         }

         else{
             System.out.println("Size is: " + Size);
         }


    }
}
/*
Enter Length: 37
Enter Width: 55
Enter Height: 26
Enter Weight: 50
To Heavy
Size is: 48100

Process finished with exit code 0
 */