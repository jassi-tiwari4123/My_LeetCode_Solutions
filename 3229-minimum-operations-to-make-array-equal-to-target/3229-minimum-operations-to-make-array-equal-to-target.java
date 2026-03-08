class Solution {
    public long minimumOperations(int[] nums, int[] target) {
        int n=nums.length;
        long res=0;
        int[] diff=new int[n];
        for(int i=0;i<n;i++){
            diff[i]=target[i]-nums[i];
        }
        int cur=0;
        int prev=0;
        for(int i=0;i<n;i++){
            cur=diff[i];
            if((cur<0 && prev>0) || (cur>0 && prev<0)){
                res+=Math.abs(cur);
            }
            else if(Math.abs(prev)<Math.abs(cur)){
                res+=Math.abs(prev-cur);
            }
            prev=cur;
        }
        return res;
    }
}