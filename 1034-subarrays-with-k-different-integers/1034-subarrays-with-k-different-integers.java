class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atmost(nums,k)-atmost(nums,k-1);
    }
    public int atmost(int[] nums,int k){
            int left=0;
        int count=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            while(hm.size()>k){
                if(hm.get(nums[left])==1){
                    hm.remove(nums[left]);
                }
                else{
                    hm.put(nums[left],hm.get(nums[left])-1);
                }
                left++;
            }
            count+=(i-left+1);
        }
        return count;
    }
}