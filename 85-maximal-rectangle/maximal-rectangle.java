class Solution {
    public int maximalRectangle(char[][] matrix) {
       int rows=matrix.length;
       int cols=matrix[0].length;
       int []heights=new int[cols];
       int max=0;
       for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            if(matrix[i][j]=='1'){
                heights[j]++;
            }
            else{
                heights[j]=0;
            }
        }
        Stack<Integer> stack=new Stack<>();
        for(int j=0;j<=cols;j++){
            while(!stack.empty() && (j == cols || heights[stack.peek()] >= heights[j])) {
                    int mid = stack.pop();
                    int left = stack.empty() ? -1 : stack.peek();
                    int right = j;
                    int width = right - left - 1;
                    int area = heights[mid] * width;
                    max = Math.max(max, area);
                }
                if(j < cols) {
                    stack.push(j);
                }
            }
        }
        return max;
    }
}