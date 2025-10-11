class Solution {
    public boolean isPowerOfFour(int n) {
        // if(n<=0) return false;
        // while(n%4==0){
        //     n=n/4;
        // }
        // return n==1;

        //checking whether the log4(n) is an integer
        if(n<=0) return false;
        double value=Math.log10(n)/Math.log10(4);
        return value==Math.floor(value);
    }
}