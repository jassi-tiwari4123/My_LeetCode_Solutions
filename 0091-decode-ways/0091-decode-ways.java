class Solution {
    public int numDecodings(String s) {
        int n=s.length();
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        return fxn(s,0,dp);
    }
    public int fxn(String s,int i,int [] dp){
        int n=s.length();
        if(i==n) return 1;
        if(s.charAt(i)=='0') return 0;
        if(dp[i]!=-1) return dp[i];
        int ways=0;
        ways=ways+fxn(s,i+1,dp);
        if(i+1<n){
            int num=(s.charAt(i)-'0')*10+(s.charAt(i+1)-'0');
            if(num>=10 && num<=26){
                ways+=fxn(s,i+2,dp);
            }
        }
        return dp[i]=ways;
    }
}