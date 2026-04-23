class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        return Math.max(fxn(nums,0,n-2),fxn(nums,1,n-1));
    }
    public int fxn(int[] nums,int f,int l){
        int p1=0;
        int p2=0;
        for(int i=f;i<=l;i++){
            int take=nums[i]+p2;
            int notake=p1;
            int cur=Math.max(take,notake);
            p2=p1;
            p1=cur;
        }
        return p1;
    }
}