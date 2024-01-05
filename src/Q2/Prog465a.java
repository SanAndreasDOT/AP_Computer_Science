package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog465a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner (new File("Langdat/prog465a.dat"));
            int [][] mat = new int[4][4]; // 4 row 4 col

            for (int r = 0; r < mat.length; r++)
                for (int c = 0; c < mat[0].length; c++)
                    mat[r][c] = input.nextInt();

            System.out.println("Original matrix 1: ");
            for (int[] row : mat) {
                for (int c : row)
                    System.out.print(c + " ");
                System.out.println("");
            }



        } catch (IOException e) {
            System.out.println("can't find data file!");
        }
    }
}
