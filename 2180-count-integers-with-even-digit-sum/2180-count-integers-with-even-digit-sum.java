class Solution {
    public int countEven(int num) {
        int res=0;
        for(int i=1;i<=num;i++){
            if(isEven(i)){
                res++;
            }
        }
        return res;
    }
    public boolean isEven(int n){
        if(n==0) return false;
        int sum=0;
        while(n>0){
            int dig=n%10;
            sum+=dig;
            n/=10;
        }
        return sum%2==0;
    }
}