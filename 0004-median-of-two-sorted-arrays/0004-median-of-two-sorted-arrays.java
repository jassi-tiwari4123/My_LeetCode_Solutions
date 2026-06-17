class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        //my approach but TC-O((n+m)log(n+m))
        // int n=nums1.length;
        // int m=nums2.length;
        // int[] nums=new int[n+m];
        // for(int i=0;i<n;i++){
        //     nums[i]=nums1[i];
        // }
        // for(int i=0;i<m;i++){
        //     nums[n+i]=nums2[i];
        // }
        // Arrays.sort(nums);
        // double median;
        // if(nums.length%2==0){
        //     median=(nums[(nums.length/2)-1]+nums[(nums.length/2)])/2.0;
        // }
        // else{
        //     median=nums[nums.length/2];
        // }
        // return median;



        //optimised TC-O(log(n+m))
        // int n=nums1.length;int m=nums2.length;
        // if(n>m){
        //     return findMedianSortedArrays(nums2,nums1);
        // }
        // int size=n+m;
        // int left=(n+m+1)/2;
        // int low=0;
        // int high=n;
        // while(low<=high){
        //     int mid1=low+(high-low)/2;int mid2=left-mid1;
        //     int l1=Integer.MIN_VALUE;int l2=Integer.MIN_VALUE;
        //     int r1=Integer.MAX_VALUE;int r2=Integer.MAX_VALUE;
        //     if(mid1<n) r1=nums1[mid1];if(mid2<m) r2=nums2[mid2];
        //     if(mid1-1>=0) l1=nums1[mid1-1];
        //     if(mid2-1>=0) l2=nums2[mid2-1];
        //     if(l1<=r2 && l2<=r1){
        //         if(size%2==1){
        //             return Math.max(l1,l2);
        //         }
        //         return (double)(Math.max(l1,l2)+Math.min(r1,r2))/2.0;
            // }
        //     else if(l1>r2) high=mid1-1;
        //     else low=mid1+1;
        // }
        // return 0.0;

        // //o(n+m)
        // int n=nums1.length;
        // int m=nums2.length;
        // int[] merged=new int[n+m];
        // int i=0;
        // int j=0;
        // int k=0;
        // while(i<n && j<m){
        //     if(nums1[i]<=nums2[j]){
        //         merged[k++]=nums1[i++];
        //     }
        //     else{
        //         merged[k++]=nums2[j++];
        //     }
        // }
        // while(i<n){
        //     merged[k++]=nums1[i++];
        // }
        // while(j<m){
        //     merged[k++]=nums2[j++];
        // }
        // if((n+m)%2==0){
        //     return (merged[((n+m)/2)-1]+merged[(n+m)/2])/2.0;
        // }
        // else{
        //     return merged[(n+m)/2];
        // }


        //O(Log(min(n,m)))
        

        if(nums1.length>nums2.length){
            return findMedianSortedArrays(nums2,nums1);
        }
        int n=nums1.length;
        int m=nums2.length;
        int low=0;
        int high=n;

        while(low<=high){

            int mid1=low+(high-low)/2;
            int mid2=(n+m+1)/2-mid1;

            int left1=(mid1==0)?Integer.MIN_VALUE:nums1[mid1-1];
            int left2=(mid2==0)?Integer.MIN_VALUE:nums2[mid2-1];

            int right1=(mid1==n)?Integer.MAX_VALUE:nums1[mid1];
            int right2=(mid2==m)?Integer.MAX_VALUE:nums2[mid2];

            if(left1<=right2 && left2<=right1){
                if((n+m)%2==0){
                    return (Math.max(left1,left2)+Math.min(right1,right2))/2.0;
                }
                else{
                    return Math.max(left1,left2);
                }
            }

            else if(left1>right2){
                high=mid1-1;
            }
            else{
                low=mid1+1;
            }
        }
        return 0.0;
    }
}
