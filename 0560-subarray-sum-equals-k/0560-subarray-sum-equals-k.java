class Solution {
    public int subarraySum(int[] nums, int k) {
        // int n=nums.length;
        // int preSum=0;
        // int count=0;
        // HashMap<Integer,Integer> hm=new HashMap<>();
        // hm.put(0,1);
        // for(int i=0;i<n;i++){
        //     preSum+=nums[i];
        //     int rem=preSum-k;
        //     if(hm.containsKey(rem)){
        //         count+=hm.get(rem);
        //     }
        //     hm.put(preSum,hm.getOrDefault(preSum,0)+1);
        // }
        // return count;


        int n=nums.length;
        int preSum=0;
        int count=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,1);
        for(int i=0;i<n;i++){
            preSum+=nums[i];
            if(hm.containsKey(preSum-k)){
                count+=hm.get(preSum-k);
            }
            hm.put(preSum,hm.getOrDefault(preSum,0)+1);
        }
        return count;
    }
}