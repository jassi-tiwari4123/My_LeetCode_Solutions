class Solution {
    public boolean uniformArray(int[] nums) {
        int n=nums.length;
        if(n<=1) return true;
        int val=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]<val){
                val=nums[i];
            }
        }
        if(val%2!=0) return true;
        for(int i=0;i<n;i++){
            if(nums[i]%2!=0) return false;
        }
        return true;
    }
}