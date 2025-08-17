class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                even.add(nums[i]);
            }
            else{
                odd.add(nums[i]);
            }
        }
        for(int i=0;i<even.size();i++){
            nums[i]=even.get(i);
        }
        int index=even.size();
        for(int i=index;i<nums.length;i++){
            nums[i]=odd.get(i-index);
        }
        return nums;
    }
}