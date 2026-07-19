class Solution {
    public String removeDuplicateLetters(String s) {
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        int[] lastInd=new int[26];
        boolean[] seen=new boolean[26];
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            lastInd[ch-'a']=i;
        }
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(seen[ch-'a']) continue;
            while(sb.length()>0 && sb.charAt(sb.length()-1)>ch && lastInd[sb.charAt(sb.length()-1)-'a']>i){
                char remove=sb.charAt(sb.length()-1);
                sb.deleteCharAt(sb.length()-1);
                seen[remove-'a']=false;
            }
            sb.append(ch);
            seen[ch-'a']=true;

        }
        return sb.toString();
    }
}