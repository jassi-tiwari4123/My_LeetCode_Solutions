class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        int x=n/20;
        double len=n-2*x;
        double sum=0;
        for(int i=x;i<n-x;i++){
            sum+=arr[i];
        }
        return sum/len;
    }
}