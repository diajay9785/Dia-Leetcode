class Solution {
    public int findSpecialInteger(int[] arr) {
    int n=arr.length;
    int maxNumber=0;
    HashMap<Integer,Integer> map=new HashMap<>();
    for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            if (map.get(arr[i]) > n / 4) {
                return arr[i];
            }
        }
        return -1;
    }
}