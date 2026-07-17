class Solution {
    public int minimumOperations(int[] nums) {
        //using hashmap
        // HashMap<Integer,Integer> hm=new HashMap<>();
        // for(int x:nums){
        //     if(x>0){
        //         hm.put(x,hm.getOrDefault(x,0)+1);
        //     }
        // }
        // return hm.size();

        //another
        Arrays.sort(nums);
        int res=0;
        int prev=-1;
        for(int x:nums){
            if(x>0 && x!=prev){
                res++;
                prev=x;
            }
        }
        return res;
    }
}