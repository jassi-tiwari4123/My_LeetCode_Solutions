class Solution {
    public int minFlips(String s) {
        int n=s.length();
        s=s+s;
        StringBuilder op1=new StringBuilder();
        StringBuilder op2=new StringBuilder();
        for(int i=0;i<2*n;i++){
            op1.append((i%2==0)?"0":"1");
            op2.append((i%2==0)?"1":"0");
        }
        int l=0;
        int flip1=0;
        int flip2=0;
        int res=Integer.MAX_VALUE;
        for(int i=0;i<2*n;i++) {
            if(s.charAt(i)!=op1.charAt(i)){
                flip1++;
            }
            if(s.charAt(i)!=op2.charAt(i)){
                flip2++;
            }
            if(i-l+1>n){
                if(s.charAt(l)!=op1.charAt(l)){
                    flip1--;
                }
                if(s.charAt(l)!=op2.charAt(l)){
                    flip2--;
                }
                l++;
            }
            if(i-l+1==n){
                res=Math.min(res,Math.min(flip1,flip2));
            }
        }
        return res;
    }
}