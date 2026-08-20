class Solution {
    public boolean divideArray(int[] nums) {
        int n=nums.length;
        int pairs=n/2;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for(int x:hm.values()){
            if(x%2!=0) return false;
        }
        return true;
    }
}