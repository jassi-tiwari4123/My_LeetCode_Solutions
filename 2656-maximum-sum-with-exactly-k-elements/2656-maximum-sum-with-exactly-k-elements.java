class Solution {
    public int maximizeSum(int[] nums, int k) {
        int n=nums.length;
        int max=nums[0];
        for(int i=1;i<n;i++){
            if(max<=nums[i]){
                max=nums[i];
            }
        }
        int score=0;
        for(int i=0;i<k;i++){
           score+=max;
           max++;
        }
        return score;
    }
}