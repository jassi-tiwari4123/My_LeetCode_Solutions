class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int index=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }
        //if no break point found
        if(index==-1){
            reverse(nums,0,n-1);
            return;
        }
        //finding the element just greater than the nums[index]
        for(int i=n-1;i>index;i--){
            if(nums[i]>nums[index]){
                swap(nums,i,index);
                break;
            }
        }
        reverse(nums,index+1,n-1);
    }
    public void swap(int[] nums,int i,int index){
        int temp=nums[i];
        nums[i]=nums[index];
        nums[index]=temp;
    }
    public void reverse(int[] nums,int first,int last){
        while(first<last){
            swap(nums,first,last);
            first++;
            last--;
        }
    }
}