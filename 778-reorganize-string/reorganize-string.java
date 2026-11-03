import java.util.*;
class Solution {
    public String reorganizeString(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        PriorityQueue<Character> pq = new PriorityQueue<>((a, b) ->
            map.get(b) - map.get(a)
        );
        for (char c : map.keySet()) {
            if (map.get(c) > (s.length() + 1) / 2) {
                return "";
            }
            pq.offer(c);
        }
        StringBuilder result = new StringBuilder();
        while (pq.size() >= 2) {
            char first = pq.poll();
            char second = pq.poll();
            result.append(first);
            result.append(second);
            map.put(first, map.get(first) - 1);
            map.put(second, map.get(second) - 1);
            if (map.get(first) > 0) {
                pq.offer(first);
            }
            if (map.get(second) > 0) {
                pq.offer(second);
            }
        }
        if (!pq.isEmpty()) {
            result.append(pq.poll());
        }
        return result.toString();
    }
}