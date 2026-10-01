class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder ans=new StringBuilder();
        Stack<Character> stack=new Stack<>();
        while(columnNumber>0){
            int num=columnNumber-1;
            int rem=num%26;
            stack.push((char)('A' + rem));
            columnNumber=num/26;
        }
        while(!stack.empty()){
            ans.append(stack.pop());
        }
        return ans.toString();
    }
}