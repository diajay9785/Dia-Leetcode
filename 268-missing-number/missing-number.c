int missingNumber(int* nums, int numsSize) {
    int n=numsSize;
    int sum=0;
    int totalsum=0;
    totalsum=(n*(n+1))/2;
    for(int i=0;i<n;i++){
        sum+=nums[i];
    }
    return totalsum-sum;
}