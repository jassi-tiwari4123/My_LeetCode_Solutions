class Solution {
    public int findLucky(int[] arr) {
        int n=arr.length;
        int ans=-1;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int x:arr){
            hm.put(x,hm.getOrDefault(x,0)+1);
        }
        for(Map.Entry<Integer,Integer> mp:hm.entrySet()){
            int key=mp.getKey();
            int val=mp.getValue();
            if(key==val){
                ans=Math.max(ans,key);
            }
        }
        return ans;
    }
}