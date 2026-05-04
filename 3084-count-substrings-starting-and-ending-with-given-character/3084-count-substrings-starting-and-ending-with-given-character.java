class Solution {
    public long countSubstrings(String s, char c) {
        int count=0;
        int n=s.length();
        long res=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)==c){
                count++;
                res=res+count;
            }
        }
        return res;
    }
}