class Solution {
    public int maximumSum(int[] nums) {
        int n=nums.length;
        int res=-1;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            int sum=sumD(nums[i]);
            if(hm.containsKey(sum)){
                res=Math.max(res,nums[i]+hm.get(sum));
                hm.put(sum,Math.max(hm.get(sum),nums[i]));
            }
            else{
                hm.put(sum,nums[i]);
            }
        }
        return res;
        
    }
    public int sumD(int n){
        int sum=0;
        while(n>0){
            int dig=n%10;
            sum+=dig;
            n/=10;
        }
        return sum;
    }
}