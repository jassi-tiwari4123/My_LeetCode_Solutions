class Solution {
    public int missingNumber(int[] nums) {
        for(int i=0;i<=nums.length+1;i++){
            boolean flag=false;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==i){
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                return i;
            }
        }
        return -1;
    }
}