class Solution {
    public int findGCD(int[] nums) {
        int n=nums.length;
        int small=Integer.MAX_VALUE;
        int large=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]<small){
                small=nums[i];
            }
            if(nums[i]>large){
                large=nums[i];
            }
        }
        while(small!=0){
            int temp=large%small;
            large=small;
            small=temp;
        }
        return large;
    }
}