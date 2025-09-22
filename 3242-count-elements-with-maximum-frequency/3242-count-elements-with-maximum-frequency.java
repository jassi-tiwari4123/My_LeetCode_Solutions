class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        int maxim=0;
        for(int i:hm.values()){
            maxim=Math.max(maxim,i);
        }
        int count=0;
        for(int i:hm.values()){
            if(i==maxim){
                count+=i;
            }
        }
        return count;
    }
}