class Solution {
    public int lastRemaining(int n) {
        int x=fun(1,1,n,true);
        return x;
    }
    public int fun(int start,int diff,int size,boolean flag){
        if(size==1){
            return start;
        }
        if(flag || size%2==1){
            start=start+diff;
        }
        return fun(start,diff*2,size/2,!flag);
    }
}