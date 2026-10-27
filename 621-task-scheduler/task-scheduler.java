import java.util.*;

class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for (char task : tasks) {
            freq[task - 'A']++;
        }
        PriorityQueue<Integer> pq =
            new PriorityQueue<>((a, b) -> b - a);
        for (int f : freq) {
            if (f > 0) {
                pq.offer(f);
            }
        }
        int time = 0;
        while (!pq.isEmpty()) {
            int cycle = n + 1;
            List<Integer> remaining = new ArrayList<>();
            while (cycle > 0 && !pq.isEmpty()) {
                int count = pq.poll() - 1;
                if (count > 0) {
                    remaining.add(count);
                }
                time++;
                cycle--;
            }
            for (int count : remaining) {
                pq.offer(count);
            }
            if (!pq.isEmpty()) {
                time += cycle;
            }
        }
        return time;
    }
}