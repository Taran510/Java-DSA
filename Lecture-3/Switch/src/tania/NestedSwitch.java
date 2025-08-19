import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String dept = in.next();

        switch (empID){
            case 1:
                System.out.println("Tania");
                break;
            case 2:
                System.out.println("Taran");
                break;
            case 3: {
                System.out.println("Emp Number 3");
                switch (dept) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No Department Entered");
                }
                break;
            }
            default:
                System.out.println("Enter correct EmpID");
        }
    }
}
