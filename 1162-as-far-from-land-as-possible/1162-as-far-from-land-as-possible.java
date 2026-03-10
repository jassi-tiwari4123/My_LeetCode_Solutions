class Solution {
    public int maxDistance(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    q.add(new int[]{i,j});
                }
            }
        }
        if(q.isEmpty() || q.size()==n*n) return -1;
        int[] dirRow={1,-1,0,0};
        int[] dirCol={0,0,-1,1};
        int dist=-1;
        while(!q.isEmpty()){
            int size=q.size();
            dist++;
            for(int i=0;i<size;i++){
                int[] cur=q.poll();
                int row=cur[0];
                int col=cur[1];
                for(int k=0;k<4;k++){
                    int newRow=row+dirRow[k];
                    int newCol=col+dirCol[k];
                    if(newRow>=0 && newRow<n && newCol>=0 && newCol<m && grid[newRow][newCol]==0){
                        grid[newRow][newCol]=1;
                        q.add(new int[]{newRow,newCol});
                    }
                    
                }
            } 
        }
        return dist;
    }
}