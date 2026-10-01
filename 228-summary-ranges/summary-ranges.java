class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(i < nums.length) {
            int start = nums[i];

            while(i + 1 < nums.length && nums[i + 1] == nums[i] + 1) {
                i++;
            }
            if(start == nums[i]) {
                sb.append(start);
            } else {
                sb.append(start).append("->").append(nums[i]);
            }
            ans.add(sb.toString());
            sb.setLength(0);
            i++;
        }
        return ans;
    }
}