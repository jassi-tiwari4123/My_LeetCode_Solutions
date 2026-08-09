class Solution {
    int n;
    int[][][] dp;
    public int stoneGameII(int[] piles) {
        n=piles.length;
        dp=new int[2][n][2*n+1];
        for(int i=0;i<2;i++){
            for(int j=0;j<n;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        return fxnForAlice(0,0,1,piles); //for alice 0 and for bob 1
    }
    public int fxnForAlice(int person,int i,int M,int[] piles){
        if(i>=n) return 0;
        int ans=0;
        if(person==0) ans=0;
        else ans=Integer.MAX_VALUE;
        if(dp[person][i][M]!=-1) return dp[person][i][M];
        int stones=0;
        for(int x=1;x<=2*M;x++){
            if(i+x<=n) stones+=piles[i+x-1];
            if(person==0){  //yani alice ki baari toh stones add honge aur bob mein stones add nhi honge kyunki fxn alice ke liye banaya hai
                ans=Math.max(ans,stones+fxnForAlice(1,i+x,Math.max(x,M),piles));     
            }
            else{
                ans=Math.min(ans,fxnForAlice(0,i+x,Math.max(x,M),piles));
            }
        }
        return dp[person][i][M]=ans;
    }
}