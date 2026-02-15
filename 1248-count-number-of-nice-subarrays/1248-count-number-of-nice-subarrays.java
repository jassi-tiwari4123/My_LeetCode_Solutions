class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums,k)-atMost(nums,k-1);
    }
    public int atMost(int[] nums,int k){
        int n=nums.length;
        int l=0;
        int r=0;
        int odd=0;
        int res=0;
        while(r<n){
            if(nums[r]%2==1){
                odd++;
            }
            while(odd>k){
                if(nums[l]%2==1) odd--;
                l++;
            }
            res+=r-l+1;
            r++;
        }
        return res;
    }
}