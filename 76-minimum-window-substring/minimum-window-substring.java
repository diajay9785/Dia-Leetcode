class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> need=new HashMap<>();
        HashMap<Character, Integer> window=new HashMap<>();
        for(char ch:t.toCharArray()){
            need.put(ch,need.getOrDefault(ch,0)+1);
        }
        int required = need.size();
        int formed = 0;
        int left = 0;
        int minLength = Integer.MAX_VALUE;
        int start = 0;
         for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            if (need.containsKey(ch)) {
                window.put(ch, window.getOrDefault(ch, 0) + 1);
                if (window.get(ch).intValue() == need.get(ch).intValue()) {
                    formed++;
                }
            }
            while (formed == required) {
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    start = left;
                }
                char leftChar = s.charAt(left);
                if (need.containsKey(leftChar)) {
                    window.put(leftChar, window.get(leftChar) - 1);
                    if (window.get(leftChar) < need.get(leftChar)) {
                        formed--;
                    }
                }
                left++;
            }
        }
        if (minLength == Integer.MAX_VALUE) {
            return "";
        }
        return s.substring(start, start + minLength);
    }
}