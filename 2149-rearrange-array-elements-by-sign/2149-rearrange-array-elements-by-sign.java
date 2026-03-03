class Solution {
    public int[] rearrangeArray(int[] nums) {
        // int[] ans=new int[nums.length];
        // int pos=0;
        // int neg=1;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]<0){
        //         ans[neg]=nums[i];
        //         neg=neg+2;
        //     }
        //     else{
        //         ans[pos]=nums[i];
        //         pos=pos+2;
        //     }
        // }
        // return ans;

        int n=nums.length;
        int[] res=new int[n];
        int Negind=1;
        int pos=0;
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                res[Negind]=nums[i];
                Negind+=2;
            }
            else{
                res[pos]=nums[i];
                pos+=2;
            }
        }
        return res;
    }
}