class Solution {
    public int minOperations(int[] nums, int x) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        int remaining=sum-x;
        if(remaining==n) return n;
        if(remaining<0) return -1;
        int left=0;
        int res=-1;
        int remSum=0;
        for(int i=0;i<n;i++){
            remSum+=nums[i];
            while(remSum>remaining && left<=i){
                remSum-=nums[left];
                left++;
            }
            if(remSum==remaining){
                res=Math.max(res,i-left+1);
            }
        }
        return res==-1?-1:n-res;
    }
}