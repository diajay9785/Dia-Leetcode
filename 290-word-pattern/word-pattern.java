class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map=new HashMap<>();
        HashSet<String> used = new HashSet<>();
        String[] words=s.split("\\s+");
        if (pattern.length() != words.length) {
            return false;
        }
        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            if(map.containsKey(ch)){
                if(!map.get(ch).equals(words[i])){
                    return false;
                }
            }
            else{
            if (used.contains(words[i])) {
                    return false;
                }

                map.put(ch, words[i]);
                used.add(words[i]);
            }
        }
        return true;
    }
}