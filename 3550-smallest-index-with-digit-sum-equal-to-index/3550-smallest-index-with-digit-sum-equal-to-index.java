class Solution {
    public int smallestIndex(int[] nums) {
        int n=nums.length;
        int res=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]<10){
                if(nums[i]==i) res=Math.min(res,i);
            }
            else{
                int sum=SumOfDig(nums[i]);
                if(sum==i) res=Math.min(res,i);
            }
        }
        return res==Integer.MAX_VALUE?-1:res;
    }
    public int SumOfDig(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}