package Q1.Prog93aCl;

public class Cl93a {
    private int kwatts;
    private double surcharge;
    private double baserate;
    private double citytax;
    private double total;
    private double latetotal;

    public Cl93a (int kw) {
        kwatts = kw;
        surcharge = 0.03;
        baserate = 0.0475;
        citytax = 0.1;
        total = 0;
        latetotal = 0.04;
    }
    public void calc(){
        total = kwatts * 0.0475;


    }

    public String toString() {
        return "Your Total is: " + total;
    }
}
