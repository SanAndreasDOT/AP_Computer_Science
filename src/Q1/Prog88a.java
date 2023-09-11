package Q1;

public class Prog88a {
    public static void main(String[] args) {


        //Math.random() * (max - min) + min
        int num1 = (int) (Math.random() * (13 - 1)) + 1;
        int num2 = (int) (Math.random() * (20 - 2)) + 2;
        //Sum, difference, product, average, abs. value of difference, max, and min
        int sum = num1 + num2;
        int dif = num1 - num2;
        int adsdif = Math.abs(dif);
        int max, min;
        int ave = sum / 2;
        int prod = num1 * num2;


        // The Code inside "if" will only run if the condition it true
        if (num1 > num2) {
            max = num1;
                 // min = num2;
        } else { //Otherwise....
            max = num2;
        }        //min = num1;

        // Check if max and

        if (max == num1) {
            min = num2;
        } else{
            min = num1;
        }

            System.out.println ("Original numbers are " + num1 + " and " + num2);
            System.out.println ("Maximum = " + max);
            System.out.println ("Minimum = " + min);
            System.out.println ("Sum = " + sum);
            System.out.println ("Difference = " + dif);
            System.out.println ("Product = " + prod);
            System.out.println ("Average = " + ave);
            System.out.println ("Absolute Value = " + adsdif);






        // Sum =	33
        // Difference =	-7
        // Product =	260
        // Average =	 16.5
        //  Absolute value =	7
    }
}
