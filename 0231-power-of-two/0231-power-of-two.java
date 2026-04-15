class Solution {
    public boolean isPowerOfTwo(int n) {
        // Brian Kernighan’s algorithm counts set bits
        //TC-O(1) SC-O(1) 
        // if(n<=0) return false;
        // return (n & (n-1))==0;


        //basic logic 
        if(n<=0) return false;
        int count=0;
        while(n!=0){
            int z=n & 1;
            if(z==1){
                count++;
            }
            n=n>>1;
        }
        return count==1;

        //brute TC-O(log n) SC-O(1) 
        // if(n<=0) return false;
        // while(n%2==0){
        //     n=n/2;
        // }
        // return n==1;
    }
}