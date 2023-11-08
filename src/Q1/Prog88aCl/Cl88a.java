package Q1.Prog88aCl;

public class Cl88a {

    private int num1;
    private int num2;
    private int sum;
    private int dif;
    private int adsdif;
    private int max;
    private int min;
    private int ave;
    private int prod;



    public Cl88a (int n1, int n2){
        num1 = n1;
        num2 = n2;
    }



    public void calc() {
        sum = num1 + num2;
        dif = num1 - num2;
        adsdif = Math.abs(dif);
        ave = sum / 2;
        prod = num1 * num2;


        if (num1  > num2) {
            max = num1;
        } else {
            max = num2;
        }

        if (max == num1) {
            min = num2;
        } else {
            min = num1;
        }
    }
    public String toString()  {return "Original numbers are " + num1 + " and " + num2 + "\n" + "Maximum = " + max + "\n" + "Minimum = " + min + "\n" + "Sum = " + sum + "\n" + "Difference = " + dif + "\n" + "Product = " + prod + "\n" + "Average = " + ave + "\n" + "Absolute Value = " + adsdif;}
}
