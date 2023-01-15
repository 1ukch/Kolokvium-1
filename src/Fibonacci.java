public class Fibonacci {
    public static int nthFibonacci(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int prev1 = 0;
        int prev2 = 1;
        for (int i = 2; i <= n; i++) {
            int current = prev1 + prev2;
            prev1 = prev2;
            prev2 = current;
        }
        return prev2;
    }

    public static int[] firstNFibonacci(int n) {
        int[] result = new int[n];
        if (n >= 1) {
            result[0] = 0;
        }
        if (n >= 2) {
            result[1] = 1;
        }
        for (int i = 2; i < n; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }
        return result;
    }
}