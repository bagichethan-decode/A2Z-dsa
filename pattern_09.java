public class pattern_9 {
    class Solution {
        public void pattern9(int n) {
            // Top Half (Erect Pyramid)
            for (int i = 0; i < n; i++) {
                // Spaces
                for (int j = 0; j < n - i - 1; j++) {
                    System.out.print(" ");
                }
                // Stars
                for (int j = 0; j < 2 * i + 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            // Bottom Half (Inverted Pyramid)
            for (int i = 0; i < n; i++) {
                // Spaces
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                // Stars
                for (int j = 0; j < 2 * n - 2 * i - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
