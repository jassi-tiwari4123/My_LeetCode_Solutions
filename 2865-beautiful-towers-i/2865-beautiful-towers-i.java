class Solution {
    public long maximumSumOfHeights(int[] heights) {
        int n=heights.length;
        long res=0;
        for(int i=0;i<n;i++){
            long sum=heights[i];
            int x=heights[i];
            for(int j=i-1;j>=0;j--){
                x=Math.min(x,heights[j]);
                sum+=x;
            }
            x=heights[i];
            for(int j=i+1;j<n;j++){
                x=Math.min(x,heights[j]);
                sum+=x;
            }
            res=Math.max(res,sum);
        }
        return res;
    }
}