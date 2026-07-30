class Solution {
    public int minimumPushes(String word) {
        int n=word.length();
        if(n<8) return n;
        int res=0;
        int i=1;
        while(n>0){
            int dig=Math.min(8,n);
            res+=dig*i;
            i++;
            n=n-dig;
        }
        return res;
    }
}