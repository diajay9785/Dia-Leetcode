class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (a[0] != b[0]) {
                return a[0] - b[0];
            }
            return a[1] - b[1];
        });
        for(int i=0;i<nums.length;i++){
            pq.offer(new int[]{nums[i],i});
            if(pq.size()>k){
                pq.poll();
            }
        }
        int selected[][]=new int[k][2];
        for(int i=0;i<k;i++){
            selected[i]=pq.poll();
        }
        Arrays.sort(selected,(a,b)->a[1]-b[1]);
        int[] result=new int[k];
        for(int i=0;i<k;i++){
            result[i]=selected[i][0];
        }
        return result;
    }
}