class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> op=new ArrayList<>();
        Arrays.sort(candidates);
        fxn(candidates,target,res,op,0);
        return res;
    }
    public void fxn(int[] candidates,int target,List<List<Integer>> res,List<Integer> op,int index){
        if(target==0) {
            res.add(new ArrayList<>(op));
            return;
        }
        for(int i=index;i<candidates.length;i++){
            if(i>index && candidates[i]==candidates[i-1]) continue;
            if(candidates[i]>target) break;
            op.add(candidates[i]);
            fxn(candidates,target-candidates[i],res,op,i+1);
            op.remove(op.size()-1);
        }
    }
}