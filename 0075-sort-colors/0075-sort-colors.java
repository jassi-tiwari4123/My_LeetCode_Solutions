class Solution {
    public void sortColors(int[] arr) {
        //Dutch national flag algorithm
        // from 0 to low-1=all elements are 0
        // from low to mid-1=all elements are 1
        // from mid to high=all elements are unsorted
        // high to n-1=all elements are 2
        int low=0;
        int mid=0;
        int high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,mid,low);
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                swap(arr,mid,high);
                high--;
            }
        }
    }
    public void swap(int[] arr,int first,int last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
}