class Solution {
    public int mirrorDistance(int n) {
        int res=reverse(n);
        return Math.abs(n-res);
    }
    public int reverse(int n){
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum=sum*10+digit;
            n/=10;
        }
        return sum;
    }
}