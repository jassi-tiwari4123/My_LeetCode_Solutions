class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n=arr.length;
        int max=arr[0];
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(max==i){
                count++;
            }
        }
        return count;
    }
}