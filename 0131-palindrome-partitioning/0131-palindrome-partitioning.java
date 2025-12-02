class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        List<String> op=new ArrayList<>();
        check(s,ans,op,0);
        return ans;
    }
    public void check(String s,List<List<String>> ans,List<String> op,int index){
        if(index==s.length()){
            ans.add(new ArrayList<>(op));
            return;
        }
        for(int i=index;i<s.length();i++){
            if(isPalindrome(s,index,i)){
                op.add(s.substring(index,i+1));
                check(s,ans,op,i+1);
                op.remove(op.size()-1);
            }
        }
    }
    public boolean isPalindrome(String s,int start,int end){
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}