class Solution {
    public int countGoodRotations(int[] nums) {
        int n=nums.length;
        long[] pref=new long[n];
        pref[0]=nums[0];
        for(int i=1;i<n;i++){
            pref[i]=nums[i]+pref[i-1];
        }
        long total=pref[n-1];
        int cnt=0;
        int half=n/2;
        for(int i=0;i<n;i++){
            int end=i+half-1;
            long first;
            if(end<n){
                if(i==0){
                    first=pref[end];
                }
                else{
                    first=pref[end]-pref[i-1];
                }
            }
            else {
                first=pref[n-1]-pref[i-1];
                end=end-n;
                first+=pref[end];
            }
            long second=total-first;
            if(first>second) cnt++;
            
        }
        return cnt;
    }
}