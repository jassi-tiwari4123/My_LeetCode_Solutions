class Solution {
    public long sumAndMultiply(int n) {
        long sum=0;
        int rev=0;
        while(n>0){
            int dig=n%10;
            if(dig!=0){
                rev=rev*10+dig;
                sum+=dig;
            }
            n/=10;
        }
        int num=0;
        while(rev>0){
            int dig=rev%10;
            num=num*10+dig;
            rev=rev/10;
        }
        return (long)(num*sum);
    }
}