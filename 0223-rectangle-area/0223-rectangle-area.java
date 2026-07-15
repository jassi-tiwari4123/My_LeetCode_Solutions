class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1=Math.abs(ax2-ax1)*Math.abs(ay2-ay1);
        int area2=Math.abs(bx2-bx1)*Math.abs(by2-by1);
        int x1=Math.max(ax1,bx1);
        int x2=Math.min(ax2,bx2);
        int y1=Math.max(ay1,by1);
        int y2=Math.min(ay2,by2);
        int areaOverlap=Math.max(0,x2-x1)*Math.max(0,y2-y1);
        return area1+area2-areaOverlap;
    }
}