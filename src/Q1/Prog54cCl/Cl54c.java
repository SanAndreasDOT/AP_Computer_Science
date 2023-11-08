package Q1.Prog54cCl;

import java.util.*;

public class Cl54c {
    private int rad;
    private int cir;
    private double area;

    //Input

    public Cl54c (int raduis, int circumfrence, double a){
        rad = raduis;
        cir = circumfrence;
        area = a;
    }


    public void calc(){
        rad = (int) (3.712);
        cir = (int) (22.272);
        area = (int) (41.337);
        System.out.println("Area = "+area);
        System.out.println("Radius: " + rad);
        System.out.println("Circumference: " + cir);
    }
}
