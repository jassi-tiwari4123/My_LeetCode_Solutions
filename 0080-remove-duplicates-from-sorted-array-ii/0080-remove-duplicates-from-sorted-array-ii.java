class Solution {
    public int removeDuplicates(int[] arr) {
        int count=1;
        int i=1;
        for(int j=1;j<arr.length;j++){
            if(arr[j]==arr[j-1]){
                count++;
            }
            else{
                count=1;
            }
            if(count<=2){
                arr[i]=arr[j];
                i++;
            }
        }
        return i;
    }
}