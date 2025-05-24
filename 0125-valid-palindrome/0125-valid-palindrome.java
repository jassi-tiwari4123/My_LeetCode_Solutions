class Solution {
    public boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            char l=s.charAt(i);
            char r=s.charAt(j);
            if(!Character.isLetterOrDigit(l)){
                i++;
            }
            else if(!Character.isLetterOrDigit(r)){
                j--;
            }
            else if(Character.toLowerCase(l)!=Character.toLowerCase(r)){
                return false;
            }
            else{
                i++;
                j--;
            }
        }
        return true;
    }
}