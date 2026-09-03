class Solution {
    public boolean uniformArray(int[] nums1) {

        boolean canBeOdd = true;
        boolean canBeEven = true;

        int minOdd = Integer.MAX_VALUE;
        int minEven = Integer.MAX_VALUE;

        for (int x : nums1) {
            if (x % 2 == 0) {
                minEven = Math.min(minEven, x);
            } else {
                minOdd = Math.min(minOdd, x);
            }
        }

        for (int x : nums1) {
            if (x % 2 == 0) {
                if (minOdd == Integer.MAX_VALUE || minOdd >= x) {
                    canBeOdd = false;
                }
            }

            if (x % 2 != 0) {
                if (minOdd == Integer.MAX_VALUE || minOdd >= x) {
                    canBeEven = false;
                }
            }
        }

        return canBeOdd || canBeEven;
    }
}