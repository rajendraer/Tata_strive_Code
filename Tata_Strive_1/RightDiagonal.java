import java.util.Scanner;

public class RightDiagonal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            // Print spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Print star
            System.out.println("*");
        }

        sc.close();
    }
}
