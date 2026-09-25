class Solution {
    public String simplifyPath(String path) {
      String[] parts = path.split("/");
      Stack<String> stack=new Stack<>();
      String current="";
      for(int i = 0; i < parts.length; i++) {
            if(parts[i].equals("") || parts[i].equals(".")) {
                continue;
            }
            else if(parts[i].equals("..")) {
                if(!stack.empty()) {
                    stack.pop();
                }
            }
            else {
                stack.push(parts[i]);
            }
    }
    StringBuilder ans = new StringBuilder();
        for(String str : stack) {
            ans.append("/").append(str);
        }
        if(stack.empty()) {
            return "/";
        }
        return ans.toString();
    }
}