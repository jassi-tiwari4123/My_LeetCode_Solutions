class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        //agar kahi par remainder same aa gya kisi index par toh hum check karenge prev index jaha vo remainder aaya ho and then we will ceck the length greater than or eq to 2
        hm.put(0,-1);
        int preSum=0;
        for(int i=0;i<n;i++){
            preSum+=nums[i];
            int rem=preSum%k;
            if(hm.containsKey(rem)){
                int preInd=hm.get(rem);
                if(i-preInd>=2){
                    return true;
                }
            }
            else hm.put(rem,i);
        }
        return false;
    }
}