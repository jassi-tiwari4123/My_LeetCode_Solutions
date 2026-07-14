class Solution {
    public boolean isThree(int n) {
        if(n==1 || n==2 || n==3) return false;
        int res=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                res++;
            }
        }
        return res==3;
    }
}