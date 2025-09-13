class Solution {
    public int lengthOfLastWord(String s) {
        String[] st=s.split(" ");
        int len=st.length; 
        int y=st[len-1].length();
        return y;
    }
}