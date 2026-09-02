class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        if(words.length==1) return 1;
        HashSet<String> set = new HashSet<>();
        String morsecode[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        int count=0;
        for(int i=0;i<words.length;i++){
            String ans="";
            String word=words[i];
            for(int j=0;j<word.length();j++){
                char ch=word.charAt(j);
                ans+=morsecode[ch-'a'];
            }
            set.add(ans);
        }
        return set.size();
    }
}