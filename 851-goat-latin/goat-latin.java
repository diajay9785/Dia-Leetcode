class Solution {
    public String toGoatLatin(String sentence) {
       String words[]=sentence.split("\\s+");
       char letter;
       String ans="";
               for (int i = 0; i < words.length; i++) {
            String word = words[i];

            if (isVowel(word.charAt(0))) {
                ans += word + "ma" + "a".repeat(i + 1);
            } else {
                letter = word.charAt(0);
                word = word.substring(1);
                ans += word + letter + "ma" + "a".repeat(i + 1);
            }

            if (i != words.length - 1)
                ans += " ";
        }

        return ans;
    }
    public boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' ||
               c == 'o' || c == 'u';
    }
}