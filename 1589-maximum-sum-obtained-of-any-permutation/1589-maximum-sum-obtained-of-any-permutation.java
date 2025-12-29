class Solution {
    public int maxSumRangeQuery(int[] nums, int[][] requests) {
        long Mod=1000000007;
        int n=nums.length;
        int m=requests.length;
        int[] diff=new int[n];
        for(int i=0;i<m;i++){
            diff[requests[i][0]]+=1;
            if(requests[i][1]+1<n){
                diff[requests[i][1]+1]-=1;
            }
        }
        for(int i=1;i<n;i++){
            diff[i]+=diff[i-1];
        }
        Arrays.sort(nums);
        Arrays.sort(diff);
        long res=0;
        for(int i=0;i<n;i++){
            
            res = (res + ((long) nums[i] * diff[i]) % Mod) % Mod;

        }
        return (int)res;
    }
}