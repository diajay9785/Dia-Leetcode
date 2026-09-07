class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] ans = new int[n];
        int[] index = new int[primes.length];

        ans[0] = 1;

        for (int i = 1; i < n; i++) {
            long min = Long.MAX_VALUE;

            for (int j = 0; j < primes.length; j++) {
                min = Math.min(min, (long) primes[j] * ans[index[j]]);
            }

            ans[i] = (int) min;

            for (int j = 0; j < primes.length; j++) {
                if ((long) primes[j] * ans[index[j]] == min) {
                    index[j]++;
                }
            }
        }
        return ans[n - 1];
    }
}