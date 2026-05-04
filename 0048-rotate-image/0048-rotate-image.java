class Solution {
    public void rotate(int[][] matrix) {
       //transpose and reverse the row
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=i;j<m;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            reverse(i,0,m-1,matrix);
        }
    }
    public void reverse(int r,int i,int j,int[][] matrix){
        while(i<=j){
            int temp=matrix[r][i];
            matrix[r][i]=matrix[r][j];
            matrix[r][j]=temp;
            i++;
            j--;
        }
    }
}


 