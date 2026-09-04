class Solution {
    public int numUniqueEmails(String[] emails) {

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < emails.length; i++) {

            String email = emails[i];

            int at = email.indexOf('@');
            int plus = email.indexOf('+');

            String local;

            if (plus != -1 && plus < at) {
                local = email.substring(0, plus);
            } else {
                local = email.substring(0, at);
            }

            local = local.replace(".", "");

            String domain = email.substring(at);

            String finalEmail = local + domain;

            set.add(finalEmail);
        }

        return set.size();
    }
}