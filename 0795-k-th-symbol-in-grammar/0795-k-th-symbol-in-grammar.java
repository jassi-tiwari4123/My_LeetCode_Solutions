class Solution {
    public int kthGrammar(int n, int k) {
        // return Integer.bitCount(k - 1) & 1;      

        int ans=0;
        if(n==1 && k==1){
            return ans;
        }
        
        int length=(int)Math.pow(2,n-1);
        int mid=length/2;
        if(k<=mid){
            ans= kthGrammar(n-1, k);
        }
        else{
            ans=1-kthGrammar(n-1, k-mid);
        }
        return ans;        
    }
}

    