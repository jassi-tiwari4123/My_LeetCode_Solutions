class Solution {
    public void setZeroes(int[][] matrix) {
        //brute force using extra space
        // int n=matrix.length;
        // int m=matrix[0].length;
        // boolean[] row=new boolean[n];
        // boolean[] col=new boolean[m];
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         if(matrix[i][j]==0){
        //             row[i]=true;
        //             col[j]=true;
        //         }
        //     }
        // }
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         if(row[i]|| col[j]){
        //             matrix[i][j]=0;
        //         }
        //     }
        // }



        //optimal
        int n=matrix.length;
        int m=matrix[0].length;
        boolean fRow=false;
        boolean fcol=false;
        for(int i=0;i<m;i++){
            if(matrix[0][i]==0) fRow=true;
        }
        for(int i=0;i<n;i++){
            if(matrix[i][0]==0) fcol=true;
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        for(int i=0;i<m;i++){
            if(fRow){
                matrix[0][i]=0;
            }
        }
        for(int i=0;i<n;i++){
            if(fcol){
                matrix[i][0]=0;
            }
        }
    }
}




