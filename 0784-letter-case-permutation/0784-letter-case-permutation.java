class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> ans=new ArrayList<>();
        List<Character>op=new ArrayList<>();
        permute(s,0,ans,op);
        return ans;
    }
    public static void permute(String s,int ind,List<String> ans,List<Character> op){
        if(ind==s.length()){
            StringBuilder sb=new StringBuilder();
            for(char ch:op){
                sb.append(ch);
            }
            ans.add(new String(sb));
            return;
        }
        char c=s.charAt(ind);
        if(Character.isDigit(c)){
            op.add(c);
            permute(s,ind+1,ans,op);
            op.remove(op.size()-1);
        }
        else{
            op.add(Character.toLowerCase(c));
            permute(s,ind+1,ans,op);
            op.remove(op.size()-1);

            op.add(Character.toUpperCase(c));
            permute(s,ind+1,ans,op);
            op.remove(op.size()-1);
        }
    }
}