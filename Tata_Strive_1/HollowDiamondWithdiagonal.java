public class HollowDiamondWithdiagonal {
    public static void main(String[] args) {

        int row = 11;
        int mid = row / 2;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {

                int dist = Math.abs(i - mid) + Math.abs(j - mid);

                // Only inside diamond
                if (dist <= mid) {

                    // Diamond boundary
                    if (dist == mid) {
                        System.out.print("* ");
                    }
                    // Hollow diagonals (only diagonal lines)
                    else if (i == j || i + j == row - 1) {
                        System.out.print("* ");
                    }
                    else {
                        System.out.print("  ");
                    }

                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
