class Solution {
    public int maxProduct(int n) {
        int len=(int)(Math.log(n)/Math.log(10))+1;
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        while(n>0){
            int dig=n%10;
            if(dig>=max1){
                max2=max1;
                max1=dig;
            }
            else if(dig>=max2){
                max2=dig;
            }
            n/=10;
        }
        return max1*max2;
    }
}