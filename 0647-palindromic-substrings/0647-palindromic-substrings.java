class Solution {
    public int countSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++) {
                if(isPalindrome(i,j,s)){
                    count++;
                }
            }
        }
        return count;
    }
    public boolean isPalindrome(int i,int j,String s){
        int first=i;
        int second=j;
        while(first<second){
            if(s.charAt(first)!=s.charAt(second)){
                return false;
            }
            first++;
            second--;
        }
        return true;
    }
}