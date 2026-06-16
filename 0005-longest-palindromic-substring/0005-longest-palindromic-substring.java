public class Solution {
    public String longestPalindrome(String s) {
        //brute
        int n=s.length();
        String res="";
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                String sub=s.substring(i,j+1);
                if(isPalindrome(sub,0,sub.length()-1) && sub.length()>=res.length()){
                    res=sub;
                }
            }
        }
        return res;
    }
    public boolean isPalindrome(String s,int i,int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
