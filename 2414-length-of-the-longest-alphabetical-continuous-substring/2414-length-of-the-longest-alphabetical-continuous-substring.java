class Solution {
    public int longestContinuousSubstring(String s) {
        int n=s.length();
        int res=1;
        int cnt=1;
        for(int i=1;i<n;i++){
            if(s.charAt(i)==s.charAt(i-1)+1) cnt++;
            else{
                res=Math.max(res,cnt);
                cnt=1;
            }
        }
        res=Math.max(res,cnt);
        return res;
    }
}