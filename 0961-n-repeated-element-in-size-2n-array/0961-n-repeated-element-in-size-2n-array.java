class Solution {
    public int repeatedNTimes(int[] nums) {
        int len=nums.length;
        int n=len/2;
        int res=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<len;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() == n) {
                res = entry.getKey();
            }
        }
        return res;
    }
}