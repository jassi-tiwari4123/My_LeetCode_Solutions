class Solution {
    public int findMiddleIndex(int[] nums) {
        int n=nums.length;
        int[] pref=new int[n+1];
        int[] suff=new int[n+1];
        pref[0]=0;
        for(int i=1;i<=n;i++){
            pref[i]=pref[i-1]+nums[i-1];
        }
        for(int i=n-1;i>=0;i--){
            suff[i]=nums[i]+suff[i+1];
        }
        for(int i=0;i<n;i++){
            int left=pref[i];
            int right=suff[i+1];
            if(left==right){
                return i;
            }
        }
        return -1;

    }
}