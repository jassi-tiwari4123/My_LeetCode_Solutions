class Solution {
    public int[] sumZero(int n) {
        int i=0;
        int[] arr=new int[n];
        int num=n/2;
        while(i<n/2){
            arr[i]=num;
            num=num-1;
            i++;
        }
        int k=0;
        while(k<n/2){
            arr[i+k]=-(arr[k]);
            k++;
        }
        return arr;
    }
}