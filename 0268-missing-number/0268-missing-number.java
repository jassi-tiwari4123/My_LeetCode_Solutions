class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int j=0;
        if(nums[0]==1){
            return 0;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]-nums[j]==1){
                j++;
            }
            else if(nums[i]-nums[j]==2){
                return j+1;
            }
        }
        return j+1;
    }
}