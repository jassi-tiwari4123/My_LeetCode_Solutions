class Solution {
    public int lengthOfLastWord(String s) {
        // MY CODE
        // String[] st=s.split(" ");
        // int len=st.length; 
        // int y=st[len-1].length();
        // return y;

        s=s.trim(); //it will remove the spaces and trailing spaces
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                count++;
            }
            else{
            break;}
        }
        return count;
    }
}