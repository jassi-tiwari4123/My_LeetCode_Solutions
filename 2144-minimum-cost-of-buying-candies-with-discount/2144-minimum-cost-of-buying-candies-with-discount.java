class Solution {
    public int minimumCost(int[] cost) {
        int res=0;
        int n=cost.length;
        Arrays.sort(cost);
        for(int i=n-1;i>=0;i-=3){
            res+=cost[i];
            if(i-1>=0) res+=cost[i-1];
        }
        return res;
    }
}