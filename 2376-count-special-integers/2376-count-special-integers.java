class Solution {
    public int countSpecialNumbers(int n) {
        String s=String.valueOf(n);
        int len=s.length();
        int[][][][]dp=new int[len+1][2][1<<10][2];
        for(int i=0;i<len+1;i++){
            for(int j=0;j<2;j++){
                for(int k=0;k<(1<<10);k++){
                    Arrays.fill(dp[i][j][k],-1);
                }
            }
        }
        return fxn(0,1,0,0,s,dp)-1;
    }
    public int fxn(int idx,int restrict,int mask,int start,String s,int[][][][] dp){
        if(idx==s.length()) return 1;
        if(dp[idx][restrict][mask][start]!=-1) return dp[idx][restrict][mask][start];
        int upper=(restrict==1)?s.charAt(idx)-'0':9;
        int res=0;
        for(int i=0;i<=upper;i++){
            if(start==0 && i==0){
                res+=fxn(idx+1,(restrict==1 && i==upper)?1:0,mask,0,s,dp);
            }
            else{
                if((mask & (1<<i))!=0) continue;
                res+=fxn(idx+1,((restrict==1 && i==upper)?1:0),mask | (1<<i),1,s,dp);
            }
        }
        return dp[idx][restrict][mask][start]=res;
    }
}