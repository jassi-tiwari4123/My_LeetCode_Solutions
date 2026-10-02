class Solution {
    public int maxSubarraySumCircular(int[] nums) {
    //     //brute
    //     int n=nums.length;
    //     int res=Integer.MIN_VALUE;
    //     for(int i=0;i<n;i++){
    //         int[] rot=rotated(nums,i,n);
    //         int sum=kadane(rot);
    //         res=Math.max(res,sum);
    //     }
    //     return res;
    // }
    // public int[] rotated(int[] nums,int k,int n){
    //     k=k%n;
    //     int[] arr=new int[n];
    //     for(int i=0;i<n;i++){
    //         arr[i]=nums[(i+k)%n];
    //     }
    //     return arr;
    // }
    // public int kadane(int[] nums){
    //     int sum=0;
    //     int res=Integer.MIN_VALUE;
    //     for(int i=0;i<nums.length;i++){
    //         if(sum>=0) {
    //             sum+=nums[i];
    //             if(sum>=res){
    //                 res=sum;
    //             }
    //         }
    //         if(sum<0){
    //             sum=0;
    //         } 
    //     }
    //     return res;


        //optimised
        //total-minSum=maxSum for wrap or circular
        //max sum for normal array /
        //max of above two
        int n=nums.length;
        int total=0;
        for(int i=0;i<n;i++){
            total+=nums[i];
        }
        int maxSum=kadane(nums);
        int minSum=kadaneMin(nums);
        int cirMaxSum=total-minSum;
        if(maxSum<0) return maxSum;
        return Math.max(maxSum,cirMaxSum);
    }
    public int kadane(int[] nums){
        int sum=0;
        int res=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(sum>=0){
                sum+=nums[i];
                if(sum>=res){
                    res=sum;
                }
            }
            if(sum<0){
                sum=0;
            }
        }
        return res;
    }
    public int kadaneMin(int[] nums){
        int sum=0;
        int res=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(sum<=0){
                sum+=nums[i];
                if(sum<=res){
                    res=sum;
                }
            }
            if(sum>0){
                sum=0;
            }
        }
        return res;
    }
}