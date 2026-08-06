class Solution {
    public int minBitFlips(int start, int goal) {
        int xor=start^goal;
        int res=0;
        while(xor>0){
            int rem=xor%2;
            res+=rem;
            xor/=2;
        }
        return res;
    }
}