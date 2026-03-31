class Solution {
    public int passThePillow(int n, int time) {
        int cycle=n-1;
        int c=time%(2*cycle);
        if(c<cycle) return c+1;
        return n-(c-cycle);
    }
}