class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1) arr.add(i);
        }
        for(int i=1;i<arr.size();i++){
            int res=Math.abs(arr.get(i)-arr.get(i-1)-1);
            if(res<k){
                return false;
            }
        }
        return true;
    }
}