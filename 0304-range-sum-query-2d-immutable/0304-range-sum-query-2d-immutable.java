class NumMatrix {
    int[][] prefSum;
    public NumMatrix(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        prefSum=new int[n+1][m+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                prefSum[i+1][j+1]=prefSum[i+1][j]+prefSum[i][j+1]-prefSum[i][j]+matrix[i][j];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        return prefSum[row2+1][col2+1]-prefSum[row1][col2+1]-prefSum[row2+1][col1]+prefSum[row1][col1];
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */