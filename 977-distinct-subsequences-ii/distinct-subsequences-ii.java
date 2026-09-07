class Solution {
    public int distinctSubseqII(String s) {
      int n=s.length();
      long last[]=new long[26];
      long dp[]=new long[n+1];
      long mod=1000000007;
      dp[0]=1;
      for(int i=1;i<=n;i++){
        int c=s.charAt(i-1)-'a';
        dp[i]=(2*dp[i-1]-last[c]+mod)%mod;
        last[c]=dp[i-1];
      }  
      return (int)((dp[n]-1+mod)%mod);//dp[n]-1 is to remove "" whih is inclded in the dp
    }
}