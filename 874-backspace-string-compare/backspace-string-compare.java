class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1=new Stack<>();
        Stack<Character> stack2=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='#' && !stack1.empty()){
                stack1.pop();
            }
            else if(ch=='#' && stack1.empty()){
                continue;
            }
            else{
                stack1.push(ch);
            }
        }
        for(char ch:t.toCharArray()){
            if(ch=='#' && !stack2.empty()){
                stack2.pop();
            }
            else if(ch=='#' && stack2.empty()){
                continue;
            }
            else{
                stack2.push(ch);
            }
        }
        if(stack1.size()!=stack2.size()){
            return false;
        }
        while(!stack1.empty() && !stack2.empty()){
            if(stack1.pop().equals(stack2.pop())){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
}