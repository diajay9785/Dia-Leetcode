class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        HashSet<Character> set = new HashSet<>();
        for (char ch : brokenLetters.toCharArray()) {
            set.add(ch);
        }
        int count = 0;
        String[] words = text.split("\\s+");
        for (String word : words) {
            boolean canType = true;
            for (int i = 0; i < word.length(); i++) {
                if (set.contains(word.charAt(i))) {
                    canType = false;
                    break;
                }
            }
            if (canType) {
                count++;
            }
        }
        return count;
    }
}