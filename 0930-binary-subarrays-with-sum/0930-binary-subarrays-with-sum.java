class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        //brute force o(n^2)
        // int n=nums.length;
        // int count=0;
        // for(int i=0;i<n;i++){
        //     int sum=0;
        //     for(int j=i;j<n;j++){
        //         sum+=nums[j];
        //         if(sum==goal){
        //             count++;
        //         }
        //     }
        // }
        // return count;

        //optimal
        return atMost(nums,goal)-atMost(nums,goal-1);
    }
    public int atMost(int[] nums,int goal){
        if(goal<0) return 0;
        int n=nums.length;
        int l=0;
        int r=0;
        int res=0;
        int sum=0;
        while(r<n){
            sum+=nums[r];
            while(sum>goal){
               
                    sum-=nums[l];
                    l++;
                
            }
            res+=r-l+1;
            r++;
        }
        return res;
    }
}