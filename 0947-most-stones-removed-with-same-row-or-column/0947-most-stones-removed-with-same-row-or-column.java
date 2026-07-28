class Solution {
    class DSU{
        int[] parent;
        int[] size;
        int component;
        DSU(int n){
            parent=new int[n];
            size=new int[n];
            this.component=n;
            for(int i=0;i<n;i++){
                parent[i]=i;
                size[i]=1;
            }
        }
        public int find(int u){
            if(parent[u]==u) return u;
            return parent[u]=find(parent[u]);
        }
        public void union(int u,int v){
            int pu=find(u);
            int pv=find(v);
            if(pu==pv) return;
            if(size[pu]>size[pv]){
                parent[pv]=pu;
                size[pu]+=size[pv];
            }
            else{
                parent[pu]=pv;
                size[pu]+=size[pv];
            }
            component--;
        }
    }
    public int removeStones(int[][] stones) {
        int n=stones.length;
        DSU d=new DSU(n);
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(stones[i][0]==stones[j][0] || stones[i][1]==stones[j][1]){
                    d.union(i,j);
                }
            }
        }
        return n-d.component;
    }
}