class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        backTrack(0,nums,new ArrayList<>(),res);
        return res;
    }
    public void backTrack(int start,int[] nums,List<Integer> op,List<List<Integer>> res){
        res.add(new ArrayList<>(op));
        for(int i=start;i<nums.length;i++){
            if(i>start && nums[i]==nums[i-1]) continue;
            op.add(nums[i]);
            backTrack(i+1,nums,op,res);
            op.remove(op.size()-1);
        }
    }
}