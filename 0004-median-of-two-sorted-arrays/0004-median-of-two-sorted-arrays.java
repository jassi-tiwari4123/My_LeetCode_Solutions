class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    //     int[] arr=new int[nums1.length+nums2.length];
    //     for(int i=0;i<nums1.length;i++){
    //         arr[i]=nums1[i];
    //     }
    //     for(int i=0;i<nums2.length;i++){
    //         arr[nums1.length+i]=nums2[i];
    //     }
    //     Arrays.sort(arr);
    // //     //median
    //     double median;
    //     if(arr.length%2==0){
    //         median=(arr[(arr.length/2)-1] + arr[arr.length/2])/2.0 ;
    //     }
    //     else{
    //         median=arr[(arr.length/2)];
    //     }
    //     return median;

        int n=nums1.length;
        int m=nums2.length;
        int[] nums=new int[n+m];
        for(int i=0;i<n;i++){
            nums[i]=nums1[i];
        }
        for(int i=0;i<m;i++){
            nums[n+i]=nums2[i];
        }
        Arrays.sort(nums);
        double median;
        if(nums.length%2==0){
            median=(nums[(nums.length/2)-1]+nums[(nums.length/2)])/2.0;
        }
        else{
            median=nums[nums.length/2];
        }
        return median;

    }
}
