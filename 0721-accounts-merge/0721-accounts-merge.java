class Solution {
     static class dsu{
        int[] parent;
        int[]size;
        int comp;
        dsu(int n){
            parent=new int[n];
            size=new int[n];
            this.comp=n;
            for(int i=0;i<n;i++){
                parent[i]=i;
                size[i]=1;
            }
        }
        int find(int x){
            if(parent[x]==x) return x;
            return parent[x]=find(parent[x]);
        }
        void union(int u ,int v){
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
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        int n=accounts.size();
          dsu d=new dsu(n);
        HashMap<String,Integer> hm1=new HashMap<>();
        for(int i=0;i<n;i++){ 
            List<String> acc=accounts.get(i);
            for(int j=1;j<acc.size();j++){
                String mail=acc.get(j);
                if(hm1.containsKey(mail)){
                    d.union(i,hm1.get(mail));
                }
                else{
                    hm1.put(mail,i);
                }
            }
        }
        HashMap<Integer,ArrayList<String>> hm2=new HashMap<>();
        for(String x:hm1.keySet()){
            int i=hm1.get(x);
            int parent=d.find(i);
            hm2.putIfAbsent(parent,new ArrayList<>());
            hm2.get(parent).add(x);
        }
        List<List<String>> res=new ArrayList<>();
        for(int x:hm2.keySet()){
            ArrayList<String> op=hm2.get(x);
            Collections.sort(op);
            List<String> temp=new ArrayList<>();
            temp.add(accounts.get(x).get(0));
            temp.addAll(op);
            res.add(temp);
        }
        return res;
    }
}