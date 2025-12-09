class Solution {
    public int specialTriplets(int[] nums) {
        int Mod=1000000007;
        int n=nums.length;
        if(n<=2){
            return 0;
        }
        HashMap<Integer,Integer> lhm=new HashMap<>();
        HashMap<Integer,Integer> rhm=new HashMap<>();
        for(int i=0;i<n;i++){
            rhm.put(nums[i],rhm.getOrDefault(nums[i],0)+1);
        }
        long res=0;
        for(int i=0;i<n;i++){
            int val=nums[i];
            rhm.put(val,rhm.get(val)-1);
            long left=lhm.getOrDefault(2*val,0);
            long right=rhm.getOrDefault(2*val,0);
            res=(res+(left*right)%Mod)%Mod;
            lhm.put(val,lhm.getOrDefault(val,0)+1);
        }
        return (int)res;
    }
}