class Solution {
    public int singleNumber(int[] nums) {
        // int candidate=nums[0];
        // int count=1;
        // int x=0;
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i]!=candidate){
        //         candidate=nums[i];
        //         count=0;
        //     }
        //     if(nums[i]==candidate){
        //         count++;
        //         candidate=nums[i];
        //     }
        //     if(count>=2){
        //         candidate=nums[i];
        //     }
        // }
        // return candidate;

        // if numbers are repeating twice then only
        int XOR=0;
        for(int i=0;i<nums.length;i++){
            XOR=XOR^nums[i];
        }
        return XOR;
    }
}