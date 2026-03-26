class Solution {
    public List<String> validStrings(int n) {
        List<String> res=new ArrayList<>();
        fxn(n,"",res);
        return res;
    }
    public void fxn(int n,String part,List<String> res){
        if(part.length()==n){
            res.add(part);
            return;
        }
        fxn(n,part+"1",res);
        if(part.length()==0|| part.charAt(part.length()-1)!='0'){
            fxn(n,part+"0",res);
        }
    }
}