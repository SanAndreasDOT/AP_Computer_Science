package Q1.Prog93aCl;

import static java.lang.Math.round;

public class Cl93a { //Rectangle (Helper Class)
    private final int kwatts;
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



    }

    public String toString() {
        return "Your Total is: " + total;
    }
}