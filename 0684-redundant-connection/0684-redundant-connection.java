class Solution {
    static class dsu{
        int[] parent;
        int[] size;
        dsu(int n){
            parent=new int[n+1];
            size=new int[n+1];
        
            for(int i=0;i<=n;i++){
                parent[i]=i;
                size[i]=1;
            }
        }
        int find(int u){
            if(parent[u]==u) return u;
            return parent[u]=find(parent[u]);
        }
        boolean union(int u,int v){
            int pu=find(u);
            int pv=find(v);
            if(pu==pv) return true;
            if(size[pu]<size[pv]){
                parent[pu]=pv;
                size[pv]+=size[pu];
            }
            else{
                parent[pv]=pu;
                size[pu]+=size[pv];
            }
            return false;
        }
    }
    public int[] findRedundantConnection(int[][] edges) {
        int V=edges.length;
        dsu d=new dsu(V);
        for(int[]e:edges){
            int u=e[0];
            int v=e[1];
            if(d.union(u,v)){
                return e;
            }
        }
        return new int[0];
    }
}