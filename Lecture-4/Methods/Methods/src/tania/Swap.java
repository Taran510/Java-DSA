package tania;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

//        int temp = a;
//        a = b;
//        b = temp;

        int ans = SwapNumbers(a, b);
        System.out.println(a + " " + b);

        String name = "Tania";
        changeName(name);
        System.out.println(name);
    }

    static void changeName(String naam) {
        naam = "Taran"; // Creating a new object , Strings are immutable
    }

    static int SwapNumbers (int num1, int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
        return 0;

        // this change will only be valid in this functions scope only.
    }
}
