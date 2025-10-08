class Solution {
    public boolean isPowerOfTwo(int n) {
        // Brian Kernighan’s algorithm counts set bits 
        if(n<=0) return false;
        return (n & (n-1))==0;
    }
}