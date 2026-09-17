class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
        int[] minLen = new int[n];
        Arrays.fill(minLen, Integer.MAX_VALUE);
        int left = 0;
        int sum = 0;
        int ans = Integer.MAX_VALUE;
        int best = Integer.MAX_VALUE;
        for (int right = 0; right < n; right++) {
            sum += arr[right];
            while (sum > target) {
                sum -= arr[left];
                left++;
            }
            if (sum == target) {
                int length = right - left + 1;
                if (left > 0 && minLen[left - 1] != Integer.MAX_VALUE) {
                    ans = Math.min(ans, length + minLen[left - 1]);
                }
                best = Math.min(best, length);
            }
            minLen[right] = best;
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}