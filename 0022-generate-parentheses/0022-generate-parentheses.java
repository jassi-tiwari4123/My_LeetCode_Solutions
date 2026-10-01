class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        fxn("",n,res,0,0);
        return res;
    }
    public void fxn(String s,int n,List<String> res,int open,int close){
        if(s.length()==2*n){
            res.add(s);
            return;
        }
        if(open<n) fxn(s+'(',n,res,open+1,close);
        if(close<open) fxn(s+')',n,res,open,close+1);
        
    }
}