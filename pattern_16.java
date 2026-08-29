class Solution {
    public void pattern16(int n) {
        for (int i = 0; i < n; i++) {
            // Character for the current row
            char ch = (char) ('A' + i);
            
            // Print the character (i + 1) times
            for (int j = 0; j <= i; j++) {
                System.out.print(ch);
            }
            // Move to the next line
            System.out.println();
        }
    }
}
