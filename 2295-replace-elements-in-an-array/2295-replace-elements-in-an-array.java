class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        int n=nums.length;
        // for(int i=0;i<n;i++){
        //     for(int[] o:operations){
        //         int el=o[0];
        //         int ch=o[1];
        //         if(nums[i]==el){
        //             nums[i]=ch;
        //         }
        //     }
        // }
        // return nums;

        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=operations.length-1;i>=0;i--){
            int oV=operations[i][0];
            int nV=operations[i][1];
            hm.put(oV,hm.getOrDefault(nV,nV));
        }
        for(int i=0;i<n;i++){
            if(hm.containsKey(nums[i])){
                nums[i]=hm.get(nums[i]);
            }
        }
        return nums;
    }
}