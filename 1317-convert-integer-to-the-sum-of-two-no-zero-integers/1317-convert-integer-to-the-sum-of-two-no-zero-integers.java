class Solution {
    public int[] getNoZeroIntegers(int n) {
        int [] arr=new int[2];
        for(int i=1;i<n;i++){
            int sum=n-i;
            if(!String.valueOf(i).contains("0") && !String.valueOf(sum).contains("0")){
                arr[0]=i;
                arr[1]=sum;
            }
        }
        return arr;
    }
}