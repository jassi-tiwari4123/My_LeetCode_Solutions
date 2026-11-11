class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        int valid1 = Math.min(cost1, costBoth);
        int valid2 = Math.min(cost2, costBoth);
        if (costBoth >= (long)cost1 + cost2) {
            return (long)cost1 * need1 + (long)cost2 * need2;
        }

        long op = Math.min(need1, need2);
        
        long left1 = need1 - op;
        long left2 = need2 - op;

        long ans = (op * costBoth) + 
                   (left1 * valid1) + 
                   (left2 * valid2);
        
        return ans;
    }
}