class Solution {
    public int missingNumber(int[] nums) {
        // Naive approach
        // for(int i=0;i<=nums.length+1;i++){
        //     boolean flag=false;
        //     for(int j=0;j<nums.length;j++){
        //         if(nums[j]==i){
        //             flag=true;
        //             break;
        //         }
        //     }
        //     if(flag==false){
        //         return i;
        //     }
        // }
        // return -1;

        // better approach is to use hash
        // best approach is to use sum of first n numbers
        int n=nums.length;
        long sum1=(long)((n*(n+1))/2);
        long sum2=0;
        for(int i=0;i<n;i++){
            sum2+=nums[i];
        }
        return (int)(sum1-sum2);
    }
}