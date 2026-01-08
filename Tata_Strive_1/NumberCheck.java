import java.util.Scanner;

public class NumberCheck {

    // Palindrome check
    static boolean isPalindrome(int num) {
        int original = num;
        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        return original == reverse;
    }

    // Krishnamurthy check
    static boolean isKrishnamurthy(int num) {
        int original = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }
        return sum == original;
    }

    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Armstrong check
    static boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;
        int digits = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        return sum == original;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Palindrome Number: " + isPalindrome(num));
        System.out.println("Krishnamurthy Number: " + isKrishnamurthy(num));
        System.out.println("Armstrong Number: " + isArmstrong(num));

        sc.close();
    }
}

