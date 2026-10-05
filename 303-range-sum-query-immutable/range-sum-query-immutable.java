class NumArray {
    ArrayList<Integer> list1 = new ArrayList<>();
    public NumArray(int[] nums) {
        for(int num:nums){
            list1.add(num);
        }
    }
    
    public int sumRange(int left, int right) {
        int sum=0;
       for(int i=0;i<list1.size();i++){
        if(i>=left && i<=right){
            sum+=list1.get(i);
        }
       } 
       return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */