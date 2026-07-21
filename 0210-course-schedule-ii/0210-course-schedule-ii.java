class Solution {
    public int[] findOrder(int n, int[][] prer) {
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
        boolean[] vis=new boolean[n];
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(inDegree[i]==0) q.add(i);
        }
        int i=0;
        int[] res=new int[n];
        while(!q.isEmpty()){
            int cur=q.poll();
            res[i++]=cur;
            for(int x:adj.get(cur)){
                inDegree[x]--;
                if(inDegree[x]==0){
                    q.add(x);
                }
            }
        }
        return i==n?res:new int[]{};   
    }
}