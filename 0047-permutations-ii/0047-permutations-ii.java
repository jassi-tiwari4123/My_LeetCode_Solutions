class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        per(nums,res,0);
        return res;
    }
    public static void per(int[] nums,List<List<Integer>> res,int ind){
        if(ind==nums.length){
            List<Integer> arr=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                arr.add(nums[i]);
            }
            res.add(arr);
            return;
        }
        HashSet<Integer> hs=new HashSet<>();
        for(int i=ind;i<nums.length;i++){
            if(hs.contains(nums[i])){
                continue;
            }
            hs.add(nums[i]);
            swap(nums,i,ind);
            per(nums,res,ind+1);
            swap(nums,i,ind);
        }
    } 
    public static void swap(int[] nums,int i,int ind){
        int tem=nums[i];
        nums[i]=nums[ind];
        nums[ind]=tem;
    }
}