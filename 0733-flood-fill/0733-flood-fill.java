class Solution {
    int n, m;
    int oC, nC;
    public int[][] floodFill(int[][] image,int sr,int sc,int color) {
    //     n=image.length;
    //     m=image[0].length;
    //     oC=image[sr][sc];
    //     nC=color;
    //     if(oC==nC) return image;
    //     dfs(sr,sc,image);
    //     return image;
    // }
    // public int dfs(int x,int y,int[][]image) {
    //     if (x<0 || y<0 || x>=n || y>=m) return;
    //     if (image[x][y]!=oC) return;
    //     image[x][y]=nC;
    //     dfs(x-1,y,image);
    //     dfs(x+1,y,image);
    //     dfs(x,y-1,image);
    //     dfs(x,y+1,image);


        //using bfs;
        n=image.length;
        m=image[0].length;
        int nc=color;
        int oc=image[sr][sc];
        if(oc==nc) return image;
        Queue<int[]> q=new LinkedList<>();
        int[] dirR={-1,1,0,0};
        int[] dirC={0,0,-1,1};
        q.add(new int[]{sr,sc});
        image[sr][sc]=nc;
        while(!q.isEmpty()){
            int[] cur=q.poll();
            int x=cur[0];
            int y=cur[1];
            for(int i=0;i<4;i++){
                int nx=x+dirR[i];
                int ny=y+dirC[i];
                if(nx>=0 && nx<n && ny>=0 && ny<m && image[nx][ny]==oc){
                    q.add(new int[]{nx,ny});
                    image[nx][ny]=nc;
                }
            }
        }
        return image;
    }
}
