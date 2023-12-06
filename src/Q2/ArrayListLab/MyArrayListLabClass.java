package Q2.ArrayListLab;
import java.util.ArrayList;
public class MyArrayListLabClass {
    private int[] myArray;
    private int mySize;
    private int myCapacity;
    private final int DEFAULT_SIZE = 16;


    public IntArrayList() {
        myArray = new int[DEFAULT_SIZE];
        mySize = 0;
        myCapacity = DEFAULT_SIZE;
    }
    private void doubleCapacity() { //=> doubles the capacity of myArray
        myCapacity = myCapacity *= 2;
    }



    //Create a new temporary array of size myCapacity
    for (int lcv=0; lcv < mySize; lcv++){
        tempArray[lcv] = myArray[lcv] [0, mySize]
        myArray = tempArray;
    }
//    Use a for loop from 0 up to (not including) mySize


}
