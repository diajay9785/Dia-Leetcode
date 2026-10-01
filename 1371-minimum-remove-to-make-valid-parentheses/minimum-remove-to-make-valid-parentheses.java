class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder ans=new StringBuilder();
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='('){
                stack.push(ch);
                ans.append(ch);
            }
            else if(ch==')'){
                if(!stack.empty()){
                    stack.pop();
                    ans.append(ch);
                }
            }
            else{
                ans.append(ch);
            }
        }
        int i=ans.length()-1;
        while(!stack.empty()){
            while(ans.charAt(i)!='('){
                i--;
            }
            ans.deleteCharAt(i);
            stack.pop();
            i--;
        }
        return ans.toString();
    }
}