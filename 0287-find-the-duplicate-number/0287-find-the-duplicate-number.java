class Solution {
    public int findDuplicate(int[] nums) {
        //here we can use set as constant space is required so we will treat it as linkedlist
        // fast and slow pointers
        int n=nums.length;
        int slow=nums[0];
        int fast=nums[0];
        do{
            slow=nums[slow];
            fast=nums[nums[fast]];
        }while(slow!=fast);
        slow=nums[0];//iterating again from start until reach fast=slow
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
        }
        return fast;
    }
}