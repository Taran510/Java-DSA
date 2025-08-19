package tania;

public class Main {
    public static void main(String[] args) {
        /*
            Syntax of if Statement :
            if (bollean Expression T or F){
                // body
            } else {
                // do this
            }
         */
        int salary = 25400;
//        if (salary > 10000){
//            salary = salary + 2000;
//        } else {
//            salary = salary + 1000;
//        }
        if (salary > 10000){
            salary = salary + 2000;
        } else if (salary > 20000) {
            salary += 3000;   // salary = salary + 3000;
        } else {
            salary += 1000;
        }

        System.out.println("The New salary is : "+ salary);
    }
}