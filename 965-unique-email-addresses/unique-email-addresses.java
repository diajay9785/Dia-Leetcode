class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < emails.length; i++) {
            String word = emails[i];
            String ans = "";
            boolean stop = false;
            boolean domain = false;
            for (int j = 0; j < word.length(); j++) {
                char ch = word.charAt(j);
                if (ch == '@') {
                    domain = true;
                    stop = false;
                    ans += ch;
                    continue;
                }
                if (stop == true) {
                    continue;
                }
                if (ch == '+' && domain == false) {
                    stop = true;
                    continue;
                }
                if (ch == '.' && domain == false) {
                    continue;
                }
                ans += ch;
            }
            set.add(ans);
        }
        return set.size();
    }
}