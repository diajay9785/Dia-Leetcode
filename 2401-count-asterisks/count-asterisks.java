class Solution {
    public int countAsterisks(String s) {
       return s.replaceAll("\\|[^|]*\\|", "").replaceAll("[^*]", "").length(); 
    }
}