class Solution {
    public String makeFancyString(String s) {
        //while traversing the string we will check during making result that last two characters added in the result is not the same as the current character
        StringBuilder sb=new StringBuilder();
        int n=s.length();
        for(int i=0;i<n;i++){
            if(i>=2 && s.charAt(i-1)==s.charAt(i) && s.charAt(i-2)==s.charAt(i)) continue;
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}