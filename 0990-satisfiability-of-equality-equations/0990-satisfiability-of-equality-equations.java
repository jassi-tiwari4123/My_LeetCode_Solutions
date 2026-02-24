class Solution {
    static class dsu{
        int[] parent;
        int[] size;
        int components;
        dsu(int n){
            parent=new int[26];
            size=new int[26];
            this.components=n;
            for(int i=0;i<26;i++){
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
        }
    }
    public boolean equationsPossible(String[] equations) {
        dsu d=new dsu(26);
        int n=equations.length;
        for(int i=0;i<n;i++){
            String x=equations[i];
            if(x.charAt(1)=='='){
                d.union(x.charAt(0)-'a',x.charAt(3)-'a');
            }
        }
        for(int i=0;i<n;i++){
            String y=equations[i];
            if(y.charAt(1)=='!'){
                if(d.find(y.charAt(0)-'a')==d.find(y.charAt(3)-'a')){
                    return false;
                }
            }
        }
        return true;
    }
}