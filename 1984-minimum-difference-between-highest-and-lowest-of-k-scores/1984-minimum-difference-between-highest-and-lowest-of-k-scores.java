class Solution {
    public int minimumDifference(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        int res=Integer.MAX_VALUE;
        for(int i=0;i<=n-k;i++){
            int max=nums[i];
            int min=nums[i];
            for(int j=i;j<i+k;j++){
                max=Math.max(max,nums[j]);
                min=Math.min(min,nums[j]);
            }
            res=Math.min(res,max-min);
        }
        return res;
    }
}