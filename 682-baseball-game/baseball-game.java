class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack=new Stack<>();
        for(String ops:operations){
            if(ops.equals("C")){
                stack.pop();
            }
            else if(ops.equals("D")){
                int num=stack.peek()*2;
                stack.push(num);
            }
            else if(ops.equals("+")) {
                int b=stack.pop();
                int a=stack.pop();
                int num=a+b;
                stack.push(a);
                stack.push(b);
                stack.push(num);
            }
            else{
                stack.push(Integer.parseInt(ops));
            }
        }
        int sum=0;
        while(!stack.empty()) {
            sum += stack.pop();
        }
        return sum;
    }
}