class Solution {
    public List<Integer> lastVisitedIntegers(int[] nums) {
        List<Integer> seen=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]>=0){
                seen.add(nums[i]);
                count=0;
            }
            else{
                count++;
                
                if(count>seen.size()){
                    ans.add(-1);
                }
                else{
                    ans.add(seen.get(seen.size()-count));
                }
            }

        }
        return ans;
    }
}