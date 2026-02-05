class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            int ind=i+nums[i];
            if(ind>0){
                ind=((ind%n)+n)%n;
                res[i]=nums[ind];
            }
            else if(ind==0){
                res[i]=nums[0];
            }
            else{
                ind=((ind%n)+n)%n;
                res[i]=nums[ind];
            }
        }
        return res;
    }
}