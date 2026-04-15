class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        int maxim=0;
        int count=0;
        for(Map.Entry<Integer,Integer> e:hm.entrySet()){
            int el=e.getKey();
            int fr=e.getValue();
            if(maxim<fr){
                maxim=fr;
                count=fr;
            }
            else if(maxim==fr){
                count+=fr;
            }
        }
        return count;
    }
}