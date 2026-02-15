class Solution {
    public int totalFruit(int[] nums) {
        //brute force O(n^2) but will give tle
        // int n=nums.length;
        // int maxLen=0;
        // for(int i=0;i<n;i++){
        //     HashSet<Integer> s=new HashSet<>();
        //     for(int j=i;j<n;j++){
        //         s.add(nums[j]);
        //         if(s.size()<=2){
        //             maxLen=Math.max(maxLen,j-i+1);
        //         }
        //         else{
        //             break;
        //         }
        //     }
        // }
        // return maxLen;


        //better
        int n=nums.length;
        int l=0;
        int r=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        int maxLen=0;
        while(r<n){
            hm.put(nums[r],hm.getOrDefault(nums[r],0)+1);
            if(hm.size()>2){
                if(l<r){
                    hm.put(nums[l],hm.getOrDefault(nums[l],0)-1);
                    if(hm.get(nums[l])==0) hm.remove(nums[l]);
                    l++;
                }
                
            }
            maxLen=Math.max(maxLen,r-l+1);
            r++;
        }
        return maxLen;
    }
}