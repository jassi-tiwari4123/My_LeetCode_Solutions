class Solution {
    public boolean isMatch(String s, String p) {
        int m=s.length();
        int n=p.length();
        Boolean[][] dp=new Boolean[m+1][n+1];
        return fxn(s,p,m,n,dp);
    }
    public boolean fxn(String s,String p,int m,int n,Boolean[][]dp){
        if(m==0 && n==0) return true;
        if(m==0 && n>0){
            for(int x=0;x<n;x++){
                if(p.charAt(x)!='*') return false;
            }
            return true;
        } 
        if(m>0 && n==0) return false;
        if(dp[m][n]!=null) return dp[m][n];
        if(s.charAt(m-1)==p.charAt(n-1)|| p.charAt(n-1)=='?'){
            return dp[m][n]=fxn(s,p,m-1,n-1,dp);
        }
        if(p.charAt(n-1)=='*'){
            return dp[m][n]=fxn(s,p,m-1,n,dp) || fxn(s,p,m,n-1,dp);
        }
        return dp[m][n]=false;
    }
}