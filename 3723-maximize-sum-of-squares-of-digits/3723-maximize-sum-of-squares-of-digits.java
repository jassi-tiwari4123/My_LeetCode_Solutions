class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(sum>9*num) return "";
        StringBuilder res=new StringBuilder();
        int n=sum/9;
        int x=sum%9;
        for(int i=0;i<n;i++){
            res.append('9');
        }
        if(x>0) res.append(x);
        while(res.length()!=num){
            res.append('0');
        }
        return res.toString();
    }
}