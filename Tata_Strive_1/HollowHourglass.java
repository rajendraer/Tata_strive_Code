import java.util.Scanner;

public class HollowHourglass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size (odd number recommended): ");
        int n = sc.nextInt();

        // Upper half
        for (int i = 0; i < n; i++) {

            // Leading spaces
            for (int s = 0; s < i; s++) {
                System.out.print(" ");
            }

            // Stars
            for (int j = 0; j < n - i; j++) {
                if (i == 0 || j == 0 || j == n - i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // Lower half
        for (int i = n - 2; i >= 0; i--) {

            // Leading spaces
            for (int s = 0; s < i; s++) {
                System.out.print(" ");
            }

            // Stars
            for (int j = 0; j < n - i; j++) {
                if (i == 0 || j == 0 || j == n - i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
