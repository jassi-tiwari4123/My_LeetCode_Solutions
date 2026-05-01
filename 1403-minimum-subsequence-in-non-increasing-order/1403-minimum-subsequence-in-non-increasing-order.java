class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        // as we want the maximum sum + less no of elements so sort it first
        Arrays.sort(nums);
        int n=nums.length;
        List<Integer> ls=new ArrayList<>();
        int total=0;
        for(int i=0;i<n;i++){
            total+=nums[i];
        }
        int sum=0;
        for(int i=n-1;i>=0;i--){
            sum+=nums[i];
            ls.add(nums[i]);
            if(sum>total-sum){
                break;
            }
        }
        return ls;
    }
}