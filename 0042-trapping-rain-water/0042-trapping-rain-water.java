class Solution {
    public int trap(int[] height) {
        // int n=height.length;
        // int[] prefmax=new int[n];
        // int[] suffmax=new int[n];
        // prefmax[0]=height[0];
        // suffmax[n-1]=height[n-1];
        // for(int i=1;i<n;i++){
        //     prefmax[i]=Math.max(prefmax[i-1],height[i]);
        // }
        // for(int i=n-2;i>=0;i--){
        //     suffmax[i]=Math.max(suffmax[i+1],height[i]);
        // }
        // int total=0;
        // for(int i=0;i<n;i++){
        //     int leftMax=prefmax[i];
        //     int rightMax=suffmax[i];
        //     if(height[i]<leftMax && height[i]<rightMax){
        //         total+=Math.min(leftMax,rightMax)-height[i];
        //     }
        // }
        // return total;

        int n=height.length;
        int leftMax=0;
        int rightMax=0;
        int total=0;
        int left=0;
        int right=n-1;
        while(left<right){
            if(height[left]<=height[right]){
                if(leftMax>height[left]){
                    total+=leftMax-height[left];
                }
                else{
                    leftMax=height[left];
                    
                }
                left++;
            }
            else{
                if(rightMax>height[right]){
                    total+=rightMax-height[right];
                }
                else{
                    rightMax=height[right];
                }
                right--;
            }
        }
        return total;
    }
}