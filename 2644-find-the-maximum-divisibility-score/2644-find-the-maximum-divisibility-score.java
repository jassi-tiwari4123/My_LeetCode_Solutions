class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int n=divisors.length;
        int m=nums.length;
        // int max=Integer.MIN_VALUE;
        int ans=Integer.MAX_VALUE;
        //hashmap
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            int div=divisors[i]; 
            int count=0;          
            for(int j=0;j<m;j++){
                if(nums[j]%div==0){
                    count++;
                }
            }
            hm.put(div,count);
        }
        int max=Integer.MIN_VALUE;
        for(int x:hm.values()){
            max=Math.max(max,x);
        }
        for(Map.Entry<Integer,Integer> mp:hm.entrySet()){
            int key=mp.getKey();
            if(hm.get(key)==max){
                ans=Math.min(ans,key);
            }
        }
        return ans;
    }
}