class Solution {
    public boolean canAliceWin(int n) {
        int i=10;
        int alice=1;
        while(i>0 && n>=i){
            n=n-i;
            i--;
            alice*=(-1);
        }
        return alice==-1;
    }
}