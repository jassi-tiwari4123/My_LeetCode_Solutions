class Solution {
    public long minimalKSum(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        int cur=1;
        long sum=0;
        for(int i=0;i<n;i++){
            if(nums[i]<cur) continue;
            if(nums[i]>cur){
                long cnt=Math.min(k,nums[i]-cur);
                sum+=(cur+cur+cnt-1)*cnt/2;
                k-=cnt;
                cur+=cnt;
            }
            if(k==0) return sum;
            cur=nums[i]+1;
        }
        sum+=(cur+cur+k-1L)*k/2;
        return sum;

    }
}