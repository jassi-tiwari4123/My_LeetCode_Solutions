class Solution {
    public int countValidSelections(int[] nums) {
        int n=nums.length;
        int res=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                if(fxn(nums,i,-1)){
                    res++;
                }
                if(fxn(nums,i,1)){
                    res++;
                }
            }
        }
        return res;
    }
    public boolean fxn(int[] nums,int idx,int direction){
        int n=nums.length;
        int[] arr=nums.clone();
        int start=idx;
        int dir=direction;
        while(start>=0 && start<n){
            if(arr[start]==0){
                start+=dir;
            }
            else{
                arr[start]--;
                dir*=-1;
                start+=dir;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                return false;
            }
        }
        return true;
    }
}