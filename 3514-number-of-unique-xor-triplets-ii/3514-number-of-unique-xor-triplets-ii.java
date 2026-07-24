class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n=nums.length;
        Set<Integer> res=new HashSet<>();
        Set<Integer> pairs=new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                pairs.add(nums[i]^nums[j]);
            }
        }
        int n1=pairs.size();
        for(int x:pairs){
            for(int j=0;j<n;j++){
                res.add(x^nums[j]);
            }
        }
        return res.size();
    }
}