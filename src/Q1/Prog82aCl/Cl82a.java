package Q1.Prog82aCl;

public class Cl82a {
    private int yourSpeed;
    private int Speedlimit;
    private int Ticket = 20;
    private int tooFast;



    //Input
    public Cl82a (int ySpeed, int lSpeed){
        yourSpeed = ySpeed;
        Speedlimit = lSpeed;


    }

    public void calc() {

        tooFast = yourSpeed - Speedlimit;
        Ticket = Ticket + tooFast * 5;
    }
    public String toString() { return "The Speed Limit was: " + Speedlimit + "Your Speed Was: " + yourSpeed + "Your Fine is $" + Ticket;}
}
