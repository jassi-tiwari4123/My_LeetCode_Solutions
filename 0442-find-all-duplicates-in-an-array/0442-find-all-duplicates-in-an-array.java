class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n=nums.length;
        List<Integer> res=new ArrayList<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> e:hm.entrySet()){
            int el=e.getKey();
            int freq=e.getValue();
            if(freq>1){
                res.add(el);
            }
        }
        return res;
    }
}