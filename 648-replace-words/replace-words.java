class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String str[]=sentence.split("\\s+");
        HashSet<String> set=new HashSet<>();
        String ans="";
        for(int i=0;i<dictionary.size();i++){
            set.add(dictionary.get(i));
        }
        for(int j=0;j<str.length;j++){
            String word=str[j];
            boolean found=false;
            for(int i = 1; i <= word.length(); i++) {
                String prefix = word.substring(0, i);
                    if(set.contains(prefix)) {
                        ans+=prefix;
                        found=true;
                        break;
                    }
            }
            if(!found) {
                ans += word;
            }
            if(j < str.length - 1) {
                ans += " ";
            }
        }
        return ans;
    }
}