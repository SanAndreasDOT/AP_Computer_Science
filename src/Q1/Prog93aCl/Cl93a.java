package Q1.Prog93aCl;

public class Cl93a { //Rectangle (Helper Class)
    private int kwatts;
    private double surcharge;
    private double baserate;
    private double citytax;
    private double total;
    private double latetotal;
    // Input Section (Constructor)
    public Cl93a (int kw) {
        // Set up Private data
        kwatts = kw;
        surcharge = 0.03;
        baserate = 0.0475;
        citytax = 0.1;
        total = 0;
        latetotal = 0.04;
    }

    // Calculation Section (Mutators/Setters)
    public void calc(){
        total = Math.round(kwatts * 0.0475);



    }

    public String toString() {
        return "Your Total is: " + total;
    }
}
