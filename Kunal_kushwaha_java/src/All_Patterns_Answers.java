public class All_Patterns_Answers {
    public static void main(String[] args) {
        pattern1(5);
        pattern2(5);
        pattern3(5);
        pattern4(5);
        pattern5(5);
        pattern6(5);
        pattern28(5);
        pattern30(5);
        pattern17(5);
    }

        static void pattern1(int n) {
            for (int i = 1; i <= n; i++) {
                //for every row,run the col
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                //when one row is printed,we need to add a new line
                System.out.println();
            }
        }
    static void pattern2(int n){
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
    static void pattern3(int n) {
        for (int i = n; i >= 1; i--) {        // rows decreasing
            for (int j = 1; j <= i; j++) {    // stars in each row
                System.out.print("* ");
            }
            System.out.println();             // new line after each row
        }
    }
    static void pattern4(int n){
        for (int i = 1; i <= n; i++) {
            for(int j=1; j<= i;j++){
                System.out.print( j + " ");
            }
            System.out.println();

        }
    }

    static void pattern5(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {

            // stars count: 1→n then n-1→1
            int stars = (i <= n) ? i : (2 * n - i);

            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
    static void pattern6(int n) {
        for (int i = 1; i <= 2 * n; i++) {

            // stars count: 1→n then n-1→1
            int stars = (i <= n) ? i : (2 * n - i);

            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

        static void  pattern28(int n){

            // Upper part (including middle row)
            for (int i = 1; i <= n; i++) {

                // spaces
                for (int s = 1; s <= n - i; s++) {
                    System.out.print(" ");
                }

                // stars
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }

                System.out.println();
            }

            // Lower part
            for (int i = n - 1; i >= 1; i--) {

                // spaces
                for (int s = 1; s <= n - i; s++) {
                    System.out.print(" ");
                }

                // stars
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }

                System.out.println();
            }
        }
        
        static void pattern30(int n){
            for (int row = 1; row <= n; row++) {
                for (int space = 0; space < n-row; space++) {
                    System.out.print(" ");
                }
                for (int col = row; col >= 1 ; col--) {
                    System.out.print(col );

                }
                for (int col = 2; col <= row ; col++) {
                    System.out.print(col );
                }
                System.out.println();
            }

    }
    static void pattern17(int n){
        for (int row = 1; row <= 2*n; row++) {
            int c = row > n ? 2 * n - row: row;
            for (int space = 0; space < n-c; space++) {
                System.out.print(" ");
            }
            for (int col = c; col >= 1 ; col--) {
                System.out.print(col );

            }
            for (int col = 2; col <= c ; col++) {
                System.out.print(col );
            }
            System.out.println();
        }

    }

}






