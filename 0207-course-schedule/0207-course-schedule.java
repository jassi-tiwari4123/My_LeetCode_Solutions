class Solution {
    public boolean canFinish(int n, int[][] prer) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        int[] inDegree=new int[n];
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] p:prer){
            int u=p[0];
            int v=p[1];
            adj.get(v).add(u);
            inDegree[u]++;
        }
        //if cycle then return false and topological sort is used here due to dependemcies and it fails if it is not DAG
        boolean[] vis=new boolean[n];
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(inDegree[i]==0) q.add(i);
        }
        ArrayList<Integer> res=new ArrayList<>();
        while(!q.isEmpty()){
            int cur=q.poll();
            res.add(cur);
            for(int x:adj.get(cur)){
                inDegree[x]--;
                if(inDegree[x]==0){
                    q.add(x);
                }
            }
        }
        return res.size()==n;
    }
}