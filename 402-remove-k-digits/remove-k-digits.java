class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack=new Stack<>();
        for(char ch:num.toCharArray()){
            while(!stack.empty() && k > 0 && stack.peek() > ch) {
                stack.pop();
                k--;
            }
            stack.push(ch);
        }
        while(k > 0) {
            stack.pop();
            k--;
        }
        StringBuilder ans = new StringBuilder();
        while(!stack.empty()) {
            ans.append(stack.pop());
        }
        ans.reverse();
        while(ans.length() > 1 && ans.charAt(0) == '0') {
            ans.deleteCharAt(0);
        }
        if(ans.length()==0){
            return "0";
        }
        return ans.toString();
    }
}
