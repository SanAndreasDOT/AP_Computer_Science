package Q1.Prog76aCl;

public class Cl76a {
    private int dislike;
    private int sum;
    private int boom;




    public Cl76a (int dlike) {
        dislike = dlike;
    }





    public void calc() {
        sum = dislike * 9;
        boom = sum * 12345679;
    }

    public String toString() { return dislike + " * 9 = " + sum + "\n" + dislike + " and " + sum + " * 12345679 " + "" +
            "\n" + " = " + boom;}
}


