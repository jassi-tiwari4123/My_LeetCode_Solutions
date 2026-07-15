class Solution {
    public int gcdOfOddEvenSums(int n) {
        int even=(2*n*(n+1))/2;
        int odd=(n*n);
        int res=gcd(odd,even);
        return res;
    }
    public int gcd(int a,int b){
        while(a!=0){
            int temp=b%a;
            b=a;
            a=temp;
        }
        return b;
    }
}