class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder ans = new StringBuilder(s);
        for(int i = 0; i < s.length(); i += 2 * k) {
            int left = i;
            int right = Math.min(i + k - 1, s.length() - 1);
            while(left < right) {
                char temp = ans.charAt(left);
                ans.setCharAt(left, ans.charAt(right));
                ans.setCharAt(right, temp);
                left++;
                right--;
            }
        }
        return ans.toString();
    }
}