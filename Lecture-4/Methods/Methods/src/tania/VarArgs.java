package tania;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//        fun(2, 3, 5, 45, 85, 56, 78);
//        multiple(30, 68, "Tania", "Taran");

//        demo(2, 3, 4);
        demo("Tania", "Taran");
//        demo(); // Ambiguity
    }

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...v){

    }

    static void fun( int ...v) {
        System.out.println(Arrays.toString(v));
    }
}

 /*
    kal
    koal
    ,lako
 */