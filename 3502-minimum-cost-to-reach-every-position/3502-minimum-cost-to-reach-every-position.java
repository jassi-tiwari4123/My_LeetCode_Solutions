class Solution {
    public int[] minCosts(int[] cost) {
        int n=cost.length;
        int[] prefMin=new int[n];
        prefMin[0]=cost[0];
        for(int i=1;i<n;i++){
            prefMin[i]=Math.min(prefMin[i-1],cost[i]);
        }
        return prefMin;
    }
}