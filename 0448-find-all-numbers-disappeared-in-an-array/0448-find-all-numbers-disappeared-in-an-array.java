class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        List<Integer> res=new ArrayList<>();
        HashSet<Integer> s=new HashSet<>();
        for(int x:nums){
            s.add(x);
        }
        for(int i=1;i<=n;i++){
            if(!s.contains(i)){
                res.add(i);
            }
        }
        return res;
    }
}