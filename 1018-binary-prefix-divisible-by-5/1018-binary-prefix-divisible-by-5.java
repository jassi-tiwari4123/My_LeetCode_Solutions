class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        int n=nums.length;
        List<Boolean> ls=new ArrayList<>();
        int res=0;
        for(int i=0;i<n;i++){
            res=(res*2+nums[i])%5;
            if(res==0) ls.add(true);
            else ls.add(false);
        }
        return ls;
    }
}