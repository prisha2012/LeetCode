class Solution {
    public int countPrimes(int n) {
        if (n < 3) return 0; // No primes below 2

        // Only consider odd numbers. Index 0 => number 3, index 1 => number 5, etc.
        boolean[] isPrime = new boolean[n / 2];
        Arrays.fill(isPrime, true);

        int limit = (int) Math.sqrt(n);
        for (int i = 3; i <= limit; i += 2) {
            if (isPrime[i / 2]) {
                for (int j = i * i; j < n; j += 2 * i) {
                    isPrime[j / 2] = false;
                }
            }
        }

        // Start count with 1 for prime number 2
        int count = 1;
        for (int i = 1; i < isPrime.length; i++) {
            if (isPrime[i]) count++;
        }

        return count;
    }
}
