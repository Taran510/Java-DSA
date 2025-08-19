package tania;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 52;
        String name = "Tania";
        // Block scope

        {
//             int a = 85; // already initialised outside the block in the same method, hence you cannot initialise again.
                a = 100; // reassign the original ref variable to some other value
            System.out.println(a);
                int c = 96;
                name = "TANU";
            System.out.println(name);
             // Values initialized in this block, will remain in block
        }
        int c = 65;
        System.out.println(a);
        System.out.println(name);
        System.out.println(c); // cannot use outside the block.

        // Scoping in for loops
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            int num = 80;
            a = 10;
        }
        System.out.println(a);
    }
    static void random (int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
