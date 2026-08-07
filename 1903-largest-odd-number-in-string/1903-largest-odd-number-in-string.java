class Solution {
    public String largestOddNumber(String num) {
        int n=num.length();
        String res="";
        int i=n-1;
        while(i>=0){
            char ch=num.charAt(i);
            if((ch-'0')%2!=0){
                res=num.substring(0,i+1);
                break;
            }
            else i--;
        }
        return res;
    }
}