int searchInsert(int* nums, int numsSize, int target) {
    int p=0;
    int q=1;
    if(target<=nums[0]){
            return 0;
        }
    while(p<numsSize && q<numsSize){
        if(target>nums[p] && target<=nums[q]){
            return p+1;
        }
       p++;
       q++;
    }
    return numsSize;
}