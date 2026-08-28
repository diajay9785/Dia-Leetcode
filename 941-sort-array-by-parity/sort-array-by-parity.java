class Solution {
    public int[] sortArrayByParity(int[] nums) {
      ArrayList<Integer> listeven=new ArrayList<>();
      ArrayList<Integer> listodd=new ArrayList<>();
      for(int i=0;i<nums.length;i++){
        if(nums[i]%2==0) listeven.add(nums[i]);
        else listodd.add(nums[i]);
      }
      ArrayList<Integer> combined=new ArrayList<>(listeven);
      combined.addAll(listodd);
      int[] result = new int[combined.size()];
      for (int i = 0; i < combined.size(); i++) {
        result[i] = combined.get(i);
    }
       return result;
    }
}