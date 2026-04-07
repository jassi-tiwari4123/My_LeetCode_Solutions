class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        int x=0; 
        int y=0;
        int dir=0; 
        int[][] directions={{0,1},{1,0},{0,-1},{-1,0}};
        int maxDist=0;
        for (int c:commands) {
            if (c==-1) {
                dir=(dir+1)%4;
            } 
            else if (c==-2) {
                dir=(dir+3)% 4;
            } 
            else {
                for(int i=0;i<c;i++) {
                    int nx=x+directions[dir][0];
                    int ny=y+directions[dir][1];
                    boolean blocked=false;
                    for (int[] obs:obstacles) {
                        if (obs[0]==nx && obs[1]==ny) {
                            blocked=true;
                            break;
                        }
                    }
                    if(blocked){
                        break;
                    }
                    x=nx;
                    y=ny;
                    maxDist=Math.max(maxDist,x*x+y*y);
                }
            }
        }
        return maxDist;
    }
}