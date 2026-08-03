class Solution {
    public int countValidPrefixes(String s) {
        int n=s.length();
        int count=0;
        int one=0;
        int zero=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='0'){
                zero++;
            }
            else{
                one++;
            }
            if(Math.abs(one-zero)<=1) count++;
        }
        return count;
    }
}