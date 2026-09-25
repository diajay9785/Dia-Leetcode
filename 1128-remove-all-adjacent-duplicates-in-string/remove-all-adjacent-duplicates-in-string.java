class Solution {
    public String removeDuplicates(String s) {
      Stack<Character> stack=new Stack<>();
      for(char ch:s.toCharArray()){
        if(!stack.empty() && stack.peek()==ch){
            stack.pop();
        }
        else{
            stack.push(ch);
        }
      } 
      StringBuilder ans = new StringBuilder();
      while(!stack.empty()){
        ans.append(stack.pop());
      } 
      return ans.reverse().toString();
    }
}