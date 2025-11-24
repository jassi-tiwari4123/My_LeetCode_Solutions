class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n=nums.length;
        int x=fun(0,n-1,nums);
        if(x>=0){
            return true;
        }
        return false;
    }
    public int fun(int i,int j,int[] nums){
        if(i==j){
            return nums[i];
        }
        int left=nums[i]-fun(i+1,j,nums);
        int right=nums[j]-fun(i,j-1,nums);
        int res=Math.max(left,right);
        return res;
    }
}