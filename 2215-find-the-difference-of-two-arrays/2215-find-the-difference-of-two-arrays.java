class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> one=new ArrayList<>();
        List<Integer> two=new ArrayList<>();
        HashSet<Integer> hs1=new HashSet<>();
        HashSet<Integer> hs2=new HashSet<>();
        for(int x:nums1){
            hs1.add(x);
        }
        for(int x:nums2){
            hs2.add(x);
        }
        for(int x:hs1){
            if(!hs2.contains(x)){
                one.add(x);
            }
        }
        for(int x:hs2){
            if(!hs1.contains(x)){
                two.add(x);
            }
        }
        res.add(one);
        res.add(two);
        return res;
    }
}