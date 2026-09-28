class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        long ans = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i <= n; i++) {
            while (!stack.empty() && (i == n || arr[stack.peek()] >= arr[i])) {
                int mid = stack.pop();
                int left = stack.empty() ? mid + 1 : mid - stack.peek();
                int right = i - mid;
                ans += (long) arr[mid] * left * right;
            }
            stack.push(i);
        }
        return (int)(ans % 1000000007);
    }
}