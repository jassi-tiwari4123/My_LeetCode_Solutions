class Solution {
    public int countSpecialIntegers(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        HashMap<Integer,int[]> ind=new HashMap<>();
        for(int i=0;i<n;i++){
            if(!ind.containsKey(nums[i])){
                ind.put(nums[i],new int[]{i,i});
            }
            else{
                ind.get(nums[i])[1]=i;
            }
        }
        int count=0;
        for(Map.Entry<Integer,int[]> mp:ind.entrySet()){
            int key=mp.getKey();
            int[] val=mp.getValue();
            int cnt=val[1]-val[0]+1;
            if(cnt==hm.get(key))  count++;
        }
        return count;
    }
}