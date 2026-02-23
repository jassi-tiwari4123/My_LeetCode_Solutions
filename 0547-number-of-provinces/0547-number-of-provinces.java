class Solution {
    static class dsu{
        int[] parent;
        int[] size;
        int components;
        dsu(int n){
            parent=new int[n+1];
            size=new int[n+1];
            this.components=n;
            for(int i=0;i<n;i++){
                parent[i]=i;
                size[i]=1;
            }
        }
        int find(int u){
            if(parent[u]==u) return u;
            return parent[u]=find(parent[u]);
        }
        void union(int u,int v){
            int pu=find(u);
            int pv=find(v);
            if(pu==pv) return;
            if(size[pu]<size[pv]){
                parent[pu]=pv;
                size[pv]+=size[pu];
            }
            else{
                parent[pv]=pu;
                size[pu]+=size[pv];
            }
            components--;
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int V=isConnected.length;
        dsu d=new dsu(V);
        for(int i=0;i<V;i++){
            for(int j=0;j<V;j++){
                if(isConnected[i][j]==1){
                    d.union(i,j);
                }
            }
        }
        return d.components;
    }
}