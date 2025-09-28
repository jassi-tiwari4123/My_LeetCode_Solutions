class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int n=nums.length;
        if(n%2!=0){
            return false;
        }
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for(int k:hm.keySet()){
            if(hm.get(k)
            >2){
                return false;
            }
        }
        return true;
    }
}