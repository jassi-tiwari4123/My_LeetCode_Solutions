class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int[] prefM=new int[n];
        prefM[0]=nums[0];
        for(int i=1;i<n;i++){
            prefM[i]=Math.max(prefM[i-1],nums[i]);
        }
        int[] suffMin=new int[n];
        suffMin[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            suffMin[i]=Math.min(suffMin[i+1],nums[i]);
        }
        int i=0;
        int res=-1;
        while(i<n){
            if(prefM[i]-suffMin[i]<=k){
                return i;
            }
            i++;
        }
        return res;
    }
}