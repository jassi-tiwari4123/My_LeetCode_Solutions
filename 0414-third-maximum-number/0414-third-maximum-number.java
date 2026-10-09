class Solution {
    public int thirdMax(int[] nums) {
        int n=nums.length;
        long fm=Long.MIN_VALUE;
        long sm=Long.MIN_VALUE;
        long tm=Long.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]==fm || nums[i]==sm || nums[i]==tm) continue;
            if(nums[i]>fm){
                tm=sm;
                sm=fm;
                fm=nums[i];
            }
            else if(nums[i]>sm){
                tm=sm;
                sm=nums[i];
            }
            else if(nums[i]>tm){
                tm=nums[i];
            }
        }

        return tm==Long.MIN_VALUE?(int)fm:(int)tm;
    }
}