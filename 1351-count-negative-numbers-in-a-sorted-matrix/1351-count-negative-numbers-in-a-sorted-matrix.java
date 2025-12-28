class Solution {
    public int countNegatives(int[][] grid) {
        // O(mlogn)
        int m=grid.length;
        int n=grid[0].length;
        int ans=0;
        for(int i=0;i<m;i++){
            int l=0;
            int r=n-1;
            while(l<=r){
                int mid=l+(r-l)/2;
                
                if(grid[i][mid]<0){
                    r=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            ans+=n-l;
        }
        return ans;


        // //O(n*m)
        // int count=0;
        // for(int i=0;i<grid.length;i++){
        //     for(int j=0;j<grid[0].length;j++){
        //         if(grid[i][j]<0){
        //             count++;
        //         }
        //     }
        // }
        // return count;
    }
}