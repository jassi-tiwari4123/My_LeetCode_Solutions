class Solution {
    int mod=1000000007;
    public int numOfSubarrays(int[] arr) {
        //brute
        // int n=arr.length;
        // int cnt=0;
        // for(int i=0;i<n;i++){
        //     int sum=0;
        //     for(int j=i;j<n;j++){
        //         sum+=arr[j];
        //         if(sum%2!=0){
        //             cnt++;
        //         }
        //     }
        // }
        // return cnt;

        //optimised
        int n=arr.length;
        int[] pref=new int[n];
        pref[0]=arr[0];
        for(int i=1;i<n;i++){
            pref[i]=pref[i-1]+arr[i];
        }
        int cntEven=1;
        int cntOdd=0;
        int res=0;
        for(int i=0;i<n;i++){
            int x=pref[i];
            if(x%2==0){
                res=(res+cntOdd)%mod;
                cntEven++;
            }
            else{
                res=(res+cntEven)%mod;
                cntOdd++;
            }
        }
        return res;
    }
}