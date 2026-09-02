class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        String cleanString = licensePlate.replaceAll("[\\d\\s]", "");
        cleanString=cleanString.toLowerCase();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<cleanString.length();i++){
            char ch=cleanString.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        String result = "";
        for(int i=0;i<words.length;i++){
            String word=words[i];
            HashMap<Character, Integer> map2 = new HashMap<>();
            for (int j = 0; j < word.length(); j++) {
                char ch = word.charAt(j);
                map2.put(ch, map2.getOrDefault(ch, 0) + 1);
            }
            boolean complete = true;
            for (char ch : map.keySet()) {
                if (!map2.containsKey(ch) ||
                    map2.get(ch) < map.get(ch)) {
                    complete = false;
                    break;
                }
            }
            if (complete) {
                if (result.equals("") || word.length() < result.length()) {
                    result = word;
                }
            }
        }
        return result;
    }
}