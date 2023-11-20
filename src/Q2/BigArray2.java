package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class BigArray2 {

    public static void printCat(Cat cat) {
        System.out.println(cat.getName() + "\t" + cat.getWeight() + "\t" + cat.getAge() + "\t" + cat.getCost());
    }

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner (new File("Langdat/bigarraylist.dat"));
            int numCats = input.nextInt();
            input.nextLine();
            Cat[] cats = new Cat[50];




           for (int lcv= 0; lcv<numCats; lcv++) {
               String name = input.nextLine();
               double weight = input.nextDouble();
               int age = input.nextInt();
               double cost = input.nextDouble();
               input.nextLine();
               cats[lcv] = new Cat(name, weight, age, cost);
            }

            System.out.println("2. All the cats: ");
            System.out.println("Name\tWeight\tAge\tCost");
            for (int lcv = 0; lcv < numCats; lcv++) {
                printCat(cats[lcv]);
            }
            // #2
            System.out.println("\t2. The Third cat is named: " + cats[2].getName());

            // #3
            cats[numCats-1].setWeight(cats[numCats-1].getWeight() + 10);
            System.out.println("3. the updated weight is: " + cats[numCats-1].getWeight());

            //#4
            int rascalIndex = 0;
            for (int lcv = 0; lcv < numCats; lcv++) {
                if (cats[lcv].getName().equals("Rascal"))
                    rascalIndex = lcv;
            }
            for (int lcv = rascalIndex; lcv < numCats -1;lcv++)
                cats[lcv] =cats[lcv+1];
            numCats--;

            //#5
            for (int lcv = numCats; lcv>1; lcv--)
                cats[lcv]=cats[lcv-1];
                cats[1] = new Cat("Angel", 3.6, 1, 25.99);
                numCats++;

            //#6
            cats[numCats] = new Cat("Gimpy" , 14.3, 10, 29.99);
            numCats++;

            //#7
            System.out.println("\n7. The updated list is: ");
            System.out.println("Name\tWeight\tAge\tCost");
            for (Cat cat : cats) {
                if (cat != null) printCat(cat);
            }

            //#8
            Cat temp = cats[2];
            cats[2] = new Cat("Suger", 23.6, 7, 33.25);
            cats[numCats] = temp;
            numCats++;

            //#9
            Cat tempCat = cats[1];
            cats[1] = cats[3];
            cats[3] = tempCat;

            //#10









        } catch (IOException e) {
            System.out.println("can't find data file!");
        }
    }
}
