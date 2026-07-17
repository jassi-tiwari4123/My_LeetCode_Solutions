class Solution {
    public int minimumOperations(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int x:nums){
            if(x>0){
                hm.put(x,hm.getOrDefault(x,0)+1);
            }
        }
        return hm.size();
    }
}