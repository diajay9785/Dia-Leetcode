class Solution {
    public String capitalizeTitle(String title) {

        title = title.toLowerCase();

        String[] words = title.split("\\s+");

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < words.length; i++) {

            String word = words[i];

            if (word.length() <= 2) {
                ans.append(word);
            } 
            else {
                ans.append(Character.toUpperCase(word.charAt(0)));

                for (int j = 1; j < word.length(); j++) {
                    ans.append(word.charAt(j));
                }
            }

            if (i < words.length - 1) {
                ans.append(" ");
            }
        }

        return ans.toString();
    }
}