package Q1.Prog285bCl;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Prog285b {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner (new File("Langdat/prog285b.dat"));
            System.out.println("Id \tCode\tSales\tCommission");
            while (input.hasNext()) {
                int id = input.nextInt();
                int code = input.nextInt();
                double sales = input.nextDouble();

                Salesperson fred = new Salesperson(id, code, sales);
                fred.setComm();
                System.out.println(fred.toString()); // println(fred);
            }

        } catch (IOException e) {
            System.out.println("can't find data file!");
        }
    }
}
