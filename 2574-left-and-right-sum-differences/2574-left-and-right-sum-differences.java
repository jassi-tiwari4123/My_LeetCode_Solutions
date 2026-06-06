class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int[] preSum=new int[n+1];
        int[] sufSum=new int[n+1];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                preSum[i]+=nums[j];
            }
        }
        
        for(int i=n-1;i>=0;i--){
            for(int j=i-1;j>=0;j--){
                sufSum[i]+=nums[j];
            }
        }
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            res[i]=Math.abs(preSum[i]-sufSum[i]);
        }
        return res;
    }
}