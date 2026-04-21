class Solution {
    class DSU{
        int[] par;
        DSU(int n){
            par=new int[n];
            for(int i=0;i<n;i++){
                par[i]=i;
            }
        }
        int find(int u){
            if(par[u]!=u){
                par[u]=find(par[u]);
            }
            return par[u];
        }
        void union(int u,int v){
            int pu=find(u);
            int pv=find(v);
            if(pu!=pv){
                par[pu]=pv;
            }
        }
    }
    public int minimumHammingDistance(int[] source, int[] target, int[][] allowedSwaps) {
        int n=source.length;
        DSU d=new DSU(n);
        for(int[] s:allowedSwaps){
            d.union(s[0],s[1]);
        }
        HashMap<Integer,Map<Integer,Integer>> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            int p=d.find(i);
            hm.putIfAbsent(p,new HashMap<>());
            Map<Integer,Integer> f=hm.get(p);
            f.put(source[i],f.getOrDefault(source[i],0)+1);
        }
        int res=0;
        for(int i=0;i<n;i++){
            int p=d.find(i);
            Map<Integer,Integer> f=hm.get(p);
            if(f.getOrDefault(target[i],0)>0){
                f.put(target[i],f.get(target[i])-1);
            }
            else{
                res++;
            }
        }
        return res;
    }
}