class Solution {
    public int minimumTotal(List<List<Integer>> arr) {
        // int n = triangle.size();
        // for (int i = n - 2; i >= 0; i--) {
        //     List<Integer> row = triangle.get(i);
        //     List<Integer> below = triangle.get(i + 1);
            
        //     for (int j = 0; j < row.size(); j++) {
        //         int best = Math.min(below.get(j), below.get(j + 1));
        //         row.set(j, row.get(j) + best);
        //     }
        // }
        // return triangle.get(0).get(0); 


        //memoization
        int n=arr.size();
        Integer[][] dp=new Integer[n][n];
        return fxn(0,0,arr,dp);
    }
    public int fxn(int i,int j,List<List<Integer>>arr,Integer[][]dp){
        if(i==arr.size()-1) return arr.get(i).get(j);
        if(dp[i][j]!=null) return dp[i][j];
        int down=fxn(i+1,j,arr,dp);
        int side=fxn(i+1,j+1,arr,dp);
        dp[i][j]=arr.get(i).get(j)+Math.min(down,side);
        return dp[i][j]; 
    }
}