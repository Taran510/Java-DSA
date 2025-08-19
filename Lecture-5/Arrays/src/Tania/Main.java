package Tania;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Q: store a roll number
        int a = 19;

        // Q: store a person's name
        String name = "Tania";

        // Q: store 5 roll numbers
        int rno1 = 23;
        int rno2 = 55;
        int rno3 = 96;
        int rno4 = 78;
        int rno5 = 25;

        // Syntax
        // datatype[] variable_name = new datatype[size];
//        int[] rnos = new int[5];
//        // or directly
//        int[] rnos2 = {12, 25, 36, 47, 50};

        int[] ros; // Declaration of Arrays. row is getting defined in the stack.
        ros = new int[5]; // Initialization: actually here object is being created in the memory(heap).

//        System.out.println(ros[1]);
//        System.out.println(ros);

//
//        int[] ros; // Compile-time
//        ros = new int[5]; // Run-time or Dynamic Memory Allocation = Creating the object in heap memory

//        1. Array objects are in heap.
//        2. Heap objects are not continuous.
//        3. Dynamic Memory Allocation
//        Heap area is not continuous and we know that array objects are also in the heap area.
//        Hence, Array objects in Java may not be continuous.-> It depends on JVM.

        // Index :- Index are just numbers that basically means it's like the position of array which starts from zero.
        // New :- New Keyword is used to create an object.

        // String Array

        String arr[] = new String[5];
        System.out.println(arr[0]); // Output :- null. null is special literal. It can compared with none in Python.


        for (String ele : arr){
            System.out.println(ele);
        }
        // Primitives are stored in the stack memory only but all the other objectslike string type, array type, your own type,
        // hashmap, all these objects or the classes thar we'll be making they are stored in the heap memory
    }
}
