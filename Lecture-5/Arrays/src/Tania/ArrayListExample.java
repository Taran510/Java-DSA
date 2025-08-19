package Tania;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Syntax of Array List
        ArrayList<Integer> list = new ArrayList<>(5);
//        list.add(12);
//        list.add(25);
//        list.add(36);
//        list.add(34);
//        list.add(54);
//        list.add(85);
//        list.add(66);
//        list.add(78);
//        list.add(63);
//        list.add(75);
//        list.add(45);
//        list.add(63);
//        list.add(72);
//        list.add(13);
//        list.add(52);
//        list.add(17);
//        list.add(96);
//        list.add(33);

//        System.out.println(list.contains(54));
//        System.out.println(list.contains(102));
//        System.out.println(list);
//        list.set(0, 99);
//
//        list.remove(2);
//        System.out.println(list);

        // input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));// pass index here, list[index] synatx will not work here
        }

        System.out.println(list);

        // ArrayList
        // 1. Size is fixed internally.
        // 2. Say Arraylist fills by some amount
        // => It will create a new Arraylist of say double the size
        // => Old elements are copied in new one
        // => Old one is deleted.

    }
}
