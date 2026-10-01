class Solution {
    public String makeGood(String s) {
    Stack<Character> stack=new Stack<>();
    StringBuilder ans=new StringBuilder();
    for(char ch : s.toCharArray()) {
            if(!stack.empty() &&
               Character.toLowerCase(stack.peek()) == Character.toLowerCase(ch) &&
               stack.peek() != ch) {
                stack.pop();
                ans.deleteCharAt(ans.length() - 1);
            }
            else {
                stack.push(ch);
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}