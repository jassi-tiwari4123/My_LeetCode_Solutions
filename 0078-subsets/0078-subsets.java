class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        sub(nums,0,res,new ArrayList<>());
        return res;
    }
    public void sub(int[] nums,int ind,List<List<Integer>>res,List<Integer>x){
        int len=nums.length;
        if(ind==len){
            res.add(new ArrayList<>(x));
            return;
        }
        x.add(nums[ind]);
        sub(nums,ind+1,res,x);
        x.remove(x.size()-1);
        sub(nums,ind+1,res,x);
    }
}