class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int len=nums.length;
        int[] res=new int[len];
        int[] pref=new int[len];
        pref[0]=nums[0];
        for(int i=1;i<len;i++){
            pref[i]=pref[i-1]+nums[i];
        }
        int total=pref[len-1];
        for(int i=0;i<len;i++){
            int leftsum=(i>0)?pref[i-1]:0;
            int rightsum=total-pref[i];
            int leftpart=nums[i]*i-leftsum;
            int rightpart=rightsum-nums[i]*(len-i-1);
            res[i]=leftpart+rightpart;
        }
        return res;
    }
}