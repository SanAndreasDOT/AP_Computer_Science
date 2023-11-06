package Q2.Prog213fArray;

public class Cl213f {
    private double myKwh;
    private double myCost;

    public Cl213f(double kwh) {
        myKwh = kwh;
        myCost = 0;
    }


    public void calc() {
        if (myKwh < 2000){
            myCost = myKwh * 0.07;

        }   else if (myKwh < 2000 & myKwh > 8000){
            myCost = myKwh * 0.05;
        } else {
            if (!(myKwh < 2000 & myKwh < 8000 & myKwh > 1000)) {
                return;
            }
            myCost = myKwh * 0.04;
        }
    }

        public String toString() {
        return "The number of ";
        }

}
/*
Program Description:  Utility rates vary with the amount of energy used per month.
One utility company sells electricity at a rate of
7 cents per kilowatt-hour for the first 2000 hours, 5 cents/kwh for the next 8000 hours,
and 4 cents for all kwh over 10000 hours.
 */