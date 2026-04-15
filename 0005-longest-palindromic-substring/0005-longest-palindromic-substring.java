public class Solution {
    public String longestPalindrome(String s) {
        //brute force (o^3)
        int n=s.length();
        String res="";
        int start=0,len=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                // String sub=s.substring(i,j+1);
                if(isPalindrome(s,i,j) && (j-i+1)>len){
                    start=i;
                    len=j-i+1;
                }
            }
        }
        return s.substring(start,len+start);
    }
    public boolean isPalindrome(String x,int i,int j){
        while(i<j){
            if(x.charAt(i)!=x.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
