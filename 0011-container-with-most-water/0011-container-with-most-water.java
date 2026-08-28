class Solution {
    public int maxArea(int[] height) {
        int width=height.length;
        int res=Integer.MIN_VALUE;
        int left=0;
        int right=width-1;
        while(left<right){
            int area=Math.min(height[left],height[right])*(right-left);
            res=Math.max(res,area);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return res;
    }
    
}