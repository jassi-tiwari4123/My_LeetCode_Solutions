class Solution {
    public int reverseBits(int n) {
        int res=0;
        for(int i=0;i<32;i++){
            res<<=1;
            res|=(n&1);
            n>>=1;
        }
        return res;

        // String bin=Integer.toBinaryString(n);
        // bin=String.format("%32s",bin).replace(' ','0');
        // String rev=new StringBuilder(bin).reverse().toString();
        // long res=Long.parseLong(rev,2);
        // return (int) res;
    }
}