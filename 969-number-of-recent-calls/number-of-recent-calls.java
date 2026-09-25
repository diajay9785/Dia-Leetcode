class RecentCounter {
    Stack<Integer> stack=new Stack<>();
    public RecentCounter() { 
    }
    
    public int ping(int t) {
       stack.push(t);
       while(!stack.empty() && stack.get(0) < t - 3000) {
            stack.remove(0);
        }
       return stack.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */