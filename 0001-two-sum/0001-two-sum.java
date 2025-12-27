class Solution {
    public int[] twoSum(int[] nums, int target) {
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]+nums[j]==target){
        //             return new int[] {i,j};
        //         }
        //     }
        // }
        // return new int[0];

        int n=nums.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            int y=target-nums[i];
            if(hm.containsKey(y)){
                return new int[]{hm.get(y),i};
            }
            hm.put(nums[i],i);
        }
        return new int[0]; 
    }
}