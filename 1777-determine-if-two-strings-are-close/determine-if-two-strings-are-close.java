class Solution {
    public boolean closeStrings(String word1, String word2) {
       HashMap<Character,Integer> map1=new HashMap<>();
       HashMap<Character,Integer> map2=new HashMap<>();
       if(word1.length()<word2.length()){
        return false;
       }
       for(int i=0;i<word1.length();i++){
        char ch=word1.charAt(i);
        map1.put(ch,map1.getOrDefault(ch,0)+1);
       }
       for(int i=0;i<word2.length();i++){
        char ch=word2.charAt(i);
        map2.put(ch,map2.getOrDefault(ch,0)+1);
       } 
        if (!map1.keySet().equals(map2.keySet())) {
            return false;
        }
        ArrayList<Integer> freq1 = new ArrayList<>(map1.values());
        ArrayList<Integer> freq2 = new ArrayList<>(map2.values());
        Collections.sort(freq1);
        Collections.sort(freq2);
        return freq1.equals(freq2);
    }
}