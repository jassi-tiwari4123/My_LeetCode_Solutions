class Solution {
    public int[] transformArray(int[] arr) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                arr[i]=0;
            }
            else{
                arr[i]=1;
            }
        }
        Arrays.sort(arr);
        return arr;
    }
}