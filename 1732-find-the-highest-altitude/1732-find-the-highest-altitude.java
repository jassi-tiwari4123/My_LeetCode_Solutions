class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int[] preSum=new int[n+1];
        preSum[0]=0;
        for(int i=1;i<=n;i++){
            preSum[i]=preSum[i-1]+gain[i-1];
        }
        int max=0;
        for(int i=0;i<=n;i++){
            if(preSum[i]>=max){
                max=preSum[i];
            }
        }
        return max;
    }
}