class Solution {
    public long maxAlternatingSum(int[] nums) {
        ArrayList<Long> sq = new ArrayList<>();
        long sum = 0;
        for (int num : nums) {
            sq.add((long) num * num);
        }
        sq.sort(null);
        while (sq.size() > 1) {
            long first = sq.get(0);
            long last = sq.get(sq.size() - 1);
            sum += last - first;
            sq.remove(sq.size() - 1);
            sq.remove(0);
        }
        if (!sq.isEmpty()) {
            sum += sq.get(0);
        }
        return sum;
    }
}