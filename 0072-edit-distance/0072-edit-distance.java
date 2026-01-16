class Solution {
    public int minDistance(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        int[][]dp=new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            Arrays.fill(dp[i],-1);
        }
        return fxn(word1,word2,n-1,m-1,dp);
    }
    public int fxn(String s,String t,int i,int j,int[][]dp){
        if(i<0) return j+1;
        if(j<0) return i+1;
        if(dp[i+1][j+1]!=-1){
            return dp[i+1][j+1];
        }
        if(s.charAt(i)==t.charAt(j)){
            dp[i+1][j+1]=fxn(s,t,i-1,j-1,dp);
        }
        else{
            int insert=fxn(s,t,i,j-1,dp);
            int remove=fxn(s,t,i-1,j,dp);
            int replace=fxn(s,t,i-1,j-1,dp);
            dp[i+1][j+1]=1+Math.min(insert,Math.min(remove,replace));
        }
        return dp[i+1][j+1];
    }
}