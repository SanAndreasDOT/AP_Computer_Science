//package Q2.ArrayListLab;
//
//import java.util.ArrayList;
//
//public class MyArrayListLab {
//    public static void main(String[] args) {
//        IntArrayList list = new IntArrayList();
//
//        System.out.println("Testing add() and get()...");
//        for (int i = 0; i < 10; i++)
//            list.add(i);
//
//        for (int i = 0; i < list.size(); i++)
//            System.out.println("list.get(" + i + ") = " + list.get(i));
//
//        System.out.println("\nTesting set()...");
//        for (int i = 0; i < list.size(); i++)
//            list.set(i, i * 2);
//
//        for (int i = 0; i < list.size(); i++)
//            System.out.println("list.get(" + i + ") = " + list.get(i));
//
//        System.out.println("\nTesting remove()...");
//        for (int i = 0; i < list.size(); i++)
//            if (i % 3 == 0) list.remove(i);
//
//        for (int i = 0; i < list.size(); i++)
//            System.out.println("list.get(" + i + ") = " + list.get(i));
//
//        System.out.println("\nTesting indexOf()...");
//        for (int i = 0; i < 10; i++) {
//            int num = (int) (Math.random() * 20);
//            System.out.println("list.indexOf(" + num + ") = " + list.indexOf(num));
//        }
//    }
//}
//
//
//
//
//// Link to doc: https://docs.google.com/document/d/104HDKAAQ0zmxrrvrnG82N2yaov91oNj9/edit