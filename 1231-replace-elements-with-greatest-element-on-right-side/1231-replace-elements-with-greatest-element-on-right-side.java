class Solution {
    public int[] replaceElements(int[] arr) {
        int[] ans=new int[arr.length];
        int maxim=-1;
        for(int i=arr.length-1;i>=0;i--){
            ans[i]=maxim;
            maxim=Math.max(maxim,arr[i]);
        }
        return ans;
    }
}