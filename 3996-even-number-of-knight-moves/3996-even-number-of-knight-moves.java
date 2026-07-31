class Solution {
    public boolean canReach(int[] start, int[] target) {
        int[] dirR={2,2,-2,-2,1,1,-1,-1};
        int[] dirC={1,-1,-1,1,2,-2,2,-2};
        int n=8;
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{start[0],start[1],0});
        while(!q.isEmpty()){
            int[] cur=q.poll();
            int r=cur[0];
            int c=cur[1];
            int cost=cur[2];
            if(r==target[0] && c==target[1]) return cost%2==0;
            for(int i=0;i<8;i++){
                int nr=r+dirR[i];
                int nc=c+dirC[i];
                if(nr>=0 && nr<n && nc>=0 && nc<n){
                    int newCost=cost+1;
                    q.add(new int[]{nr,nc,newCost});
                }
            }
        }
        return false;
        
    }
}