package Q2;

public class BigArray {
    public static void main(String[] args) {
        // Number 1
        int[] array = new int[19];
        for (int lcv = 0; lcv < array.length; lcv++) {
            array[lcv] = (int)(Math.random() * (91 - 20) + 20);
        }

        for (int lcv = 0; lcv < array.length; lcv++) {
            System.out.print(array[lcv] + " ");
        }
        System.out.println();

        // Number 2
        for (int temp : array) {
            System.out.print(temp + " ");
        }
        System.out.println();

        // Number 3
        System.out.println("The middle number is " + array[array.length / 2]);

        // Number 4
        double avg = array[0] + array[array.length -1] + array[array.length / 2];
        System.out.println("Average Of the first, middle, and last number is " + (avg/3));

        // Number 5
        int smallest = array[0];
        int largest = array[0];
        for (int num : array ) {
            if (num < smallest) smallest = num;
            if (num > largest) largest  = num;
        }
        System.out.println("The smallest number is " + smallest);
        System.out.println("The largest number is " + largest);

        // Number 6
        for (int lcv = 0; lcv < array.length; lcv++) {
            if (array[lcv] == smallest)
                array[lcv] = largest;
            else if (array[lcv] == largest)
                array[lcv] = smallest;
        }

        for (int x : array)
            System.out.print(x + " ");
        System.out.println();

        // Number 7
        int randNum = (int)(Math.random() * 10 +1);
        array[array.length / 2] = randNum;
        for (int x : array)
            System.out.print(x + " ");
        System.out.println();

        // Number 8
        for (int lcv = 0; lcv < array.length; lcv++)
            array[lcv] += 10;

        for (int x : array) System.out.print(x + " ");
        System.out.println();

        // Number 9
        int myThird = array[2];
        array[2] = 5;
        System.out.println("The number that was ousted is " + myThird);

        // Number 10
        for (int num : array) {
            if (num >= 50 && num<=59)
                    System.out.print(num + " ");
        }
        System.out.println();

        // Number 11
        for (int lcv = 0; lcv < array.length; lcv++) {
        if (array[lcv] % 4 == 0){
            System.out.print(array[lcv] + " ");
            }
        }
        System.out.println();

        // Number 12
        boolean sixty = false;

        for (int temp : array) {
            if (temp == 60) sixty = true;
        }
        System.out.println(" is 60 on the list " + sixty);

        // Number 13
        boolean same = true;
        for (int lcv=0; lcv < array.length; lcv++){
            if (array[lcv] != array[array.length - 1 - lcv])
                same = false;
        }
        System.out.println("is the array palindromic " + same);

        // Number 14
        double average = 0;
        for (int x : array)
            average += x;
        average /= array.length;

        int count = 0;
        for (int x : array)
            if (x > average ) count++;
        System.out.printf("There are %d numbers greater than the average\n", count);

        // Number 15
        int evens = 0;
        for (int num : array)
            if (num % 2 == 0) evens++;
        System.out.printf("There are %d even number\n", evens);

        // Number 16
        int[] array2 = new int[array.length];
        for (int lcv = 0; lcv < array.length; lcv++){
            array2[lcv] = array[array.length - 1 - lcv];
        }
        for (int n : array2)
        System.out.print(n + " ");
        System.out.println();

        // Number 17
        int[] shiftArr = circularShiftRight(array);
        for (int n : shiftArr)
            System.out.print(n + " ");
        System.out.println();

        // Number 18
        int sum = 0;
        for (int num : array) {
            int digitsum = 0;
            int temp = num;
            while (temp > 0){
                int n = temp % 10;
                temp /= 10;
                digitsum += n;
            }
            sum += digitsum;
        }
        System.out.println("Sum of all digits of all elements = " + sum);
    }

     public static int[] circularShiftRight(int[] arr) {
        int temp = arr[arr.length - 1];
        int[] shifted = new int[arr.length];
        for (int lcv = 1; lcv < arr.length; lcv++)
            shifted[lcv] = arr[lcv-1];
        shifted[0] = temp;
        return shifted;
     }
}
/*
90 82 58 86 65 53 32 71 47 26 86 78 64 45 63 55 21 67 33
90 82 58 86 65 53 32 71 47 26 86 78 64 45 63 55 21 67 33
The middle number is 26
Average Of the first, middle, and last number is 49.666666666666664
The smallest number is 21
The largest number is 90
21 82 58 86 65 53 32 71 47 26 86 78 64 45 63 55 90 67 33
21 82 58 86 65 53 32 71 47 2 86 78 64 45 63 55 90 67 33
31 92 68 96 75 63 42 81 57 12 96 88 74 55 73 65 100 77 43
The number that was ousted is 68
57 55
92 96 12 96 88 100
 is 60 on the list false
is the array palindromic false
There are 11 numbers greater than the average
There are 8 even number
43 77 100 65 73 55 74 88 96 12 57 81 42 63 75 96 5 92 31
43 31 92 5 96 75 63 42 81 57 12 96 88 74 55 73 65 100 77
Sum of all digits of all elements = 181

Process finished with exit code 0

 */
