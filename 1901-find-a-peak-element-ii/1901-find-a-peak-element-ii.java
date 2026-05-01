class Solution {
    public int[] findPeakGrid(int[][] mat) {
        //brute force solution (my approach)
        // int n=mat.length;
        // int m=mat[0].length;
        // int[] dirR={1,-1,0,0};
        // int[] dirC={0,0,-1,1};
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         boolean peak=true;
        //         for(int k=0;k<4;k++){
        //             int nr=i+dirR[k];
        //             int nc=j+dirC[k];
        //             if(nr>=0 && nr<n && nc>=0 && nc<m){
        //                 if(mat[i][j]<=mat[nr][nc]){
        //                     peak=false;
        //                     break;
        //                 }
        //             }
        //         }

        //         //can use this also instead of dirR and dirC
        //         // if(i>0 && mat[i][j]<=mat[i-1][j]) peak=false; 
        //         // if(j>0 && mat[i][j]<=mat[i][j-1]) peak=false; 
        //         // if(i<n-1 && mat[i][j]<=mat[i+1][j]) peak=false; 
        //         // if(j<m-1 && mat[i][j]<=mat[i][j+1]) peak=false;

        //         if(peak) return new int[]{i,j};
        //     }
        // }
        // return new int[]{-1,-1};


        //learnt binary search approach
        //1. find the middle col first
        //2. find the max element in mid col
        //3. check left and right of max num index
        //4. if left> then mid el : high=mid-1 else low=mid+1

        int n=mat.length;
        int m=mat[0].length;
        int low=0;int high=m-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int max=0;
            for(int i=0;i<n;i++){
                if(mat[i][mid]>mat[max][mid]){
                    max=i;
                }
            }
            //checking left and right
            int left=(mid>0)?mat[max][mid-1]:-1;
            int right=(mid<m-1)?mat[max][mid+1]:-1;
            if(left<mat[max][mid] && mat[max][mid]>right){
                return new int[]{max,mid};
            }
            else if(left>mat[max][mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return new int[]{-1,-1};
    }
}