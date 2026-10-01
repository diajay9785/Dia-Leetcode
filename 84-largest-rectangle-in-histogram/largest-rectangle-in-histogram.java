class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int max = 0;
        for(int i = 0; i <= heights.length; i++) {
            while(!stack.empty() && (i == heights.length || heights[stack.peek()] >= heights[i])) {
                int mid = stack.pop();
                int left = stack.empty() ? -1 : stack.peek();
                int right = i;
                int width = right - left - 1;
                int area = heights[mid] * width;

                max = Math.max(max, area);
            }
            stack.push(i);
        }
        return max;
    }
}