class Solution {
    public int findFinalValue(int[] nums, int original) {
        int n=nums.length;
        int found=original;
        boolean change=true;
        while(change){
            change=false;
            for(int i=0;i<n;i++){
                if(found==nums[i]){
                    found=found*2;
                    change=true;
                    break;
                }
            }
        }
        return found;
    }
}