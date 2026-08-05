public class Solution {
    public int reverseBits(int n) {
        String binary = String.format("%32s", Integer.toBinaryString(n))
                             .replace(' ', '0');

        String reversed = new StringBuilder(binary).reverse().toString();

        long value = Long.parseLong(reversed, 2);

        return (int) value;
    }
}