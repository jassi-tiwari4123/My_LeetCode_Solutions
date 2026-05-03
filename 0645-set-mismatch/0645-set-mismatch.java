class Solution {
    public int[] findErrorNums(int[] nums) {
        //my approach
        int n=nums.length;
        int dup=-1;
        HashSet<Integer> s=new HashSet<>();
        for(int i=0;i<n;i++){
            if(s.contains(nums[i])){
                dup=nums[i];
            }
            s.add(nums[i]);
        }
        int mis=-1;
        for(int i=1;i<=n;i++){
            if(!s.contains(i)){
                mis=i;
            }
        }
        return new int[]{dup,mis};


        // int n=nums.length;
        // int dup=-1;
        // for(int i=0;i<n;i++){
        //     int idx=Math.abs(nums[i])-1;
        //     if(nums[idx]<0){
        //         dup=Math.abs(nums[i]);
        //     }
        //     else{
        //         nums[idx]*=-1;
        //     }
        // }
        // for(int i=0;i<n;i++){
        //     if(nums[i]>0){
        //         return new int[]{dup,i+1};
        //     }
        // }
        // return new int[]{-1,-1};
    }
}