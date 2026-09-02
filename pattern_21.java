class Solution {
    public void pattern22(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Print a star if it is on any of the four borders
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    // Print matching empty space (2 spaces to align with "* ")
                    System.out.print("  ");
                }
            }
            // Move to the next line after completing a row
            System.out.println();
        }
    }
}
