package Q1;

public class LP_5_14_DONE_ {
    public static void main(String[] args) {
        int dice1 = (int)(Math.random() * (6 - 1) + 1);
        int dice2 = (int)(Math.random() * (6 - 1) + 1);
        int totaldice = dice1 + dice2;

        System.out.println("Dice 1\tDice 2\tTotal");
        System.out.println(dice1 + "\t\t" + dice2 + "\t\t" + totaldice);

    }
}
// link to doc: https://docs.google.com/document/d/1SqOzJPkdo9C3bmi8vTffGUO5ycCB_hV1/edit
/*
Dice 1	Dice 2	Total
2		4		6

Process finished with exit code 0

Dice 1	Dice 2	Total
2		1		3

Process finished with exit code 0

 */