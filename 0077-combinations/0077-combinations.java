class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res=new ArrayList<>();
        fxn(res,n,k,new ArrayList<>(),1);
        return res;
    }
    public void fxn(List<List<Integer>> res,int n,int k,List<Integer> part,int l){
        if(part.size()==k){
            res.add(new ArrayList<>(part));
            return;
        }
        for(int i=l;i<=n;i++){
            part.add(i);
            fxn(res,n,k,part,i+1);
            part.remove(part.size()-1);
        }
    }
}