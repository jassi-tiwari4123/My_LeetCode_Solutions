class Solution {
    public int firstMissingPositive(int[] nums) {
        int l=nums.length;
        for(int i=0;i<l;i++){
            if(nums[i]<=0 || nums[i]>=(l+1)){
                nums[i]=l+1;
            }
        }
        for(int i=0;i<l;i++){
            int element=Math.abs(nums[i]);
            if(element==(l+1)){
                continue;
            }
            int seat=element-1;
            if(nums[seat]>0){
                nums[seat]=-nums[seat];
            }
        }
        for(int i=0;i<l;i++){
            if(nums[i]>0){
                return (i+1);
            }
        }
        return l+1;
    }
}
