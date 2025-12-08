class Solution {
    public int countPartitions(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        arr[0]=nums[0];
        for(int i=1;i<n;i++){
            arr[i]=arr[i-1]+nums[i];
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            int x=arr[n-1]-arr[i];
            int res=arr[i]-x;
            if(res%2==0){
                count++;
            }
        }
        return count;
    }
}