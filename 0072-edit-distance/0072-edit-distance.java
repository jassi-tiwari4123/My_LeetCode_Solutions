class Solution {
    public int minDistance(String word1, String word2) {
        //memo
    //     int n=word1.length();
    //     int m=word2.length();
    //     int[][] dp=new int[n][m];
    //     for(int i=0;i<n;i++){
    //         Arrays.fill(dp[i],-1);
    //     }
    //     return fxn(n-1,m-1,word1,word2,dp);
    // }
    // public int fxn(int i,int j,String s,String t,int[][] dp){
    //     if(i<0) return j+1;
    //     if(j<0) return i+1;
    //     if(dp[i][j]!=-1) return dp[i][j];
    //     if(s.charAt(i)==t.charAt(j)){
    //         return dp[i][j]=fxn(i-1,j-1,s,t,dp);
    //     }
    //     int insert=fxn(i,j-1,s,t,dp);
    //     int del=fxn(i-1,j,s,t,dp);
    //     int replace=fxn(i-1,j-1,s,t,dp);
    //     return dp[i][j]=1+Math.min(insert,Math.min(del,replace));

        //tab
        int n=word1.length();
        int m=word2.length();
        int[][] dp=new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            dp[i][0]=i;
        }
        for(int j=0;j<=m;j++){
            dp[0][j]=j;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }
                else{
                    int ins=dp[i][j-1];
                    int del=dp[i-1][j];
                    int rep=dp[i-1][j-1];
                    dp[i][j]=1+Math.min(ins,Math.min(del,rep));
                }
            }
        }
        return dp[n][m];
    }
}
