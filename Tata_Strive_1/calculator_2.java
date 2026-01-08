import java.util.Scanner;

public class calculator_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Choose operation:");
        System.out.println("1 for Addition");
        System.out.println("2 for Subtraction");
        System.out.println("3 for Multiplication");
        System.out.println("4 for Division");

        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Result = " + (num1 + num2));
        }
        else if (choice == 2) {
            System.out.println("Result = " + (num1 - num2));
        }
        else if (choice == 3) {
            System.out.println("Result = " + (num1 * num2));
        }
        else if (choice == 4) {
            if (num2 != 0) {
                System.out.println("Result = " + (num1 / num2));
            } else {
                System.out.println("Cannot divide by zero");
            }
        }
        else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}
