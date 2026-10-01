class Solution {
    public boolean validPalindrome(String s) {
        int n=s.length();
        int l=0;
        int r=n-1;
        while(l<=r){
            if(s.charAt(l)!=s.charAt(r)){
                return isValid(s,l+1,r) || isValid(s,l,r-1);
            }
            l++;
            r--;
        }
        return true;
    }
    public boolean isValid(String s,int i,int j){
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}