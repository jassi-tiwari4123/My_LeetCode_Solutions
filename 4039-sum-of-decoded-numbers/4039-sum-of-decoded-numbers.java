class Solution {
    public int sumDecoded(long[] nums) {
        long mod=1000000007L;
        long sum=0;
        for(int i=0;i<nums.length;i++){
            long width=nums[i]%10;
            long d=nums[i]/10;
            long len=String.valueOf(d).length();
            long ylen=len-width;
            long power=1;
            for(int j=0;j<ylen;j++){
                power*=10;
            }
            long x=d/power;
            long y=d%power;
            long res=exp(x,y,mod);
            sum=(sum+res)%mod;
        }
        return (int) sum;
    }
    public long exp(long x,long y,long mod){
        long ans=1;
        while(y>0){
            if((y & 1) ==1){
                ans=(ans*x)%mod;
            }
            x=(x*x)%mod;
            y=y>>1;
        }
        return ans;
    }
}