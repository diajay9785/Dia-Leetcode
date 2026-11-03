class Solution {
    public int minMoves(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);
        }
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=max){
                count+=max-nums[i];
            }
        }
        return count;
    }
}