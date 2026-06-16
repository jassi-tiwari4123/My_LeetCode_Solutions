class Solution {
    public String processStr(String s) {
        StringBuilder sb=new StringBuilder();
        int n=s.length();
        char[] ch=s.toCharArray();
        for(int i=0;i<n;i++){
            if(ch[i]=='*'){
                if(sb.length()>0) sb.deleteCharAt(sb.length()-1);
            }
            else if(ch[i]=='#'){
                sb.append(sb.toString());
            }
            else if(ch[i]=='%'){
                sb.reverse();
            }
            else{
                sb.append(ch[i]);
            }
        }
        return sb.toString();
    }
}