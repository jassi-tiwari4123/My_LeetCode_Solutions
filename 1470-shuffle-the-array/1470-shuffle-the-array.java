class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res=new int[2*n];
        int i=0;
        int j=n;
        int ind=0;
        while(i<j && j<2*n){
            res[ind++]=nums[i];
            res[ind++]=nums[j];
            i++;
            j++;
        }
        return res;
    }
}