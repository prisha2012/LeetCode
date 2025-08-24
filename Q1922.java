class Solution {
    static final int MOD = 1_000_000_007;

    public int countGoodNumbers(long n) {
        long evens = (n + 1) / 2;
        long odds = n / 2;
        return (int)((modPow(5, evens) * modPow(4, odds)) % MOD);
    }

    private long modPow(long x, long exp) {
        long result = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) result = (result * x) % MOD;
            x = (x * x) % MOD;
            exp >>= 1;
        }
        return result;
    }
}

public class Q1922 {
    
}
