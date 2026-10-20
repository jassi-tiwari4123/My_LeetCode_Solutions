class Solution {
    public int sortableIntegers(int[] nums) {
        int n=nums.length;
        int[] sorted=nums.clone();
        Arrays.sort(sorted);
        int res=0;
        for(int i=1;i<=n;i++){
            if(n%i!=0) continue;
            boolean all=true;
            for(int j=0;j<n;j+=i){
                if(!isRotation(nums,sorted,j,i)){
                    all=false;
                    break;
                }
            }
            if(all) res+=i;
        }
        return res;
    }
    public boolean isRotation(int[] nums,int[] sorted,int start,int k){
        for(int shift=0;shift<k;shift++){
            if(nums[start]!=sorted[start+shift>=start+k ? start+shift-k : start+shift]){
                continue;
            }
            boolean same=true;
            for (int j=0;j<k;j++){
                int index=start+(shift+j)%k;
                if(nums[start+j]!=sorted[index]){
                    same=false;
                    break;
                }
            }
            if(same) return true;
        }
        return false;
    }
}