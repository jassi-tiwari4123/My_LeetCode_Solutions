class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int med=nums[n/2];
        int res=0;
        for(int i=0;i<n;i++){
            res+=Math.abs(med-nums[i]);
        }
        return res;
    }
}