class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n=nums.length;
        long sum=0;
        long maximum=Long.MIN_VALUE;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<k;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            sum+=nums[i];
        }
        if(hm.size()==k){
            maximum=Math.max(maximum,sum);
        }
        for(int i=k;i<n;i++){
            int exclude=nums[i-k];
            sum-=exclude;
            if(hm.get(exclude)==1){
                hm.remove(exclude);
            }
            else{
                hm.put(exclude,hm.get(exclude)-1);
            }
            int include=nums[i];
            sum+=include;
            hm.put(include,hm.getOrDefault(include,0)+1);
            if(hm.size()==k){
                maximum=Math.max(maximum,sum);
            }
        }
        if(maximum==Long.MIN_VALUE){
            maximum=0;
        }
        return maximum;
    }
}