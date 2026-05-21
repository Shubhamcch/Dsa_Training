import java.util.*;
class Role {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String role = sc.nextLine();

        switch(role) {

            case "admin":
                System.out.println("Full access");
                break;

            case "user":
                System.out.println("Limited access");
                break;

            case "student":
                System.out.println("Student access");
                break;

            case "guest":
                System.out.println("Guest access");
                break;

            default:
                System.out.println("Invalid operator");
        }
    }
}