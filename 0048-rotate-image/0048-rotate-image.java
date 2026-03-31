class Solution {
    public void rotate(int[][] matrix) {
        //it is using extra space
        // int n=matrix.length;
        // int[][] newMat=new int[n][n];
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         newMat[i][j]=matrix[n-j-1][i];
        //     }
        // }
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         matrix[i][j]=newMat[i][j];
        //     }
        // }


        //can do transpose and then reverse each row
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            reverse(i,0,n-1,matrix);
        }
    }

    public void reverse(int i,int l,int r,int[][]matrix){
        while(l<r){
            int temp=matrix[i][l];
            matrix[i][l]=matrix[i][r];
            matrix[i][r]=temp;
            l++;
            r--;
        }
    }
}