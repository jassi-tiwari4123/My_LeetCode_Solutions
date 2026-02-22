class Solution {
    public int binaryGap(int n) {
        int x=n;
        String bin=Integer.toString(x,2);
        int len=bin.length();
        int l=0;
        int r=0;
        int maxLen=0;
        while(r<len){
            if(bin.charAt(l)=='1' && bin.charAt(r)=='1'){
                maxLen=Math.max(maxLen,r-l);
                l=r;
            }
            r++;
        }
        return maxLen;
    }
}