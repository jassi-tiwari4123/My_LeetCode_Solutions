class Solution {
    public int maximumDifference(int[] nums) {
        int n=nums.length;
        int i=0;
        int res=0;
        while(i<n){
            int j=i+1;
            while(j>i && j<n){
                int diff=nums[j]-nums[i];
                res=Math.max(diff,res);
                j++;
            }
            i++;
        }
        return res==0?-1:res;
    }
}