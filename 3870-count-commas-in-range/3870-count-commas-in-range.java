class Solution {
    public int countCommas(int n) {
        if(len(n)<=3) return 0;
        int res=0;
        for(int i=1000;i<=n;i++){
            if(len(i)<7){
                res++;
            }
        }
        return res;
    }
    public int len(int n){
        int count=0;
        while(n>0){
            n/=10;
            count++;
        }
        // System.out.print(count);
        return count;
    }
}