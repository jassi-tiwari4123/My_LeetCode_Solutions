class Solution {
    public int[] leftRightDifference(int[] nums) {
        //my approach but not optimised
        // int n=nums.length;
        // int[] preSum=new int[n+1];
        // int[] sufSum=new int[n+1];
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         preSum[i]+=nums[j];
        //     }
        // }
        
        // for(int i=n-1;i>=0;i--){
        //     for(int j=i-1;j>=0;j--){
        //         sufSum[i]+=nums[j];
        //     }
        // }
        // int[] res=new int[n];
        // for(int i=0;i<n;i++){
        //     res[i]=Math.abs(preSum[i]-sufSum[i]);
        // }
        // return res;


        //optimsed
        int n=nums.length;
        int[] res=new int[n];
        int total=0;
        for (int num:nums){
            total+=num;
        }
        int left=0;
        for (int i=0;i<n;i++){
            int right=total-left-nums[i];
            res[i]=Math.abs(left-right);
            left+=nums[i];
        }
        return res;
    }
}
    