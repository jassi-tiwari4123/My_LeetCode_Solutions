class Solution {
    public int maxLength(int[] nums) {
        int n=nums.length;
        int res=Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++){
            int prod=1;
            int lcm=1;
            int hcf=1;
            for(int j=i;j<n;j++){
                prod*=nums[j];
                if(j==i){
                    lcm=nums[i];
                    hcf=nums[i];
                }
                else{
                    lcm=lcm(lcm,nums[j]);
                    hcf=gcd(hcf,nums[j]);
                }
                if(prod==(lcm*hcf)) res=Math.max(res,j-i+1);
            }
        }
        return res;
    }
    public int lcm(int a,int b){
        return a/gcd(a,b)*b;
    }
    public int gcd(int a,int b){
        while(b!=0){
            int temp=a%b;
            a=b;
            b=temp;
        }
        return a;
    }
}