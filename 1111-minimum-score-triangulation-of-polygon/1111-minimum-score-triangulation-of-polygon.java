class Solution {
    public int minScoreTriangulation(int[] values) {
        int n=values.length;
        int[][] arr=new int[n][n];
        for(int[] rows:arr){
            Arrays.fill(rows,-1);
        }
        return score(values,0,n-1,arr);
    }
    public int score(int[] values,int i,int j,int[][] arr){
        if(i+1==j){
            return 0;
        }
        if(arr[i][j]!=-1) return arr[i][j] ;
        int n=values.length;
        int ans=Integer.MAX_VALUE;
        for(int k=i+1;k<j;k++){
            int cost=values[i]*values[j]*values[k]+score(values,i,k,arr)+score(values,k,j,arr);
            ans=Math.min(ans,cost);
        }
        arr[i][j]=ans;
        return ans;
    }
    
}