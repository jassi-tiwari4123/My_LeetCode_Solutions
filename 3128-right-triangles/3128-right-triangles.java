//brute
// class Solution {
//     public long numberOfRightTriangles(int[][] grid) {
//         int n=grid.length;
//         int m=grid[0].length;
//         long res=0L;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 if(grid[i][j]==1){
//                     int left=0;
//                     int right=0;
//                     int up=0;
//                     int down=0;
//                     //right
//                     for(int k=j+1;k<m;k++){
//                         if(grid[i][k]==1) right++;
//                     }
//                     //left
//                     for(int k=j-1;k>=0;k--){
//                         if(grid[i][k]==1) left++;
//                     }
//                     //down
//                     for(int k=i+1;k<n;k++){
//                         if(grid[k][j]==1) down++;
//                     }
//                     //up
//                     for(int k=i-1;k>=0;k--){
//                         if(grid[k][j]==1) up++;
//                     }
//                     res+=(long) (left+right)*(up+down);
//                 }
//             }
//         }
//         return res;
//     }
// }


//optimsed where i will store the number of ones in each row and each col generally doinfg precomputaion
class Solution {
    public long numberOfRightTriangles(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        long res=0L;
        int[] row=new int[n];
        int[] col=new int[m];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[j][i]==1){
                    col[i]++;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    row[i]++;
                }
            }
        }
        // System.out.println(Arrays.toString(row));
        // System.out.println(Arrays.toString(col));
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    res+=(long)(row[i]-1)*(col[j]-1);
                }
            }
        }
        return res;
    }
}