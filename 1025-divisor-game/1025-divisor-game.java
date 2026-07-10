class Solution {
    public boolean divisorGame(int n) {
        //normal
        // return n%2==0;

        //dp
        if(n<=1) return false;
        boolean[] dp=new boolean[n+1];
        Arrays.fill(dp,false);
        dp[1]=false;
        for(int i=2;i<=n;i++){
            for(int j=1;j*j<i;j++){
                if(i%j==0 && !dp[i-j]){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[n];
    }
}