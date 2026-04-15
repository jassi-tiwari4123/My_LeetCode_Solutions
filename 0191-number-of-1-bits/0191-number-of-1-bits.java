class Solution {
    public int hammingWeight(int n) {
        String x=Integer.toBinaryString(n);
        long len=x.length();
        int cnt=0;
        for(int i=0;i<len;i++){
            if(x.charAt(i)=='1'){
                cnt++;
            }
        }
        return cnt;
    }
}