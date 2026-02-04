class Solution {
    public int findJudge(int n, int[][] trust) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        for(int i=0;i<=n;i++){
            res.add(new ArrayList<>());
        }
        for(int[] e:trust){
            int u=e[0];
            int v=e[1];
            res.get(u).add(v);
        }
        int ind=-1;
        for(int i=1;i<=n;i++){
            if(res.get(i).size()==0){
                ind=i;
                break;
            }
        }
        if(ind==-1) return -1;
        for(int i=1;i<=n;i++){
            if(ind==i) continue;
            if(!res.get(i).contains(ind)) return -1;
        }
        return ind;
    }
}