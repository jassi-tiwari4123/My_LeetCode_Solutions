class Solution {
    public int minPairSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int i=0;
        int j=n-1;
        int maxSum=0;
        while(i<j){
            maxSum=Math.max(maxSum,nums[i]+nums[j]);
            i++;
            j--;
        }
        return maxSum;
    }
}