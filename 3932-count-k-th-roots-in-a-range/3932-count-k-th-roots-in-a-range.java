class Solution {
    public int countKthRoots(int l, int r, int k) {
        if(k==1) return r-l+1;
        int cnt=0;
        for(int i=0;;i++){
            long res=pow(i,k);
            if(res>r) break;
            if(res>=l && res<=r) cnt++;
        }
        return cnt;
    }

    public long pow(long base,int exp){
        if(exp==0) return 1;
        if(base==0) return 0;
        if(base==1) return 1;
        long res=1;
        while(exp>0){
            if(exp%2==1){
                res*=base;
            }
            base*=base;
            exp/=2;
        }
        return res;
    }
}