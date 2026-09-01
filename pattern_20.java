class Solution {
    public void pattern20(int n) {
        // Initial space count for the first row
        int spaces = 2 * n - 2;

        for (int i = 1; i <= 2 * n - 1; i++) {
            // Determine number of stars for the current row
            int stars = (i <= n) ? i : (2 * n - i);

            // 1. Print left stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            // 2. Print middle spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

           
            System.out.println();

            // Adjust space count for next iteration
            if (i < n) {
                spaces -= 2;
            } else {
                spaces += 2;
            }
        }
    }
}
