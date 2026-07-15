class Solution {
    public int[] circularGameLosers(int n, int k) {
        boolean[] vis=new boolean[n];
        vis[0]=true;
        int time=1;
        int src=0;
        while(true){
            int steps=time*k;
            src=(src+steps)%n;
            if(vis[src]){
                break;
            }
            else{
                vis[src]=true;
                time++;
            }
        }
        int len=0;
        for(int i=0;i<n;i++){
            if(!vis[i]){
                len++;
            }
        }
        int[] res=new int[len];
        int x=0;
        for(int i=0;i<n;i++){
            if(!vis[i]){
                res[x++]=i+1;
            }
        }
        return res;
    }
}