class Solution {
    public int[] sortedSquares(int[] nums) {
        // for(int i=0;i<nums.length;i++){
        //     nums[i]=nums[i]*nums[i];
        // }
        // for(int i=0;i<nums.length-1;i++){
        //     for(int j=i+1;j>0;j--){
        //         if(nums[j]<nums[j-1]){
        //             int temp=nums[j];
        //             nums[j]=nums[j-1];
        //             nums[j-1]=temp;
        //         }
        //         else{
        //             break;
        //         }
        //     }
        // }

        int l=0;
        int n=nums.length;
        int r=n-1;
        int pos=n-1;
        int[] res=new int[n];
        while(l<=r){
            int left=nums[l]*nums[l];
            int right=nums[r]*nums[r];
            if(left>right){
                res[pos]=left;
                l++;
            }
            else{
                res[pos]=right;
                r--;
            }
            pos--;
            
        }
        
        return res;    
    }
}