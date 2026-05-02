class Solution {
    public int divide(int dividend, int divisor) {
        // BRUTE APPROACH - GIVES TLE

        // int res=0;
        // if(dividend==Integer.MIN_VALUE && divisor==-1) return Integer.MAX_VALUE;
        // int sign;
        // if ((dividend<0 && divisor>0) || (dividend>0 && divisor<0)) {
        //     sign=-1;
        // } 
        // else {
        //     sign=1;
        // }
        // long num=Math.abs((long)dividend);
        // long num1=Math.abs((long)divisor);
        // while(num>=num1){
        //     num-=num1;
        //     res++;
        // }
        // return sign*res;

        //WE WILL USE SHIFTS
         int res=0;
        if(dividend==Integer.MIN_VALUE && divisor==-1) return Integer.MAX_VALUE;
        int sign;
        if ((dividend<0 && divisor>0) || (dividend>0 && divisor<0)) {
            sign=-1;
        } 
        else {
            sign=1;
        }
        long num=Math.abs((long)dividend);
        long num1=Math.abs((long)divisor);
        while(num>=num1){
            long nDiv=num1;
            long prod=1;
            while(num>=(nDiv<<1)){
                nDiv<<=1;
                prod<<=1;
            }
            num-=nDiv;
            res+=prod;
        }
        return sign*res;
    }
}