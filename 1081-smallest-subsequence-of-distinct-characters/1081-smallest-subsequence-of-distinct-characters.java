class Solution {
    public String smallestSubsequence(String s) {
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        int[] lastInd=new int[26];
        for(int i=0;i<n;i++){
            lastInd[s.charAt(i)-'a']=i;
        }
        boolean[] seen=new boolean[26];
        for(int i=0;i<n;i++){
            if(seen[s.charAt(i)-'a']) continue;
            while(sb.length()>0 && s.charAt(i)<sb.charAt(sb.length()-1) && lastInd[sb.charAt(sb.length()-1)-'a']>i){
                char removed=sb.charAt(sb.length()-1);
                sb.deleteCharAt(sb.length()-1);
                seen[removed-'a']=false;
            }
            sb.append(s.charAt(i));
            seen[s.charAt(i)-'a']=true;
            
        }
        return sb.toString();
    }
}