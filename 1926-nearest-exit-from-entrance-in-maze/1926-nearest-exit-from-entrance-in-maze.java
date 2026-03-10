class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int n=maze.length;
        int m=maze[0].length;
        Queue<int[]> q=new LinkedList<>();
        q.add(entrance);
        maze[entrance[0]][entrance[1]]='+';
        int[] dirRow={1,-1,0,0};
        int[] dirCol={0,0,-1,1};
        int res=0;
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                int[] cur=q.poll();
                int row=cur[0];
                int col=cur[1];
                for(int k=0;k<4;k++){
                    int newR=row+dirRow[k];
                    int newC=col+dirCol[k];
                    if(newR>=0 && newR<n && newC>=0 && newC<m && maze[newR][newC]=='.'){
                        if(newR==0 || newR==n-1 || newC==0 || newC==m-1){
                            return res+1;
                        }
                        maze[newR][newC]='+';
                        q.add(new int[]{newR,newC});
                    }
                }
            }
            res++;
        }
        return -1;
    }
}