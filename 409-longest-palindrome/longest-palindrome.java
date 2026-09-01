class Solution {
    public int longestPalindrome(String s) {
      HashMap<Character,Integer> map=new HashMap<>();
      int count=0;
      boolean hasOdd = false;
      if(s.length()==1) return 1;
      for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        map.put(ch,map.getOrDefault(ch,0)+1);
      }
      for (int freq : map.values()) {
        if(freq%2==0){
            count+=freq;
        }
        else if(freq%2!=0){
            count+=freq-1;
            hasOdd=true;
        }
      }
       if (hasOdd) {
            count++;
        }
      return count;
    }
}