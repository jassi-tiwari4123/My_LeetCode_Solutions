class Solution {
    public int sumOfPrimesInRange(int n) {
        int num=n;
        int rev=reverse(num);
        int sum=0;
        for(int i=Math.min(num,rev);i<=Math.max(num,rev);i++){
            if(isPrime(i)){
                sum+=i;
            }
        }
        return sum;
    }
    public int reverse(int n){
        int res=0;
        while(n>0){
            int dig=n%10;
            res=res*10+dig;
            n/=10;
        }
        return res;
    }
    public boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
}