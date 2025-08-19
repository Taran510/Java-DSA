package Tania;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Array of Primitives

        int arr[] = new int[5];
        arr[0] = 23;
        arr[1] = 16;
        arr[2] = 78;
        arr[3] = 21;
        arr[4] = 69;
//        arr[5] = 71;
//        arr[6] = 25;
//        arr[7] = 83;
//        arr[8] = 92;
//        arr[9] = 25;
        // Internally stored as: [23, 16, 78, 21, 69, 71, 25, 83, 92, 25]
//        System.out.println(arr[4]);

        // input using for loops
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//
//        System.out.println(Arrays.toString(arr));

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

//       for (int num : arr){ // for every element in array, print the element
//           System.out.print(num + " "); // here num represents element of the array.
//       }

//        System.out.println(arr[5]);  // Array Index Out Of Bounds Exception

        // Array of Objects

        String[] str = new String[5];

        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));

        // Modify
        str[1] = "Tania";

        System.out.println(Arrays.toString(str));
    }
}
