class Solution {
    public int minimumTime(int n, int[][] relations, int[] time) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        int[] inDegree=new int[n+1];
        for(int[] r:relations){
            int u=r[0];
            int v=r[1];
            adj.get(u).add(v);
            inDegree[v]++;
        }
        int[] finish=new int[n+1];
        Queue<Integer> q=new LinkedList<>();
        for(int i=1;i<=n;i++){
            if(inDegree[i]==0) {
                q.add(i);
                finish[i]=time[i-1];
            }
        }
        int res=0;
        while(!q.isEmpty()){
            int cur=q.poll();
            res=Math.max(res,finish[cur]);
            for(int x:adj.get(cur)){
                finish[x]=Math.max(finish[x],finish[cur]+time[x-1]);
                inDegree[x]--;
                if(inDegree[x]==0){
                    q.add(x);
                }
            }
        }
        return res;
    }
}