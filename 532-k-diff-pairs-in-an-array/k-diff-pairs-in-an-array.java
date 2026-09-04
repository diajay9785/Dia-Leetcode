class Solution {
    public int findPairs(int[] nums, int k) {
        if (k == 0) {
            HashSet<Integer> seen = new HashSet<>();
            HashSet<Integer> duplicate = new HashSet<>();
            for (int num : nums) {
                if (seen.contains(num)) {
                    duplicate.add(num);
                }
                seen.add(num);
            }
            return duplicate.size();
        }
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int count = 0;
        for (int num : set) {
            if (set.contains(num + k)) {
                count++;
            }
        }
        return count;
    }
}