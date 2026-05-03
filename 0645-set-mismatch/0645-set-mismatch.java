class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int dup=-1;
        for(int i=0;i<n;i++){
            int idx=Math.abs(nums[i])-1;
            if(nums[idx]<0){
                dup=Math.abs(nums[i]);
            }
            else{
                nums[idx]*=-1;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                return new int[]{dup,i+1};
            }
        }
        return new int[]{-1,-1};
    }
}