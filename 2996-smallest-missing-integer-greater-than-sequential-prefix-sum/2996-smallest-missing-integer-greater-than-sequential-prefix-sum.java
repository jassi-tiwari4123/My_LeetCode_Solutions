class Solution {
    public int missingInteger(int[] nums) {
        int n=nums.length;
        int sum=nums[0];
        int i=1;
        while(i<n && nums[i]==nums[i-1]+1){
            sum+=nums[i];
            i++;
        }
        while(true){
            boolean exist=false;
            for(int j=0;j<n;j++){
                if(sum==nums[j]){
                    exist=true;
                    break;
                }
            }
            if(!exist) return sum;
            sum++;
        }
    }
}