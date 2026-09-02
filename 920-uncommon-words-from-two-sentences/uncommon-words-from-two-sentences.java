import java.util.*;

class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {

        HashMap<String, Integer> map = new HashMap<>();

        String[] str = s1.split("\\s+");
        String[] str1 = s2.split("\\s+");

        for (String word : str) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (String word : str1) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        ArrayList<String> list = new ArrayList<>();
        for (String word : map.keySet()) {
            if (map.get(word) == 1) {
                list.add(word);
            }
        }
        return list.toArray(new String[0]);
    }
}