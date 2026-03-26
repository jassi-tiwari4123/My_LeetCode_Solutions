class Solution {
    int[][][] dp;
    public int atMostNGivenDigitSet(String[] digits, int n) {
        String s=String.valueOf(n);
        int len=s.length();
        dp=new int[len+1][2][2];
        for(int i=0;i<len+1;i++){
            for(int j=0;j<2;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        return fxn(0,1,0,s,digits);
    }
    public int fxn(int idx,int restrict,int start,String s,String[] dig){
        if(idx==s.length()) return start==0?0:1;
        if(dp[idx][restrict][start]!=-1) return dp[idx][restrict][start];
        int res=0;
        int upper=(restrict==1)?s.charAt(idx)-'0':9;
        if(start==0){
            res+=fxn(idx+1,(restrict==1 && 0==upper)?1:0,0,s,dig);
        }
        for(int i=0;i<dig.length;i++){
            int num=Integer.parseInt(dig[i]);
            if(num>upper) continue;
            res+=fxn(idx+1,(restrict==1 && num==upper)?1:0,1,s,dig);
        }
        return dp[idx][restrict][start]=res;
    }
}