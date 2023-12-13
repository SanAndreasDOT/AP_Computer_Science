package Q1;
import java.util.*;
public class LP_5_17_DONE_ {
    public static void main(String[] args) {


        Scanner input = new Scanner (System.in);
        System.out.print("Please Enter the password: ");
        String password = "SAFR";
        String userinput = input.next();

            int strike = 0;
            if (userinput.equals(password.toLowerCase())) {
                System.out.println("Access Granted");
            } else {
                strike += 1;
                System.out.println("Incorrect Password");
                userinput = input.next();
                System.out.println("Please Enter the password: ");
                strike += 1;
                System.out.println("Incorrect Password");
                userinput = input.next();
                strike += 1;
            }


            if (strike == 3) {
                System.out.println("Access Denied");
            }


    }
}
/*
Incorrect:
Please Enter the password: lsfd
Incorrect Password
lspd
Please Enter the password:
Incorrect Password
sahp
Access Denied

Process finished with exit code 0

================================
Correct:
Please Enter the password: safr
Access Granted

Process finished with exit code 0

 */