class Solution {
    public int heightChecker(int[] heights) {
        int res=0;
        int n=heights.length;
        int[] real=heights.clone();
        Arrays.sort(heights);
        for(int i=0;i<n;i++){
            if(real[i]!=heights[i]){
                res++;
            }
        }
        return res;
    }
}