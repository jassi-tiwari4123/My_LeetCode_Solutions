class Solution {
    public List<Integer> findLonely(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        List<Integer> res=new ArrayList<>();
        for(int num:nums){
            if(hm.get(num)==1 && !hm.containsKey(num-1) && !hm.containsKey(num+1)){
                res.add(num);
            }
        }
        return res;
    }
}