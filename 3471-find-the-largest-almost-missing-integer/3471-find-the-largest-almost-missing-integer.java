class Solution {
    public int largestInteger(int[] nums, int k) {
        int n=nums.length;
        int max=-1;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<=n-k;i++){
            HashSet<Integer> hs=new HashSet<>();
            for(int j=i;j<i+k;j++){
                hs.add(nums[j]);
            }
            for(int x:hs){
                hm.put(x,hm.getOrDefault(x,0)+1);
            }
        }
        for(Map.Entry<Integer,Integer> mp:hm.entrySet()){
            int key=mp.getKey();
            int val=mp.getValue();
            if(val==1){
                max=Math.max(key,max);
            }
        }
        return max;
    }
}