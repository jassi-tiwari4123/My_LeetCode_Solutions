class Solution {
    public int triangularSum(int[] nums) {
        int n=nums.length;
        if(nums.length==1){
            return nums[0];
        }
        while(n>1){
            ArrayList<Integer> arr=new ArrayList<>();
            for(int i=0;i<n-1;i++){
                int sum=(nums[i]+nums[i+1])%10;
                arr.add(sum);
            }
            for(int k=0;k<arr.size();k++){
                nums[k]=arr.get(k);
            }
            n--;
        }
        return nums[0];
    }
}