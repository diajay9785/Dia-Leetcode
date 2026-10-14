int pivotIndex(int* nums, int numsSize) {
    int n=numsSize;
    int total=0;
        for(int i=0;i<n;i++){
            total+=nums[i];
        }
        int left=0;
        for(int i=0;i<n;i++){
            int right=total-left-nums[i];
        if(left==right)
        return i;
        left+=nums[i];
        }
        return -1;
}