class Solution {
    public int numDupDigitsAtMostN(int n) {
        String s=String.valueOf(n);
        int len=s.length();
        int[][][][] dp=new int[11][2][1<<10][2];
        for(int i=0;i<11;i++){
            for(int j=0;j<2;j++){
                for(int k=0;k<(1<<10);k++){
                    Arrays.fill(dp[i][j][k],-1);
                }
            }
        }
        return n-fxn(0,1,0,0,s,dp)+1;
    }

    public static int fxn(int idx,int restrict,int mask,int zeroes,String s,int[][][][] dp){
        if(idx==s.length()) return 1;
        if(dp[idx][restrict][mask][zeroes]!=-1) return dp[idx][restrict][mask][zeroes];
        int upper=(restrict==1)?s.charAt(idx)-'0':9;
        int res=0;
        for(int i=0;i<=upper;i++){
            int rest=(restrict==1 && i==upper)?1:0;
            if(zeroes==0 && i==0){
                res+=fxn(idx+1,rest,mask,0,s,dp);
            }
            else{
                if((mask & (1<<i))!=0) continue; // digit ek baar le chuke ab nhi le sakte
                res+=fxn(idx+1,rest,mask | (1<<i),1,s,dp);
            }
        
        }
        return dp[idx][restrict][mask][zeroes]=res;
    }
}