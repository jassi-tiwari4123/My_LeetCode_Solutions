class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ls=new ArrayList<>();
        gp(n,0,0,"",ls);
        return ls;
    }
    public static void gp(int n,int open,int close,String ans,List ls){
        if(ans.length()==2*n || (open==n && close==n)){
            ls.add(ans);
            return;
        }
        if(open<n){
            gp(n,open+1,close,ans+"(",ls);
        }
        if(close<open){
            gp(n,open,close+1,ans+")",ls);
        }
    }
}