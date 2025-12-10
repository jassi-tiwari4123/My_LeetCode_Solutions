class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<index.length;i++){
            arr.add(index[i],nums[i]);
        }
        int[] a=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            a[i]=arr.get(i);
        }
        return a;
    }
}