package Q2;

public class ArrayTest {
    public static void main(String[] args) {

        int[] nums = new int[100];
        for (int lcv = 0; lcv < 100; lcv++)
            nums[lcv]= lcv+1;



        for (int lcv = 0; lcv < 100; lcv++)
            System.out.print(nums[lcv]+ " ");
        System.out.println();


        char[] hello = "Hello, Warld!".toCharArray();
        //for each loop :for (var x in array) {}
        for(char x : hello) System.out.print(x);
        System.out.println();




        String[] words= {"Hello","wprld","cool","wowser","beans"};
        // for (String tepm : word_ {Do stuff}
        for (int lcv = 0; lcv < words.length;lcv++)
            System.out.println(words[lcv]);
    }
}
