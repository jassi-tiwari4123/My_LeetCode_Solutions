class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //our intuition will be to flatten the 2d array into 1d in the min only
        //main idea is to find the index of element if row is: mid/no of column
        //column:mid%no of column
        int low=0;
        int row=matrix.length;
        int column=matrix[0].length;
        int high=row*column-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int r=mid/column;
            int c=mid%column;
            if(matrix[r][c]==target) return true;
            else if(matrix[r][c]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return false;
    }
}