class Solution {
    public boolean isValid(String word) {
      if(word.length()<3) return false;
      int Digit=0,Vowel=0,Consonant=0;
      for(int i=0;i<word.length();i++){
        if (!Character.isLetterOrDigit(word.charAt(i))){
            return false;
        }
        else if(Character.isDigit(word.charAt(i)))
        Digit++;
        else if(!Character.isDigit(word.charAt(i)) && isVowel(word.charAt(i)))
        Vowel++;
        else if(!Character.isDigit(word.charAt(i)) && !isVowel(word.charAt(i)))
        Consonant++;
      }  
      return Vowel>=1 && Consonant>=1;
    }
    public boolean isVowel(char c){
        c=Character.toLowerCase(c);
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
}