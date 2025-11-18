class Solution {
    public void reverseString(char[] s) {
        int n=s.length-1;
        rev(s,0,n);
    }
    public void rev(char[]s,int i,int j){
        if(i>=j){
            return;
        }
        char temp=s[i];
        s[i]=s[j];
        s[j]=temp;
        rev(s,i+1,j-1);
        
    }
}