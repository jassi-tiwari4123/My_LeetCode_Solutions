class Solution {
    public int averageValue(int[] nums) {
        int n=nums.length;
        int sum=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0 && nums[i]%3==0){
                sum+=nums[i];
                count++;
            }
        }
        return count!=0?sum/count:0;
    }
}