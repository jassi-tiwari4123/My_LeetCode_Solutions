class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int m=mat.length;
        int n=mat[0].length;
        int steps=k%n;
        if(steps==0) return true;
        for(int i=0;i<m;i++){
            int idx;
            for(int j=0;j<n;j++){
                if(i%2==0){ //left shift hoga
                    idx=(j+steps)%n;
                }
                else{
                    idx=(j-steps+n)%n;
                }
                if(mat[i][j]!=mat[i][idx]){
                    return false;
                }
            }
        }
        return true;
    }
}