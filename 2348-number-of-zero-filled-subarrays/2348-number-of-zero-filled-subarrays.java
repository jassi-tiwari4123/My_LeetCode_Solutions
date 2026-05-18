class Solution {
    public long zeroFilledSubarray(int[] nums) {
        //no of subaarays formula: n*(n+1)/2 for consecutive zeroes
        //so main motive is to find the consecutive zeroes and add the no of subarrays can be made by using formula into the main result
        long zero=0;
        int n=nums.length;
        long res=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                zero++;
                res+=zero;
            }
            else{
                zero=0;
            }
        }
        return res;
    }
}