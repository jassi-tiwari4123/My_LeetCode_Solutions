class Solution {
    public int getMaximumConsecutive(int[] coins) {
        Arrays.sort(coins);
        long res=0;
        for(int i=0;i<coins.length;i++){
            if(coins[i]>res+1){
                break;
            }
            res+=coins[i];
        }
        return (int) (res+1);
    }
}