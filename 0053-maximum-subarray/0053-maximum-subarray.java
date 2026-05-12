class Solution {
    public int maxSubArray(int[] nums) {
        // int sum=0;
        // int maxim=Integer.MIN_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     if(sum>=0){
        //         sum+=nums[i];
        //         if(sum>maxim)
        //         maxim=sum;
        //     }
        //     if(sum<0){
        //         sum=0;
        //     }
        // }
        // return maxim;

        int n=nums.length;
        int sum=0;
        int maxim=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(sum>=0){
                sum+=nums[i];
                if(sum>maxim){
                    maxim=sum;
                }
            }
            if(sum<0){
                sum=0;
            }
        }
        return maxim;
    }
}