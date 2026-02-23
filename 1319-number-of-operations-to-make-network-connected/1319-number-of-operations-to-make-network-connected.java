class Solution {
    static class dsu{
        int[] parent;
        int[] size;
        int comp;
        dsu(int n){
            parent= new int[n];
            size=new int[n];
            for(int i=0;i<n;i++){
                parent[i]=i;
                size[i]=1;
            }
            this.comp=n;
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
            comp--;
        }
    }
    public int makeConnected(int n, int[][] connections) {
        dsu d=new dsu(n);
        if(connections.length<n-1) return -1;
        for(int[] e:connections){
            int x=e[0];
            int y=e[1];
            d.union(x,y);
        }
        return d.comp-1;
    }
}