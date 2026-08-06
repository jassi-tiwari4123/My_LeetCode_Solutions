class Solution {
    public int smallestNumber(int n, int t) {
        int res=n;
        int prod=pro(res);
        if(prod%t==0) return res;
        while(prod%t!=0){
            res=res+1;
            prod=pro(res);
        }
        return res;
    }
    public int pro(int n){
        int prod=1;
        while(n>0){
            int dig=n%10;
            prod*=dig;
            n/=10;
        }
        return prod;
    }
}