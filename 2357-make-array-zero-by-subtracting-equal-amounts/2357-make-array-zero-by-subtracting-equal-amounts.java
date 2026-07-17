class Solution {
    public int minimumOperations(int[] nums) {
        //using hashmap-->best
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int x:nums){
            if(x>0){
                hm.put(x,hm.getOrDefault(x,0)+1);
            }
        }
        return hm.size();

        //another 
        // Arrays.sort(nums);
        // int res=0;
        // int prev=-1;
        // for(int x:nums){
        //     if(x>0 && x!=prev){
        //         res++;
        //         prev=x;
        //     }
        // }
        // return res;


        //using simulation as given in ques
        // int res=0;
        // while(true){
        //     int min=Integer.MAX_VALUE;
        //     for(int x:nums){
        //         if(x>0){
        //             min=Math.min(x,min);
        //         }
        //     }
        //     if(min==Integer.MAX_VALUE) break;
        //     for(int i=0;i<nums.length;i++){
        //         if(nums[i]>0){
        //             nums[i]-=min;
        //         }
        //     }
        //     res++;
        // }
        // return res;
    }
}