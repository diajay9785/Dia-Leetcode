class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < asteroids.length; i++) {
            int current = asteroids[i];
            while(!stack.empty() && stack.peek() > 0 && current < 0 &&
                  stack.peek() < Math.abs(current)) {
                stack.pop();
            }
            if(!stack.empty() && stack.peek() > 0 && current < 0) {
                if(stack.peek() == Math.abs(current)) {
                    stack.pop();
                }
            }
            else {
                stack.push(current);
            }
        }
        int[] ans = new int[stack.size()];
        for(int i = 0; i < stack.size(); i++) {
            ans[i] = stack.get(i);
        }
        return ans;
    }
}