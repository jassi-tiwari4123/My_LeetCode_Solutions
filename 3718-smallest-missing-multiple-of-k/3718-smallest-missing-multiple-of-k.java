class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n=nums.length;
        HashSet<Integer> hs=new HashSet<>();
        for(int x:nums){
            hs.add(x);
        }
        int res=k;
        for(int i=1;i<=i*k;i++){
            if(!hs.contains(i*k)) {
                res=i*k;
                break;
            }
        }
        return res;
    }
}