class Solution {
    public boolean canAliceWin(int[] nums) {
        int n=nums.length;
        int sumOne=0;
        int sumTwo=0;
        for(int i=0;i<n;i++){
            if(nums[i]<10){
                sumOne+=nums[i];
            }
            if(nums[i]>=10){
                sumTwo+=nums[i];
            }
        }
        return sumOne!=sumTwo;
    }
}