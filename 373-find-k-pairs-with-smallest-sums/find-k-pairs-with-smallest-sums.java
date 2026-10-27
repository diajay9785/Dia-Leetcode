import java.util.*;

class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(a[0] + a[1], b[0] + b[1])
        );

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < Math.min(nums1.length, k); i++) {
            pq.offer(new int[]{nums1[i], nums2[0], 0});
        }

        while (k > 0 && !pq.isEmpty()) {
            int[] pair = pq.poll();

            result.add(Arrays.asList(pair[0], pair[1]));

            int next = pair[2] + 1;

            if (next < nums2.length) {
                pq.offer(new int[]{pair[0], nums2[next], next});
            }

            k--;
        }

        return result;
    }
}