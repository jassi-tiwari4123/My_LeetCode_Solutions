class Solution {
    public int findCenter(int[][] edges) {
        // int a = edges[0][0];
        // int b = edges[0][1];
        // int c = edges[1][0];
        // int d = edges[1][1];

        // if (a==c || a==d) return a;
        // return b;

        //adjacency list
        // int n=edges.length+1;
        // ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        // for(int i=0;i<=n;i++){
        //     res.add(new ArrayList<>());
        // }
        // for (int[] e : edges) {
        //     int u = e[0];
        //     int v = e[1];
        //     res.get(u).add(v);
        //     res.get(v).add(u);
        // }
        // for(int i=1;i<=n;i++){
        //     if(res.get(i).size()==edges.length){
        //         return i;
        //     }
        // }
        // return -1;

        //adjacency matrix
        // int n=edges.length+1;
        // int[][] matrix=new int[n+1][n+1];
        // for(int[] e:edges){
        //     int u=e[0];
        //     int v=e[1];
        //     matrix[u][v]=1;
        //     matrix[v][u]=1;
        // }
        // for(int i=1;i<=n;i++){
        //     int degree=0;
        //     for(int j=1;j<=n;j++){
        //         degree+=matrix[i][j];
        //     }
        //     if(degree==n-1) return i;
        // }
        // return -1;

        //using degree
        int n=edges.length+1;
        int[] degree=new int[n+1];
        for(int[] e:edges){
            int u=e[0];
            int v=e[1];
            degree[u]++;
            degree[v]++;
        }
        for(int i=1;i<=n;i++){
            if(degree[i]==n-1){
                return i;
            }
        }
        return -1;
    }
}
