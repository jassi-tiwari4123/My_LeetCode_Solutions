class Solution {
    public int maxFrequency(int[] nums, int k) {
        // we will try to make the element equal to largest number as we can only increment the number so we cant increase the max 
        // try making the elements in a particular flexible window equal to max
        Arrays.sort(nums);
        int n=nums.length;
        long sum=0;
        int l=0;
        int res=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            while((long)nums[i]*(i-l+1)-sum>k){
                sum-=nums[l];
                l++;
            }
            res=Math.max(res,i-l+1);
        }
        return res;
    }
}