class Solution {
    public void pattern18(int n) {
        for (int i = 0; i < n; i++) {
            // Starting character moves backwards as row index increases
            char startChar = (char) ('A' + n - 1 - i);
            char endChar = (char) ('A' + n - 1);
            
            for (char ch = startChar; ch <= endChar; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
