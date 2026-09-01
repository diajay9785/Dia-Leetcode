class Solution {
    public String[] findWords(String[] words) {
        HashMap<Character, Integer> map = new HashMap<>();
        ArrayList<String> ans=new ArrayList<>();
        String row1="qwertyuiop";
        for(int i = 0; i < row1.length(); i++) {
            char ch = row1.charAt(i);
            map.put(ch,1);
        }
        String row2="asdfghjkl";
        for(int i = 0; i < row2.length(); i++) {
            char ch = row2.charAt(i);
            map.put(ch,2);
        }
        String row3="zxcvbnm";
        for(int i = 0; i < row3.length(); i++) {
            char ch = row3.charAt(i);
            map.put(ch,3);
        }
        for(int i=0;i<words.length;i++){
            boolean valid=true;
            int row=map.get(Character.toLowerCase(words[i].charAt(0)));
            for(int j = 1; j < words[i].length(); j++) {
                char ch = Character.toLowerCase(words[i].charAt(j));
                if(map.get(ch) != row) {
                    valid=false;
                    break;
                }
                else{
                    continue;
                }
            }
            if(valid) ans.add(words[i]);
        }
        String result[]=new String[ans.size()];
        for(int i=0;i<ans.size();i++){
            result[i]=ans.get(i);
        }
        return result;
    }
}