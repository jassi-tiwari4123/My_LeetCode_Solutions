class Solution {
    public boolean isPowerOfTwo(int n) {
        // Brian Kernighan’s algorithm counts set bits 
        // if(n<=0) return false;
        // return (n & (n-1))==0;


        //basic logic
        // if(n<=0) return false;
        // int count=0;
        // while(n!=0){
        //     int z=n & 1;
        //     if(z==1){
        //         count++;
        //     }
        //     n=n>>1;
        // }
        // if(count!=1){
        //     return false;
        // }
        // return true;

        //brute O(log n)
        if(n<=0) return false;
        while(n%2==0){
            n=n/2;
        }
        return n==1;
    }
}