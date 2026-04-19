class Solution {
    class Pair{
        int r,c,color;
        Pair(int i,int j,int color){
            this.r=i;
            this.c=j;
            this.color=color;
        }
    }
    public int[][] colorGrid(int n, int m, int[][] sources) {
        int[][] grid=new int[n][m];
        Queue<Pair> q=new LinkedList<>();
        for(int[] s:sources){
            int row=s[0];
            int col=s[1];
            int color=s[2];
            grid[row][col]=color;
            q.add(new Pair(row,col,color));
        }
        int[] dirR={0,0,-1,1};
        int[] dirC={-1,1,0,0};
        while(!q.isEmpty()){
            int size=q.size();
            HashMap<Integer,Integer> hm=new HashMap<>();
            for(int i=0;i<size;i++){
                Pair cur=q.poll();
                for(int k=0;k<4;k++){
                    int nr=cur.r+dirR[k];
                    int nc=cur.c+dirC[k];
                    if(nr>=0 && nr<n && nc>=0 && nc<m){
                        
                        if(grid[nr][nc]==0){
                            int key=nr*m+nc;
                            hm.put(key,Math.max(hm.getOrDefault(key,0),cur.color));
                        }
                    }
                }
            }
            for(int key:hm.keySet()){
                int r=key/m;
                int c=key%m;
                int color=hm.get(key);
                grid[r][c]=color;
                q.add(new Pair(r,c,color));
            }
        }
        return grid;
    }
}


// brute 
// class Solution {
//     class Pair{
//         int r,c,color;
//         Pair(int i,int j,int color){
//             this.r=i;
//             this.c=j;
//             this.color=color;
//         }
//     }
//     public int[][] colorGrid(int n, int m, int[][] sources) {
//         int[][] grid=new int[n][m];
//         Queue<Pair> q=new LinkedList<>();
//         for(int[] s:sources){
//             int row=s[0];
//             int col=s[1];
//             int color=s[2];
//             grid[row][col]=color;
//             q.add(new Pair(row,col,color));
//         }
//         int[] dirR={0,0,-1,1};
//         int[] dirC={-1,1,0,0};
//         while(!q.isEmpty()){
//             int size=q.size();
//             int[][] newColor=new int[n][m];
//             for(int i=0;i<size;i++){
//                 Pair cur=q.poll();
//                 for(int k=0;k<4;k++){
//                     int nr=cur.r+dirR[k];
//                     int nc=cur.c+dirC[k];
//                     if(nr>=0 && nr<n && nc>=0 && nc<m){
//                         if(grid[nr][nc]==0){
//                             newColor[nr][nc]=Math.max(cur.color,newColor[nr][nc]);
//                         }
//                     }
//                 }
//             }
//             for(int i=0;i<n;i++){
//                 for(int j=0;j<m;j++){
//                     if(newColor[i][j]!=0){
//                         grid[i][j]=newColor[i][j];
//                         q.add(new Pair(i,j,newColor[i][j]));
//                     }
//                 }
//             }
//         }
//         return grid;
//     }
// }