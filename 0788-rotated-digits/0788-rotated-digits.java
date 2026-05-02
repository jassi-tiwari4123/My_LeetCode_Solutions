class Solution {
    public int rotatedDigits(int n) {
        //brute force but can be solved using digit dp
    //     int res=0;
    //     for(int i=1;i<=n;i++){
    //         if(isValid(i)) res++;
    //     }
    //     return res;
    // }
    // public boolean isValid(int n){
    //     boolean change=false;
    //     while(n>0){
    //         int dig=n%10;
    //         if(dig==2 || dig==5 || dig==6 || dig==9){
    //             change=true;
    //         }
    //         if(dig==3 || dig==4 || dig==7){
    //             return false;
    //         }
    //         n/=10;
    //     }
    //     return change;


        //digit dp
        char[]digits = String.valueOf(n).toCharArray();
        int[][][]dp=new int[digits.length][2][2];
        for(int i=0;i<digits.length;i++) {
            for(int j=0;j<2;j++) {
                Arrays.fill(dp[i][j],-1);
            }
        }
        return fxn(0,1,0,digits,dp);
    }
    public int fxn(int pos,int limit,int change,char[] digits,int[][][]dp) {
        if (pos==digits.length) {
            return change==1?1:0;
        }
        if (dp[pos][limit][change]!=-1){
            return dp[pos][limit][change];
        }
        int restrict=(limit==1)?digits[pos]-'0':9;
        int res=0;
        for (int d=0;d<=restrict;d++) {  
            if (d==3 || d==4 || d==7) continue;
            int newChanged = change;
            if (d==2 || d==5 || d==6 || d==9) {
                newChanged = 1;
            }
            res+=fxn(pos + 1,(limit==1 && d==restrict)?1:0,newChanged,digits,dp);
        }
        return dp[pos][limit][change]=res;
    }
}