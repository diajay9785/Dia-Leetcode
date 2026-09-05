class Solution {
    public List<Integer> partitionLabels(String s) {
       HashMap<Character,Integer> map=new HashMap<>();
       for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        map.put(ch,i);
       }
       List<Integer> ans=new ArrayList<>();
       int end=0;
       int start=0;
       for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            end=Math.max(end,map.get(ch));
        if(i==end){
            ans.add(end-start+1);
            start=i+1;
        }
       }
       return ans;
    }
}