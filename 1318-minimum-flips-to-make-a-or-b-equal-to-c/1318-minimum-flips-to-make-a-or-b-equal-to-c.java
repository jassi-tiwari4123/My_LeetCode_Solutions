class Solution {
    public int minFlips(int a, int b, int c) {
        int res=0;
        for(int i=0;i<32;i++){
            int bit1=(a>>i) & 1;
            int bit2=(b>>i) & 1;
            int bit3=(c>>i) & 1;
            if(bit3==0){
                if((bit1 | bit2)==1) res+=bit1+bit2;
            }
            else{
                if((bit1 | bit2)==0) 
                res++;
            }
        }
        return res;
    }
}