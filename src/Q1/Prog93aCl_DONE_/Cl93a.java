package Q1.Prog93aCl_DONE_;

import static java.lang.Math.round;

public class Cl93a { //Rectangle (Helper Class)
    private double kwatts;
    private double total;

    // Input Section (Constructor)
    public Cl93a (int kw) {
        // Set up Private data
        kwatts = kw;
        double surcharge = 0.03;
        double baserate = 0.0475;
        double citytax = 0.1;
        double latetotal = 0.04;
        total = 0;
    }

    // Calculation Section (Mutators/Setters)
    public void calc(){
        total = round(kwatts * 0.0475);
        double surcharge = 0.03;
        double baserate = 0.0475;
        double citytax = 0.1;
        double latetotal = 0.04;
        double basetax;

        kwatts = (kwatts * baserate);
        basetax = kwatts + (kwatts * citytax);
        surcharge = basetax + (basetax * surcharge);
        total = basetax + (basetax * latetotal);




    }

    public String toString() {
        return "Your Total is: " + total;
    }
}
