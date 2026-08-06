class Solution {
    public int maxJump(int[] stones) {
        int n=stones.length;
        if(n==2) return stones[1]-stones[0];
        int res=Integer.MIN_VALUE;
        for(int i=2;i<n;i++){
            res=Math.max(res,stones[i]-stones[i-2]);
        }
        return res;
    }
}