class Solution {
    public void pattern19(int n) {
        // Upper Half
        for (int i = 0; i < n; i++) {
            // Left stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            // Spaces
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }
            // Right stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower Half
        for (int i = 0; i < n; i++) {
            // Left stars
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            // Spaces
            for (int j = 0; j < 2 * (n - i - 1); j++) {
                System.out.print(" ");
            }
            // Right stars
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
