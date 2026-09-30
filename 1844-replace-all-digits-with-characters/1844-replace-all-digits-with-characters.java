class Solution {
    public String replaceDigits(String s) {
        int n=s.length();
        char[] ch=s.toCharArray();
        StringBuilder res=new StringBuilder();
        for(int i=0;i<n;i++){
            if(Character.isLetter(ch[i])){
                res.append(ch[i]);
            }
            else{
                int x=ch[i]-'0';
                res.append((char)(ch[i-1]+x));
            }
        }
        return res.toString();
    }
}