class Solution {
    public int findIntegers(int n) {
        //here we can use digit dp ans range is given and on particular number we have to play around 0 or + time constraint is also given very high
        String binRep=Integer.toBinaryString(n);
        int len=binRep.length();
        int[][][] dp=new int[len+1][2][2];
        for(int i=0;i<len+1;i++){
            for(int j=0;j<2;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        return fxn(0,1,0,binRep,dp);
    }
    public int fxn(int idx,int restrict,int prev,String s,int[][][] dp){
        if(idx==s.length()) return 1;
        if(dp[idx][restrict][prev]!=-1) return dp[idx][restrict][prev] ;
        int res=0;
        int upper=(restrict==1)?s.charAt(idx)-'0':1;
        for(int i=0;i<=upper;i++){
            if(prev==1 && i==1) continue;
            res+=fxn(idx+1,(restrict==1 && i==upper)?1:0,i,s,dp);
        }
        return dp[idx][restrict][prev]=res;
    }
}