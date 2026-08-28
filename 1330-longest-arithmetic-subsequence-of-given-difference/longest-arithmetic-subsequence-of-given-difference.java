class Solution {
    public int longestSubsequence(int[] arr, int difference) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int maxLength=0;
        for(int num:arr){
            int currentLength=map.getOrDefault(num-difference,0)+1;
            map.put(num,currentLength);
            maxLength=Math.max(currentLength,maxLength);
        }
        return maxLength;
    }
}