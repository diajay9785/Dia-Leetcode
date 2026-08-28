class Solution {
    public String capitalizeTitle(String title) {
        title = title.toLowerCase();
        String words[] = title.split("\\s+");
        String ans = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() <= 2) {
                ans += word;
            }
            else {
                ans += Character.toUpperCase(word.charAt(0));

                for (int j = 1; j < word.length(); j++) {
                    ans += word.charAt(j);
                }
            }
            if (i < words.length - 1) {
                ans += " ";
            }
        }
        return ans;
    }
}