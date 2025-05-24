class Solution {
    public String firstPalindrome(String[] words) {
        int count=0;
        for(int i=0;i<words.length;i++){
            String s=words[i];
            int j=0;
            int k=s.length()-1;
            boolean isPalindrome=true;
            while(j<=k){
                if(s.charAt(j)!=s.charAt(k)){
                    isPalindrome=false;
                    break;
                }
                else{
                    j++;
                    k--;
                }
            }
            if(isPalindrome){
                return s;
            }        
        }
        return "";
    }
}