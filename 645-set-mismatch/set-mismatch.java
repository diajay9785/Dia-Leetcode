class Solution {
    public int[] findErrorNums(int[] nums) {
        int sum=0;
        int actualsum=0;
        int duplicate=-1;
        int num=-1;
        HashSet<Integer> set=new HashSet<>();
        for(int i=1;i<=nums.length;i++){
            sum+=i;
        }
        for(int i=0;i<nums.length;i++){
            actualsum+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                duplicate=nums[i];
                break;
            }
            set.add(nums[i]);
        }
        num=sum-actualsum+duplicate;
        return new int[]{duplicate,num};
    }
}