package Q1.Prog54bCl;

public class Cl54b {
    private int num1;
    private int num2;
    private int num3;
    private int num4;
    private int sum;
    private double ave;

    //Input
    public Cl54b (int num1i, int num2i, int num3i, int num4i){
        num1 = num1i;
        num2 = num2i;
        num3 = num3i;
        num4 = num4i;
    }

    public void calc() {
        sum = num1 + num2 + num3 + num4;
        ave = sum / 4.0;
    }


    public String toString() {return "The Sum of the four numbers are: " + sum + " " + "The Average of the four numbers are: " + ave;}
}
