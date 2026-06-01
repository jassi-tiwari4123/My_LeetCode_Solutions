class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n=nums1.length;
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<n;i++){
            hs.add(nums1[i]);
        }
        HashSet<Integer> res=new HashSet<>();
        for(int i=0;i<nums2.length;i++){
            if(hs.contains(nums2[i])){
                res.add(nums2[i]);
            }
        }
        int[] arr=new int[res.size()];
        int i=0;
        for(int x:res){
            arr[i++]=x;
        }
        return arr;
    }
}