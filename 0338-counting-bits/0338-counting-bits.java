class Solution {
    public int[] countBits(int n) {
        int[] res=new int[n+1];
        for(int i=0;i<=n;i++){
            res[i]=toBin(i);
        }
        return res;
    }
    public int toBin(int n){
        int cnt=0;
        while(n>0){
            n=n&(n-1);
            cnt++;
        }
        return cnt;
    }
}