class Solution {
    public int strStr(String haystack, String needle) {
        int n1=haystack.length();
        int n2=needle.length();
        int i=0;
        while(i<=(n1-n2)){
            int j=0;
            while(j<n2 && (needle.charAt(j)==haystack.charAt(i+j))){
                j++;
            }
            if(j==n2){
                return i;
            }
            i++;
        }
        return -1;
    }
}