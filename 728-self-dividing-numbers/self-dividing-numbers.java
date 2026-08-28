class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(selfdivide(i)){
                list.add(i);
            }
        }
        return list;
    }
    public static boolean selfdivide(int n){
        int temp=n;
        while(n>0){
            int d=n%10;
            if(d == 0 || temp % d != 0) return false;
            n=n/10;
        }
        return true;
    }
}