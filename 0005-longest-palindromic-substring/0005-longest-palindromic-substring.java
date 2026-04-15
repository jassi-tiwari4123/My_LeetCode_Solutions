public class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        String res="";
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                String sub=s.substring(i,j+1);
                if(isPalindrome(sub) && sub.length()>res.length()){
                    res=sub;
                }
            }
        }
        return res;
    }
    public boolean isPalindrome(String x){
        int i=0;
        int j=x.length()-1;
        while(i<j){
            if(x.charAt(i)!=x.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
