import java.util.Scanner;

public class hourglass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        // Upper inverted pyramid
        for (int i = 0; i < n; i++) {

            // Leading spaces
            for (int space = 0; space < i; space++) {
                System.out.print(" ");
            }

            // Stars
            for (int star = 0; star < (2 * (n - i) - 1); star++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower pyramid
        for (int i = 1; i < n; i++) {

            // Leading spaces
            for (int space = 0; space < n - i - 1; space++) {
                System.out.print(" ");
            }

            // Stars
            for (int star = 0; star < (2 * i + 1); star++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}
