class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int n=nums.length;
        int res=Integer.MAX_VALUE;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]<min){
                min=nums[i];
            }
            if(nums[i]>max){
                max=nums[i];
            }
        }
        // for(int i=0;i<=k;i++){
        //     for(int j=0;j<=k;j++){
        //         int diff=(max-j)-(min+i);
        //         res=Math.min(diff,res);
        //     }
            
        // }
        res=(max-k)-(min+k);
        return res<0?0:res;
    }
}