class Solution {
    public int countPrimeSetBits(int left, int right) {
        int res=0;
        for(int i=left;i<=right;i++){
            int count=0;
            int x=i;
            while(x>0){
                if((x & 1)==1) count++;
                x=x>>1;
            }
            if(isPrime(count)) res++;
        }
        return res;

    }
    public boolean isPrime(int x){
        if(x<=1) return false;
        for(int i=2;i*i<=x;i++){
            if(x%i==0) return false;
        } 
        return true;
    }
}