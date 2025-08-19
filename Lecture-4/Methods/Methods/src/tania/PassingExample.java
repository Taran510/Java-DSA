package tania;

public class PassingExample {
    public static void main(String[] args) {
        String name = "Tania";
        greet(name);
    }

    //pass by value of that reference variable

    static void greet(String naam) {
        System.out.println(naam);
    }
}
