class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums, res,0);
        return res;
    }

    public void backtrack(int[] nums, List<List<Integer>> ans,int ind) {
       if (ind == nums.length) {
            ArrayList<Integer> curr=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                curr.add(nums[i]);
            }
            ans.add(curr);
            return;
        }
        for (int i = ind; i < nums.length; i++) {
            swap(nums,i,ind);
            backtrack(nums, ans, ind+1); 
            swap(nums,i,ind);
        }
    }
    public static void swap(int[] nums,int i,int ind){
        int temp=nums[i];
        nums[i]=nums[ind];
        nums[ind]=temp;
    }
}
