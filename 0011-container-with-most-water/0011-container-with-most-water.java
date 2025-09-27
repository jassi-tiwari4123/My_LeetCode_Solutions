class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int maxarea=0;
        while(l<r){
            int curarea=Math.min(height[l],height[r])*(r-l);
            maxarea=Math.max(maxarea,curarea);
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return maxarea;
    }
}