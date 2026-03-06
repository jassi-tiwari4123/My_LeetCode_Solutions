class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        int[][] dp=new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return fxn(s1,s2,n-1,m-1,dp);
    }
    public int fxn(String s,String t,int i,int j,int[][]dp){
        if(i<0 && j<0) return 0;
        if(i<0) {
            int sum=0;
            for(int k=0;k<=j;k++){
                sum+=t.charAt(k);
            }
            return sum;
        }
        if(j<0){
            int sum=0;
            for(int k=0;k<=i;k++){
                sum+=s.charAt(k);
            }
            return sum;
        }
        if(dp[i][j]!=-1) return dp[i][j];
        if(s.charAt(i)==t.charAt(j)){
            dp[i][j]=fxn(s,t,i-1,j-1,dp);
        }
        else{
            int sum1=(int)(s.charAt(i));
            int sum2=(int)(t.charAt(j));
            dp[i][j]=Math.min(sum1+fxn(s,t,i-1,j,dp),sum2+fxn(s,t,i,j-1,dp));
        }
        return dp[i][j];
    }
}