class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
    int n=temperatures.length;
    Stack<Integer> stack=new Stack<>();
     int ans[]=new int[n];
     for(int i=0;i<n;i++){
        while(!stack.empty() && temperatures[i]>temperatures[stack.peek()]){
            int previndex=stack.pop();
            ans[previndex]=i-previndex;
        }
        stack.push(i);
     }
     return ans;
    }
}