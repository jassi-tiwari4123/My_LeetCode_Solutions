class Solution {
    public int rotatedDigits(int n) {
        int res=0;
        for(int i=1;i<=n;i++){
            if(isValid(i)) res++;
        }
        return res;
    }
    public boolean isValid(int n){
        boolean change=false;
        while(n>0){
            int dig=n%10;
            if(dig==2 || dig==5 || dig==6 || dig==9){
                change=true;
            }
            if(dig==3 || dig==4 || dig==7){
                return false;
            }
            n/=10;
        }
        return change;
    }
}