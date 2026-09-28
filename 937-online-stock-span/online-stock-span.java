class StockSpanner {
    Stack<int[]> stack = new Stack<>();
    public StockSpanner() {
        
    }
    public int next(int price) {
        int count = 1;
        while(!stack.empty() && stack.peek()[0] <= price){
            count += stack.pop()[1];
        }
        stack.push(new int[]{price, count});
        return count;
    }
}