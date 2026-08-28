class Solution {
    public int totalMoney(int n) {
        int start=1,end=7;
        int sum=0;
        while(n>0){
            for(int i=start;i<=end;i++){
                sum+=i;
                n--;
                if(n==0) break;
            }
            start++;
            end++;
        }
        return sum;
    }
}