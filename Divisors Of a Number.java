import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DivisorsOfANumber {
    public static int[] divisors(int n) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
                if (i != n / i) {
                    list.add(n / i);
                }
            }
        }

        Collections.sort(list);

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 6;
        int[] ans = divisors(n);
        for (int val : ans) {
            System.out.print(val + " ");
        }
    }
}
