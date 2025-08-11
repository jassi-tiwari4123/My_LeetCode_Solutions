class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix=new int[n][n];
        int x=1;
        int left=0;
        int top=0;
        int right=n-1;
        int bottom=n-1;
        while(x<=n*n){
            //left to right
            for(int i=left;i<=right;i++){
                matrix[top][i]=x++;
            }
            top++;
            //top to bottom
            for(int i=top;i<=bottom;i++){
                matrix[i][right]=x++;
            }
            right--;
            //right to left
            for(int i=right;i>=left;i--){
                matrix[bottom][i]=x++;
            }
            bottom--;
            //bottom to top
            for(int i=bottom;i>=top;i--){
                matrix[i][left]=x++;
            }
            left++;
        } 
        return matrix;    
    }
}