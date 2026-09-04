class Solution {
    public List<String> commonChars(String[] words) {
        HashMap<Character,Integer> minMap=new HashMap<>();
        for (char ch : words[0].toCharArray()) {
            minMap.put(ch,minMap.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<words.length;i++){
            HashMap<Character,Integer> map=new HashMap<>();
            for (char ch : words[i].toCharArray()) {
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
            for (char ch : minMap.keySet()) {
                minMap.put(ch,Math.min(minMap.get(ch),map.getOrDefault(ch,0)));
            }
        }
        List<String> ans = new ArrayList<>();
        for (char ch : minMap.keySet()) {
            int count = minMap.get(ch);
            for (int i = 0; i < count; i++) {
                ans.add(String.valueOf(ch));
            }
        }
        return ans;
    }
}