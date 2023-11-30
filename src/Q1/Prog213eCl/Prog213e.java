package Q1.Prog213eCl;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog213e {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner (new File("Langdat/prog213e.dat"));
            while (input.hasNext()) {
                int age = input.nextInt();
                int pple = input.nextInt();
                double percent = input.nextDouble();

                Cl213e calc = new Cl213e(age, pple, percent);
                calc.calc();

            }

        } catch (IOException e) {
            System.out.println("can't find data file!");
        }

    }
}
