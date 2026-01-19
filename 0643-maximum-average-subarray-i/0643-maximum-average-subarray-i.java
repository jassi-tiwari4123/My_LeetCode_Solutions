class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        if(n<k || n==0) return 0;
        double val=0;
        double sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        val=sum;
        for(int i=k;i<n;i++){
            sum+=nums[i]-nums[i-k];
            val=Math.max(sum,val);
        }
        return val/k;

    }
}