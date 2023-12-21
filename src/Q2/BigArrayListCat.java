package Q2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class BigArrayListCat {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner (new File("Langdat/bigarraylist.dat"));
            int numCats = input.nextInt();
            input.nextLine();
            ArrayList<Cat> cats = new ArrayList<Cat>();

            for (int lcv=0; lcv < numCats; lcv++) {
                String name = input.nextLine();
                double weight = input.nextDouble();
                int age = input.nextInt();
                double cost = input.nextDouble();
                input.nextLine();
                cats.add(new Cat(name, weight, age, cost));
            }

            //1.
            System.out.println("1. All the cats: ");
            System.out.println("Name\tWeight\tAge\tCost");
            for (Cat cat : cats) {
                System.out.printf("%S\t%f\t%d\t%f\t", cat.getName(), cat.getWeight(), cat.getAge(), cat.getCost());
            }

            //2.
            System.out.println("\n2. the third cat is named " + cats.get(2).getName());

            //3.
            cats.get(cats.size()-1).setWeight(cats.get(cats.size()-1).getWeight()+10);
            System.out.println("\n3. The updated weight is: " + cats.get(cats.size()-1).getWeight());

            //4
            for (int lcv = 0; lcv < cats.size(); lcv++) {
                if (cats.get(lcv).getName().equals("Rascal")) {
                    cats.remove(lcv);
                }
            }

            //5.
            cats.add(1,new Cat("Angel", 3.6, 1, 25.99));

            //6.
            cats.add(new Cat("Gimpy", 14.3, 10, 29.99));

            //7.
            System.out.println("\n7. The updated list is: ");
            System.out.println("Name\tWeight\tAge\tCost");
            for (Cat cat : cats) {
                System.out.printf("%S\t%f\t%d\t%f\t", cat.getName(), cat.getWeight(), cat.getAge(), cat.getCost());
            }

            //8.
            Cat third = cats.get(2);
            cats.set(2, new Cat("Suger", 23.6, 7, 33.25));
            cats.add(third);

            //9.
            Cat temp = cats.get(1);
            cats.set(1, cats.get(3));
            cats.set(3, temp);

            //10.
            System.out.println("\n10. The current cat names are: ");
            for (Cat c : cats)
                System.out.print(c.getName() + "\t");
            System.out.println();

            //11.
            for (int lcv = 0; lcv < cats.size(); lcv++){
                if (cats.get(lcv).getCost() < 26) {
                    cats.remove(lcv);
                    lcv--;
                }
            }
            System.out.println("\n11. The cost of the remaining cats are: ");
            for (Cat c : cats)
                System.out.print(c.getCost() + " ");
            System.out.println();

            //12.
            System.out.println("\n12. The cats beeing put on a diet are: ");
            for (int lcv = 0; lcv < cats.size(); lcv++){
                Cat cat = cats.get(lcv);
                if (cat.getWeight() > 15)
                    System.out.print(cat.getName() + "\t");
            }
            System.out.println();

        } catch (IOException e) {
            System.out.println("can't find data file!");
        }
    }
}
/*
1. All the cats:
Name	Weight	Age	Cost
INKY	15.690000	2	35.790000	PANDA	14.300000	6	15.030000	RASCAL	21.100000	21	0.000000	BLACKY	13.990000	3	26.890000	TAFFY	24.500000	10	56.890000	TOBY	17.200000	10	37.570000
2. the third cat is named Rascal

3. The updated weight is: 27.2

7. The updated list is:
Name	Weight	Age	Cost
INKY	15.690000	2	35.790000	ANGEL	3.600000	1	25.990000	PANDA	14.300000	6	15.030000	BLACKY	13.990000	3	26.890000	TAFFY	24.500000	10	56.890000	TOBY	27.200000	10	37.570000	GIMPY	14.300000	10	29.990000
10. The current cat names are:
Inky	Blacky	Suger	Angel	Taffy	Toby	Gimpy	Panda

11. The cost of the remaining cats are:
35.79 26.89 33.25 56.89 37.57 29.99

12. The cats beeing put on a diet are:
Inky	Suger	Taffy	Toby

 */