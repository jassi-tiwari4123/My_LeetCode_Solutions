class Solution {
    public int findClosest(int x, int y, int z) {
        int distX=Math.abs(x-z);
        int distY=Math.abs(y-z);
        int res=Math.min(distX,distY);
        if(distX==distY){
            return 0;
        }
        if(res==distX) return 1;
        return 2;
    }
}