class Solution {
    public boolean canBeIncreasing(int[] nums) {
        //brute
        int n=nums.length;
        for(int i=0;i<n;i++){
            ArrayList<Integer> res=new ArrayList<>();
            for(int j=0;j<n;j++){
                if(i!=j){
                    res.add(nums[j]);
                }
            }
            if(isSorted(res)) return true;
        }
        return false;

    }
    public boolean isSorted(ArrayList<Integer> res){
        int n=res.size();
        for(int i=1;i<n;i++){
            if(res.get(i-1)>=res.get(i)){
                 return false;
            }
        }
        return true;
    }
}

//optimised
        // int n=nums.length;
        // int count=0;
        // for(int i=1;i<n;i++){
        //     if(nums[i-1]>=nums[i]){
        //         count++;
        //         if(count>1) return false;
        //         if(i>1 && nums[i]<=nums[i-2]){
        //             nums[i]=nums[i-1];
        //         }
        //     }
        // }
        // return true;