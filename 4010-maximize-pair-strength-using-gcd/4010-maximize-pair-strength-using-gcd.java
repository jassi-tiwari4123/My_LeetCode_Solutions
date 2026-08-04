class Solution {
    public long maxPairStrength(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        long max=Long.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                long prod=1L*nums[i]*nums[j];
                long gcd=gcd(nums[i],nums[j]);
                max=Math.max(max,prod/(gcd*gcd));
            }
        }
        return max;
    }
    public long gcd(long a,long b){
        while(b!=0){
            long temp=a%b;
            a=b;
            b=temp;
        }
        return a;
    }
}