class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        int maxInd=-1;
        int minInd=-1;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
                maxInd=i;
            }
            if(nums[i]<min){
                min=nums[i];
                minInd=i;
            }
        }
        int front=Math.max(minInd,maxInd)+1;
        int back=n-Math.min(minInd,maxInd);
        int mix1=(maxInd+1)+(n-minInd);
        int mix2=(minInd+1)+(n-maxInd);
        return Math.min(front,Math.min(back,Math.min(mix1,mix2)));
    }
}