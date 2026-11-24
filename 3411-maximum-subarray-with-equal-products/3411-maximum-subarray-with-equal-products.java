class Solution {
    public int maxLength(int[] nums) {
        int n=nums.length;
        int res=0;
        for(int i=0;i<n;i++){
            long prod=1;
            long gcd=nums[i];
            long lcm=nums[i];
            for(int j=i;j<n;j++){
                prod=prod*nums[j];
                gcd=GCD(gcd,nums[j]);
                lcm=(lcm*nums[j])/GCD(lcm,nums[j]);
                if(prod==gcd*lcm){
                    res=Math.max(res,j-i+1);
                }
            }
        }
        return res;
    }
    public long GCD(long a,long b){
        while(b!=0){
            long temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}